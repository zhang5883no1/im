package im.socket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import im.dao.LessonInfoRepository;
import im.dao.MessageInfoRepository;
import im.entity.Constant;
import im.entity.LessonInfo;
import im.entity.MessageInfo;
import im.util.HtmlFilter;

@Component
public class MessageCachePool {
	@Value("${message.cache.pool.size}")
	private int msgSize;
	
	@Autowired MessageInfoRepository messageDao;
	@Autowired LessonInfoRepository lessonDao;
		
	private LinkedList<MessageInfo> msgList=new LinkedList<MessageInfo>();
	
	private MessageInfo topInfo=new MessageInfo();
	
	private MessageInfo scrolInfo=new MessageInfo();
	
	private List<LessonInfo> lessons=new ArrayList<LessonInfo>();

	public LinkedList<MessageInfo> getMsgList() {
		return msgList;
	}
	
	public MessageInfo getTopInfo() {
		return topInfo;
	}

	public void setTopInfo(MessageInfo topInfo) {
		this.topInfo = topInfo;
	}

	public MessageInfo getScrolInfo() {
		return scrolInfo;
	}

	public void setScrolInfo(MessageInfo scrolInfo) {
		this.scrolInfo = scrolInfo;
	}
	

	public List<LessonInfo> getLessons() {
		return lessons;
	}

	public void setLessons(List<LessonInfo> lessons) {
		this.lessons = lessons;
	}

	public void addMessageInfo(MessageInfo msginfo){
		if(Constant.MSG_TYPE_SCROL.equals(msginfo.getMsgType())){
			setScrolInfo(msginfo);
		}else if(Constant.MSG_TYPE_TOP.equals(msginfo.getMsgType())){
			setTopInfo(msginfo);
		}else{
			if(msgList.size()>=msgSize){
				msgList.removeFirst();
			}
			msgList.addLast(msginfo);
		}
		messageDao.save(msginfo);
	}
	
	public void initMsg(){
		Sort sort = new Sort(Sort.Direction.DESC, "times");  
		Pageable pageable = new PageRequest(0, msgSize, sort); 
		Page<MessageInfo> page=messageDao.findAll(pageable);
		List<MessageInfo> infos=page.getContent();
		for(int i=infos.size()-1;i>-1;i--){
			addMessageInfo(infos.get(i));
		}
	}
	
	public void initTopInfo(){
		Sort sort = new Sort(Sort.Direction.DESC, "times");  
		Pageable pageable = new PageRequest(0, 1, sort); 
		Page<MessageInfo> page=messageDao.findByMsgType(Constant.MSG_TYPE_TOP,pageable);
		List<MessageInfo> infos=page.getContent();
		addMessageInfo(infos.get(0));
	}

	public void initLesson() {
		// TODO Auto-generated method stub
		Iterator<LessonInfo> lessonIt=lessonDao.findAll().iterator();
		this.lessons.clear();
		while(lessonIt.hasNext()){
			LessonInfo info=lessonIt.next();
//			list.add(info.getId().intValue(), info);
			this.lessons.add(info.getId().intValue()-1, info);
		}
		
	}
	

}
