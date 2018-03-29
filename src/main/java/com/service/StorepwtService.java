package com.service;

import com.service.dto.StorepwtDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Service Interface for managing Storepwt.
 */
public interface StorepwtService {

    /**
     * Save a storepwt.
     *
     * @param storepwtDTO the entity to save
     * @return the persisted entity
     */
    StorepwtDTO save(StorepwtDTO storepwtDTO);

    /**
     *  Get all the storepwts.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<StorepwtDTO> findAll(Pageable pageable);

    /**
     *  Get the "id" storepwt.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    StorepwtDTO findOne(Long id);

    /**
     *  Delete the "id" storepwt.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
    
    Page<StorepwtDTO> findByStrnum(Long strnum, Pageable pageable);
    
    void  updateOts(Long otsadj, Long currentots, Long origpct, Long id);
}
