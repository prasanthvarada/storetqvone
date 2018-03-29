package com.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Storepwt;
import com.repository.StorepwtCustomRepository;
import com.repository.StorepwtRepository;
import com.service.StorepwtServiceCustom;
import com.service.mapper.StorepwtMapper;

@Service
@Transactional
public class StorepwtServiceImplCustom implements StorepwtServiceCustom{
	
	private final Logger log = LoggerFactory.getLogger(StorepwtServiceImplCustom.class);
    
    private final StorepwtCustomRepository storepwtCustomRepository;
    
    private final StorepwtMapper storepwtMapper;
    
    public StorepwtServiceImplCustom(StorepwtCustomRepository storepwtCustomRepository, StorepwtMapper storepwtMapper) {
        this.storepwtCustomRepository = storepwtCustomRepository;
        this.storepwtMapper = storepwtMapper;
    }

    @Override
    public List<Storepwt> findByDeptAndGroups(Long deptnum, Long groups, Long pages){
    	return storepwtCustomRepository.findByDeptAndGroups(deptnum, groups, pages);
    }
    
    @Override
    public List<Storepwt> findByDeptAndDc(Long deptnum, Long groups, Long pages, Optional<Long> dcnum, Optional<Long> strnum ) {
    	return storepwtCustomRepository.findByDeptAndDc(deptnum, groups, pages, dcnum, strnum);
    }
    
    @Override
    public List<Storepwt> findByDeptAndDcOnly(Long deptnum, Long groups, Long pages, Optional<Long> dcnum ) {
    	return storepwtCustomRepository.findByDeptAndDcOnly(deptnum, groups, pages, dcnum);
    }

    
}
