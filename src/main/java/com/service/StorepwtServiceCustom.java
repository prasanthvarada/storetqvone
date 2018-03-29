package com.service;


import com.domain.Storepwt;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

public interface StorepwtServiceCustom {
	
	List<Storepwt> findByDeptAndGroups(Long deptnum, Long groups, Long pages); //with query function
	
	List<Storepwt> findByDeptAndDc(Long deptnum, Long groups, Long pages, Optional<Long> dcnum, Optional<Long> strnum);
	
	List<Storepwt> findByDeptAndDcOnly(Long deptnum, Long groups, Long pages, Optional<Long> dcnum);
	


}
