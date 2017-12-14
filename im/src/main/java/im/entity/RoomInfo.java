package im.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity  
@Table(name="t_roominfo") 
public class RoomInfo {  
    @Id  
    @NotNull  
    private String roomNo;
    
    private String name;

	public RoomInfo(String roomNo, String name) {
		super();
		this.roomNo = roomNo;
		this.name = name;
	}

	public RoomInfo() {
		super();
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
