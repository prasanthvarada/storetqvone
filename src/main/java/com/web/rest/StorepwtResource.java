package com.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.domain.Storepwt;
import com.repository.StorepwtCustomRepository;
import com.service.StorepwtService;
import com.service.StorepwtServiceCustom;
import com.web.rest.util.HeaderUtil;
import com.web.rest.util.PaginationUtil;
import com.service.dto.StorepwtDTO;
import io.swagger.annotations.ApiParam;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
 * REST controller for managing Storepwt.
 */
@RestController
@RequestMapping("/api")
public class StorepwtResource {

    private final Logger log = LoggerFactory.getLogger(StorepwtResource.class);

    private static final String ENTITY_NAME = "storepwt";
        
    private final StorepwtService storepwtService;
    
    private final StorepwtServiceCustom storepwtServiceCustom;
    
    @Autowired
    private StorepwtCustomRepository custom;

    public StorepwtResource(StorepwtService storepwtService, StorepwtServiceCustom storepwtServiceCustom) {
        this.storepwtService = storepwtService;
        this.storepwtServiceCustom = storepwtServiceCustom;
    }

    /**
     * POST  /storepwts : Create a new storepwt.
     *
     * @param storepwtDTO the storepwtDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new storepwtDTO, or with status 400 (Bad Request) if the storepwt has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/storepwts")
    @Timed
    public ResponseEntity<StorepwtDTO> createStorepwt(@RequestBody StorepwtDTO storepwtDTO) throws URISyntaxException {
        log.debug("REST request to save Storepwt : {}", storepwtDTO);
        if (storepwtDTO.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new storepwt cannot already have an ID")).body(null);
        }
        StorepwtDTO result = storepwtService.save(storepwtDTO);
        return ResponseEntity.created(new URI("/api/storepwts/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /storepwts : Updates an existing storepwt.
     *
     * @param storepwtDTO the storepwtDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated storepwtDTO,
     * or with status 400 (Bad Request) if the storepwtDTO is not valid,
     * or with status 500 (Internal Server Error) if the storepwtDTO couldnt be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/storepwts")
    @Timed
    public ResponseEntity<StorepwtDTO> updateStorepwt(@RequestBody StorepwtDTO storepwtDTO) throws URISyntaxException {
        log.debug("REST request to update Storepwt : {}", storepwtDTO);
        if (storepwtDTO.getId() == null) {
            return createStorepwt(storepwtDTO);
        }
        StorepwtDTO result = storepwtService.save(storepwtDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, storepwtDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /storepwts : get all the storepwts.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of storepwts in body
     * @throws URISyntaxException if there is an error to generate the pagination HTTP headers
     */
    @GetMapping("/storepwts")
    @Timed
    public ResponseEntity<List<StorepwtDTO>> getAllStorepwts(@ApiParam Pageable pageable)
        throws URISyntaxException {
        log.debug("REST request to get a page of Storepwts");
        Page<StorepwtDTO> page = storepwtService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/storepwts");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /storepwts/:id : get the "id" storepwt.
     *
     * @param id the id of the storepwtDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the storepwtDTO, or with status 404 (Not Found)
     */
    @GetMapping("/storepwts/{id}")
    @Timed
    public ResponseEntity<StorepwtDTO> getStorepwt(@PathVariable Long id) {
        log.debug("REST request to get Storepwt : {}", id);
        StorepwtDTO storepwtDTO = storepwtService.findOne(id);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(storepwtDTO));
    }

    @GetMapping("/storeby/{strnum}")
    @Timed
    public ResponseEntity<List<StorepwtDTO>> getStoreby(@PathVariable Long strnum, @ApiParam Pageable pageable) throws URISyntaxException {
    	System.out.println("~~~~~~~~~~~~~~~~~~~~strnum value :"+strnum);
    	System.out.println("~~~~~~~~~~~~~~~~~~~~before coming to logger :"+strnum);
    	log.debug("REST request to get Storepwt : {}", strnum);
    	System.out.println("~~~~~~~~~~~~~~~~~~~~after coming from logger :"+strnum);
    	Page<StorepwtDTO> page = storepwtService.findByStrnum(strnum, pageable);
    	 HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/storeby/{strnum}");
         return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
     }	
    
    //method for with query function - working
    @GetMapping(value = { "/storeby/{deptnum}/{groups}/{pages}", "/storeby/{deptnum}/{groups}/{pages}/{dcnum}", "/storeby/{deptnum}/{groups}/{pages}/{dcnum}/{strnum}" })
	public ResponseEntity<List<Storepwt>> getDeptPlan(@PathVariable String deptnum, @PathVariable String groups, @PathVariable String pages, @PathVariable Optional<Long> dcnum, @PathVariable Optional<Long> strnum) {
    	Long deptnumz = Long.parseLong(deptnum);
    	Long groupsz = Long.parseLong(groups);
    	Long pagesz = Long.parseLong(pages);
    	if (dcnum.isPresent() && strnum.isPresent())
    	{
    		System.out.println("Came to dc and strnum block ~~~~~~~~~~~~~~~~~~~~");
    		List<Storepwt> storepwts = storepwtServiceCustom.findByDeptAndDc(deptnumz, groupsz, pagesz, dcnum, strnum);
    		return new ResponseEntity<List<Storepwt>>(storepwts, HttpStatus.OK);
    	}
    	else if (dcnum.isPresent() && !(strnum.isPresent()))
    	{
    		System.out.println("Came to only dc block ~~~~~~~~~~~~~~~~~");
    		List<Storepwt> storepwts = storepwtServiceCustom.findByDeptAndDcOnly(deptnumz, groupsz, pagesz, dcnum);
    		return new ResponseEntity<List<Storepwt>>(storepwts, HttpStatus.OK);
    	}
    	else{
    		System.out.println("Came to dc else block ~~~~~~~~~~~~~~~~~~~~~~~~~~");
    		List<Storepwt> storepwts = storepwtServiceCustom.findByDeptAndGroups(deptnumz, groupsz, pagesz);
    		return new ResponseEntity<List<Storepwt>>(storepwts, HttpStatus.OK);
		//return storepwts;
		 //HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/storeby/{strnum}/{groups}");
		  	}
    	}
    
    @PutMapping("/updateOTS/{otsadj}/{currentots}/{origpct}/{id}")
    @Timed
    public ResponseEntity<Void> updateOtsStore(@PathVariable Long otsadj, @PathVariable Long currentots, @PathVariable Long origpct, @PathVariable Long id) {
    	System.out.println(" came inside update method ~~~~~~~~~~~~~~~~~######");
    	System.out.println("~~~~~~~~~ The vals are: id is: "+id+ " and otsadj is: "+otsadj+" and "+currentots+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        log.debug("REST request to update Storeparent : {}", id);
        storepwtService.updateOts(otsadj,currentots, origpct, id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, id.toString())).build();
    }
    
    /**
     * DELETE  /storepwts/:id : delete the "id" storepwt.
     *
     * @param id the id of the storepwtDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/storepwts/{id}")
    @Timed
    public ResponseEntity<Void> deleteStorepwt(@PathVariable Long id) {
        log.debug("REST request to delete Storepwt : {}", id);
        storepwtService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

}
