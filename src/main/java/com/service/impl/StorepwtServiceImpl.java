package com.service.impl;

import com.service.StorepwtService;
import com.domain.Storepwt;
import com.repository.StorepwtRepository;
import com.service.dto.StorepwtDTO;
import com.service.mapper.StorepwtMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing Storepwt.
 */
@Service
@Transactional
public class StorepwtServiceImpl implements StorepwtService{

    private final Logger log = LoggerFactory.getLogger(StorepwtServiceImpl.class);
    
    private final StorepwtRepository storepwtRepository;

    private final StorepwtMapper storepwtMapper;

    public StorepwtServiceImpl(StorepwtRepository storepwtRepository, StorepwtMapper storepwtMapper) {
        this.storepwtRepository = storepwtRepository;
        this.storepwtMapper = storepwtMapper;
    }

    /**
     * Save a storepwt.
     *
     * @param storepwtDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public StorepwtDTO save(StorepwtDTO storepwtDTO) {
        log.debug("Request to save Storepwt : {}", storepwtDTO);
        Storepwt storepwt = storepwtMapper.storepwtDTOToStorepwt(storepwtDTO);
        storepwt = storepwtRepository.save(storepwt);
        StorepwtDTO result = storepwtMapper.storepwtToStorepwtDTO(storepwt);
        return result;
    }

    /**
     *  Get all the storepwts.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<StorepwtDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Storepwts");
        Page<Storepwt> result = storepwtRepository.findAll(pageable);
        return result.map(storepwt -> storepwtMapper.storepwtToStorepwtDTO(storepwt));
    }

    /**
     *  Get one storepwt by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public StorepwtDTO findOne(Long id) {
        log.debug("Request to get Storepwt : {}", id);
        Storepwt storepwt = storepwtRepository.findOne(id);
        StorepwtDTO storepwtDTO = storepwtMapper.storepwtToStorepwtDTO(storepwt);
        return storepwtDTO;
    }

    /**
     *  Delete the  storepwt by id.
     *
     *  @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Storepwt : {}", id);
        storepwtRepository.delete(id);
    }
    
    @Override
    //@Transactional(readOnly = true)
    public Page<StorepwtDTO> findByStrnum(Long strnum, Pageable pageable) {
        log.debug("Request to get Storepwt : {}", strnum);
        Page<Storepwt> result=  storepwtRepository.findByStrnum(strnum, pageable);
        return result.map(storepwt -> storepwtMapper.storepwtToStorepwtDTO(storepwt));
    }
    
    @Override
 	public void updateOts(Long otsadj,Long currentots, Long origpct, Long id) {
 		// TODO Auto-generated method stub
    	storepwtRepository.updateOts(otsadj,currentots, origpct, id);
 	}
    
}
