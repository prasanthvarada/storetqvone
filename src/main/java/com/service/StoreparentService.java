package com.service;

import com.service.dto.StoreparentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Service Interface for managing Storeparent.
 */
public interface StoreparentService {

    /**
     * Save a storeparent.
     *
     * @param storeparentDTO the entity to save
     * @return the persisted entity
     */
    StoreparentDTO save(StoreparentDTO storeparentDTO);

    /**
     *  Get all the storeparents.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<StoreparentDTO> findAll(Pageable pageable);

    /**
     *  Get the "id" storeparent.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    StoreparentDTO findOne(Long id);

    /**
     *  Delete the "id" storeparent.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
