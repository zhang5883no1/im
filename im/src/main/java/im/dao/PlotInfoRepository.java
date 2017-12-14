package im.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import im.entity.PlotInfo;

public interface PlotInfoRepository extends CrudRepository<PlotInfo, String>{  
    
    @Cacheable
    List<PlotInfo> findByDateTimeGreaterThan(long datetime,Sort sort);
}
