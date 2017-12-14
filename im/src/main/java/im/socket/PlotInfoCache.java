package im.socket;

import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import im.dao.PlotInfoRepository;
import im.entity.PlotInfo;

@Component
public class PlotInfoCache {

	@Autowired
	private PlotInfoRepository plotInfoRepository;
	
	private List<PlotInfo> newPlotInfo=new LinkedList<PlotInfo>();
	private List<PlotInfo> oldPlotInfo=new LinkedList<PlotInfo>();
	
	public List<PlotInfo> getNewPlotInfo() {
		return newPlotInfo;
	}
	public void setNewPlotInfo(List<PlotInfo> newPlotInfo) {
		this.newPlotInfo = newPlotInfo;
	}
	public List<PlotInfo> getOldPlotInfo() {
		return oldPlotInfo;
	}
	public void setOldPlotInfo(List<PlotInfo> oldPlotInfo) {
		this.oldPlotInfo = oldPlotInfo;
	}
	
	public void updateInfo(){
//		System.out.println("------------in----------------");
		Sort sort = new Sort(Sort.Direction.DESC, "orderno");  
		//当天凌晨时间
		long datetime=System.currentTimeMillis()/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault().getRawOffset();
		//上周
		long agoDateTime=datetime-1000*3600*24*7;
		//获取上周至今所有信息
		List<PlotInfo> list=plotInfoRepository.findByDateTimeGreaterThan(agoDateTime, sort);
		newPlotInfo.clear();
		oldPlotInfo.clear();
		for(PlotInfo info:list){
//			System.out.println("*****info:"+info.getOrderno()+" ,time is :"+(info.getDateTime()>datetime)+",time:"+info.getDateTime()+",oldtime:"+agoDateTime);
			//时间大于当天凌晨的加入新队列
			if(info.getDateTime()>datetime){
				newPlotInfo.add(info);
			}else{
				oldPlotInfo.add(info);
			}
		}
	}
	
}
