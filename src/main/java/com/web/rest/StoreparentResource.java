package com.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.service.StoreparentService;
import com.web.rest.util.HeaderUtil;
import com.web.rest.util.PaginationUtil;
import com.service.dto.StoreparentDTO;
import io.swagger.annotations.ApiParam;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * REST controller for managing Storeparent.
 */
@RestController
@RequestMapping("/api")
public class StoreparentResource {

    private final Logger log = LoggerFactory.getLogger(StoreparentResource.class);

    private static final String ENTITY_NAME = "storeparent";
        
    private final StoreparentService storeparentService;

    public StoreparentResource(StoreparentService storeparentService) {
        this.storeparentService = storeparentService;
    }

    /**
     * POST  /storeparents : Create a new storeparent.
     *
     * @param storeparentDTO the storeparentDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new storeparentDTO, or with status 400 (Bad Request) if the storeparent has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/storeparents")
    @Timed
    public ResponseEntity<StoreparentDTO> createStoreparent(@RequestBody StoreparentDTO storeparentDTO) throws URISyntaxException {
        log.debug("REST request to save Storeparent : {}", storeparentDTO);
        if (storeparentDTO.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new storeparent cannot already have an ID")).body(null);
        }
        StoreparentDTO result = storeparentService.save(storeparentDTO);
        return ResponseEntity.created(new URI("/api/storeparents/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /storeparents : Updates an existing storeparent.
     *
     * @param storeparentDTO the storeparentDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated storeparentDTO,
     * or with status 400 (Bad Request) if the storeparentDTO is not valid,
     * or with status 500 (Internal Server Error) if the storeparentDTO couldnt be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/storeparents")
    @Timed
    public ResponseEntity<StoreparentDTO> updateStoreparent(@RequestBody StoreparentDTO storeparentDTO) throws URISyntaxException {
        log.debug("REST request to update Storeparent : {}", storeparentDTO);
        if (storeparentDTO.getId() == null) {
            return createStoreparent(storeparentDTO);
        }
        StoreparentDTO result = storeparentService.save(storeparentDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, storeparentDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /storeparents : get all the storeparents.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of storeparents in body
     * @throws URISyntaxException if there is an error to generate the pagination HTTP headers
     */
    @GetMapping("/storeparents")
    @Timed
    public ResponseEntity<List<StoreparentDTO>> getAllStoreparents(@ApiParam Pageable pageable)
        throws URISyntaxException {
        log.debug("REST request to get a page of Storeparents");
        Page<StoreparentDTO> page = storeparentService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/storeparents");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /storeparents/:id : get the "id" storeparent.
     *
     * @param id the id of the storeparentDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the storeparentDTO, or with status 404 (Not Found)
     */
    @GetMapping("/storeparents/{id}")
    @Timed
    public ResponseEntity<StoreparentDTO> getStoreparent(@PathVariable Long id) {
        log.debug("REST request to get Storeparent : {}", id);
        StoreparentDTO storeparentDTO = storeparentService.findOne(id);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(storeparentDTO));
    }

    /**
     * DELETE  /storeparents/:id : delete the "id" storeparent.
     *
     * @param id the id of the storeparentDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/storeparents/{id}")
    @Timed
    public ResponseEntity<Void> deleteStoreparent(@PathVariable Long id) {
        log.debug("REST request to delete Storeparent : {}", id);
        storeparentService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

}
