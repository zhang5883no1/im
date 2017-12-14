package im.dao;

import org.springframework.data.repository.CrudRepository;

import im.entity.RoomInfo;

public interface RoomInfoRepository extends CrudRepository<RoomInfo, String>{  
	
}
