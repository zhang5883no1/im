package im.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import im.dao.PlotInfoRepository;
import im.entity.PlotInfo;
import im.socket.PlotInfoCache;


@RestController
@RequestMapping("/api")
public class AjaxController {
	
	@Autowired
	private PlotInfoCache plotInfoCache;
	@Autowired
	private PlotInfoRepository plotInfoRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<PlotInfo> index(HttpServletRequest request) throws IOException{
		String type=request.getParameter("type");
		if("old".equals(type)){
			return plotInfoCache.getOldPlotInfo();
		}
		return plotInfoCache.getNewPlotInfo();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute PlotInfo info) throws IOException{
		PlotInfo pi=plotInfoRepository.findOne(info.getOrderno());
		//如果信息为空，表示新增，添加创建时间
		if(pi==null){
			info.setDateTime(new Date().getTime());
		}else{
			info.setDateTime(pi.getDateTime());
		}
		plotInfoRepository.save(info);
		plotInfoCache.updateInfo();
		return "success";
	}
	
}
