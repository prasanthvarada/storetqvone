package com.service.impl;

import com.service.StoreparentService;
import com.domain.Storeparent;
import com.repository.StoreparentRepository;
import com.service.dto.StoreparentDTO;
import com.service.mapper.StoreparentMapper;
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
 * Service Implementation for managing Storeparent.
 */
@Service
@Transactional
public class StoreparentServiceImpl implements StoreparentService{

    private final Logger log = LoggerFactory.getLogger(StoreparentServiceImpl.class);
    
    private final StoreparentRepository storeparentRepository;

    private final StoreparentMapper storeparentMapper;

    public StoreparentServiceImpl(StoreparentRepository storeparentRepository, StoreparentMapper storeparentMapper) {
        this.storeparentRepository = storeparentRepository;
        this.storeparentMapper = storeparentMapper;
    }

    /**
     * Save a storeparent.
     *
     * @param storeparentDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public StoreparentDTO save(StoreparentDTO storeparentDTO) {
        log.debug("Request to save Storeparent : {}", storeparentDTO);
        Storeparent storeparent = storeparentMapper.storeparentDTOToStoreparent(storeparentDTO);
        storeparent = storeparentRepository.save(storeparent);
        StoreparentDTO result = storeparentMapper.storeparentToStoreparentDTO(storeparent);
        return result;
    }

    /**
     *  Get all the storeparents.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<StoreparentDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Storeparents");
        Page<Storeparent> result = storeparentRepository.findAll(pageable);
        return result.map(storeparent -> storeparentMapper.storeparentToStoreparentDTO(storeparent));
    }

    /**
     *  Get one storeparent by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public StoreparentDTO findOne(Long id) {
        log.debug("Request to get Storeparent : {}", id);
        Storeparent storeparent = storeparentRepository.findOne(id);
        StoreparentDTO storeparentDTO = storeparentMapper.storeparentToStoreparentDTO(storeparent);
        return storeparentDTO;
    }

    /**
     *  Delete the  storeparent by id.
     *
     *  @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Storeparent : {}", id);
        storeparentRepository.delete(id);
    }
}
