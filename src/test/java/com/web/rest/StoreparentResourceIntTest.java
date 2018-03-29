package com.web.rest;

import com.StoretqvoneApp;

import com.domain.Storeparent;
import com.repository.StoreparentRepository;
import com.service.StoreparentService;
import com.service.dto.StoreparentDTO;
import com.service.mapper.StoreparentMapper;
import com.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the StoreparentResource REST controller.
 *
 * @see StoreparentResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StoretqvoneApp.class)
public class StoreparentResourceIntTest {

    private static final Long DEFAULT_DEPTNUM = 1L;
    private static final Long UPDATED_DEPTNUM = 2L;

    private static final Long DEFAULT_DIVNUM = 1L;
    private static final Long UPDATED_DIVNUM = 2L;

    private static final Long DEFAULT_GROUPS = 1L;
    private static final Long UPDATED_GROUPS = 2L;

    private static final Long DEFAULT_PAGES = 1L;
    private static final Long UPDATED_PAGES = 2L;

    private static final String DEFAULT_TRANSITIONAL = "AAAAAAAAAA";
    private static final String UPDATED_TRANSITIONAL = "BBBBBBBBBB";

    private static final String DEFAULT_POSTONLYIND = "AAAAAAAAAA";
    private static final String UPDATED_POSTONLYIND = "BBBBBBBBBB";

    private static final String DEFAULT_CATGNUMONE = "AAAAAAAAAA";
    private static final String UPDATED_CATGNUMONE = "BBBBBBBBBB";

    private static final String DEFAULT_CATGNUMTWO = "AAAAAAAAAA";
    private static final String UPDATED_CATGNUMTWO = "BBBBBBBBBB";

    private static final String DEFAULT_CATGNUMTHREE = "AAAAAAAAAA";
    private static final String UPDATED_CATGNUMTHREE = "BBBBBBBBBB";

    private static final String DEFAULT_CATGNUMFOUR = "AAAAAAAAAA";
    private static final String UPDATED_CATGNUMFOUR = "BBBBBBBBBB";

    private static final Long DEFAULT_BLNDOTSDEP = 1L;
    private static final Long UPDATED_BLNDOTSDEP = 2L;

    private static final Long DEFAULT_BLNDOTSGRP = 1L;
    private static final Long UPDATED_BLNDOTSGRP = 2L;

    private static final Long DEFAULT_BLNDOTSPAGE = 1L;
    private static final Long UPDATED_BLNDOTSPAGE = 2L;

    private static final String DEFAULT_CATGNUMFIVE = "AAAAAAAAAA";
    private static final String UPDATED_CATGNUMFIVE = "BBBBBBBBBB";

    private static final String DEFAULT_PLANDESC = "AAAAAAAAAA";
    private static final String UPDATED_PLANDESC = "BBBBBBBBBB";

    @Autowired
    private StoreparentRepository storeparentRepository;

    @Autowired
    private StoreparentMapper storeparentMapper;

    @Autowired
    private StoreparentService storeparentService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restStoreparentMockMvc;

    private Storeparent storeparent;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        StoreparentResource storeparentResource = new StoreparentResource(storeparentService);
        this.restStoreparentMockMvc = MockMvcBuilders.standaloneSetup(storeparentResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Storeparent createEntity(EntityManager em) {
        Storeparent storeparent = new Storeparent()
                .deptnum(DEFAULT_DEPTNUM)
                .divnum(DEFAULT_DIVNUM)
                .groups(DEFAULT_GROUPS)
                .pages(DEFAULT_PAGES)
                .transitional(DEFAULT_TRANSITIONAL)
                .postonlyind(DEFAULT_POSTONLYIND)
                .catgnumone(DEFAULT_CATGNUMONE)
                .catgnumtwo(DEFAULT_CATGNUMTWO)
                .catgnumthree(DEFAULT_CATGNUMTHREE)
                .catgnumfour(DEFAULT_CATGNUMFOUR)
                .blndotsdep(DEFAULT_BLNDOTSDEP)
                .blndotsgrp(DEFAULT_BLNDOTSGRP)
                .blndotspage(DEFAULT_BLNDOTSPAGE)
                .catgnumfive(DEFAULT_CATGNUMFIVE)
                .plandesc(DEFAULT_PLANDESC);
        return storeparent;
    }

    @Before
    public void initTest() {
        storeparent = createEntity(em);
    }

    @Test
    @Transactional
    public void createStoreparent() throws Exception {
        int databaseSizeBeforeCreate = storeparentRepository.findAll().size();

        // Create the Storeparent
        StoreparentDTO storeparentDTO = storeparentMapper.storeparentToStoreparentDTO(storeparent);

        restStoreparentMockMvc.perform(post("/api/storeparents")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(storeparentDTO)))
            .andExpect(status().isCreated());

        // Validate the Storeparent in the database
        List<Storeparent> storeparentList = storeparentRepository.findAll();
        assertThat(storeparentList).hasSize(databaseSizeBeforeCreate + 1);
        Storeparent testStoreparent = storeparentList.get(storeparentList.size() - 1);
        assertThat(testStoreparent.getDeptnum()).isEqualTo(DEFAULT_DEPTNUM);
        assertThat(testStoreparent.getDivnum()).isEqualTo(DEFAULT_DIVNUM);
        assertThat(testStoreparent.getGroups()).isEqualTo(DEFAULT_GROUPS);
        assertThat(testStoreparent.getPages()).isEqualTo(DEFAULT_PAGES);
        assertThat(testStoreparent.getTransitional()).isEqualTo(DEFAULT_TRANSITIONAL);
        assertThat(testStoreparent.getPostonlyind()).isEqualTo(DEFAULT_POSTONLYIND);
        assertThat(testStoreparent.getCatgnumone()).isEqualTo(DEFAULT_CATGNUMONE);
        assertThat(testStoreparent.getCatgnumtwo()).isEqualTo(DEFAULT_CATGNUMTWO);
        assertThat(testStoreparent.getCatgnumthree()).isEqualTo(DEFAULT_CATGNUMTHREE);
        assertThat(testStoreparent.getCatgnumfour()).isEqualTo(DEFAULT_CATGNUMFOUR);
        assertThat(testStoreparent.getBlndotsdep()).isEqualTo(DEFAULT_BLNDOTSDEP);
        assertThat(testStoreparent.getBlndotsgrp()).isEqualTo(DEFAULT_BLNDOTSGRP);
        assertThat(testStoreparent.getBlndotspage()).isEqualTo(DEFAULT_BLNDOTSPAGE);
        assertThat(testStoreparent.getCatgnumfive()).isEqualTo(DEFAULT_CATGNUMFIVE);
        assertThat(testStoreparent.getPlandesc()).isEqualTo(DEFAULT_PLANDESC);
    }

    @Test
    @Transactional
    public void createStoreparentWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = storeparentRepository.findAll().size();

        // Create the Storeparent with an existing ID
        Storeparent existingStoreparent = new Storeparent();
        existingStoreparent.setId(1L);
        StoreparentDTO existingStoreparentDTO = storeparentMapper.storeparentToStoreparentDTO(existingStoreparent);

        // An entity with an existing ID cannot be created, so this API call must fail
        restStoreparentMockMvc.perform(post("/api/storeparents")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(existingStoreparentDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<Storeparent> storeparentList = storeparentRepository.findAll();
        assertThat(storeparentList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllStoreparents() throws Exception {
        // Initialize the database
        storeparentRepository.saveAndFlush(storeparent);

        // Get all the storeparentList
        restStoreparentMockMvc.perform(get("/api/storeparents?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(storeparent.getId().intValue())))
            .andExpect(jsonPath("$.[*].deptnum").value(hasItem(DEFAULT_DEPTNUM.intValue())))
            .andExpect(jsonPath("$.[*].divnum").value(hasItem(DEFAULT_DIVNUM.intValue())))
            .andExpect(jsonPath("$.[*].groups").value(hasItem(DEFAULT_GROUPS.intValue())))
            .andExpect(jsonPath("$.[*].pages").value(hasItem(DEFAULT_PAGES.intValue())))
            .andExpect(jsonPath("$.[*].transitional").value(hasItem(DEFAULT_TRANSITIONAL.toString())))
            .andExpect(jsonPath("$.[*].postonlyind").value(hasItem(DEFAULT_POSTONLYIND.toString())))
            .andExpect(jsonPath("$.[*].catgnumone").value(hasItem(DEFAULT_CATGNUMONE.toString())))
            .andExpect(jsonPath("$.[*].catgnumtwo").value(hasItem(DEFAULT_CATGNUMTWO.toString())))
            .andExpect(jsonPath("$.[*].catgnumthree").value(hasItem(DEFAULT_CATGNUMTHREE.toString())))
            .andExpect(jsonPath("$.[*].catgnumfour").value(hasItem(DEFAULT_CATGNUMFOUR.toString())))
            .andExpect(jsonPath("$.[*].blndotsdep").value(hasItem(DEFAULT_BLNDOTSDEP.intValue())))
            .andExpect(jsonPath("$.[*].blndotsgrp").value(hasItem(DEFAULT_BLNDOTSGRP.intValue())))
            .andExpect(jsonPath("$.[*].blndotspage").value(hasItem(DEFAULT_BLNDOTSPAGE.intValue())))
            .andExpect(jsonPath("$.[*].catgnumfive").value(hasItem(DEFAULT_CATGNUMFIVE.toString())))
            .andExpect(jsonPath("$.[*].plandesc").value(hasItem(DEFAULT_PLANDESC.toString())));
    }

    @Test
    @Transactional
    public void getStoreparent() throws Exception {
        // Initialize the database
        storeparentRepository.saveAndFlush(storeparent);

        // Get the storeparent
        restStoreparentMockMvc.perform(get("/api/storeparents/{id}", storeparent.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(storeparent.getId().intValue()))
            .andExpect(jsonPath("$.deptnum").value(DEFAULT_DEPTNUM.intValue()))
            .andExpect(jsonPath("$.divnum").value(DEFAULT_DIVNUM.intValue()))
            .andExpect(jsonPath("$.groups").value(DEFAULT_GROUPS.intValue()))
            .andExpect(jsonPath("$.pages").value(DEFAULT_PAGES.intValue()))
            .andExpect(jsonPath("$.transitional").value(DEFAULT_TRANSITIONAL.toString()))
            .andExpect(jsonPath("$.postonlyind").value(DEFAULT_POSTONLYIND.toString()))
            .andExpect(jsonPath("$.catgnumone").value(DEFAULT_CATGNUMONE.toString()))
            .andExpect(jsonPath("$.catgnumtwo").value(DEFAULT_CATGNUMTWO.toString()))
            .andExpect(jsonPath("$.catgnumthree").value(DEFAULT_CATGNUMTHREE.toString()))
            .andExpect(jsonPath("$.catgnumfour").value(DEFAULT_CATGNUMFOUR.toString()))
            .andExpect(jsonPath("$.blndotsdep").value(DEFAULT_BLNDOTSDEP.intValue()))
            .andExpect(jsonPath("$.blndotsgrp").value(DEFAULT_BLNDOTSGRP.intValue()))
            .andExpect(jsonPath("$.blndotspage").value(DEFAULT_BLNDOTSPAGE.intValue()))
            .andExpect(jsonPath("$.catgnumfive").value(DEFAULT_CATGNUMFIVE.toString()))
            .andExpect(jsonPath("$.plandesc").value(DEFAULT_PLANDESC.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingStoreparent() throws Exception {
        // Get the storeparent
        restStoreparentMockMvc.perform(get("/api/storeparents/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateStoreparent() throws Exception {
        // Initialize the database
        storeparentRepository.saveAndFlush(storeparent);
        int databaseSizeBeforeUpdate = storeparentRepository.findAll().size();

        // Update the storeparent
        Storeparent updatedStoreparent = storeparentRepository.findOne(storeparent.getId());
        updatedStoreparent
                .deptnum(UPDATED_DEPTNUM)
                .divnum(UPDATED_DIVNUM)
                .groups(UPDATED_GROUPS)
                .pages(UPDATED_PAGES)
                .transitional(UPDATED_TRANSITIONAL)
                .postonlyind(UPDATED_POSTONLYIND)
                .catgnumone(UPDATED_CATGNUMONE)
                .catgnumtwo(UPDATED_CATGNUMTWO)
                .catgnumthree(UPDATED_CATGNUMTHREE)
                .catgnumfour(UPDATED_CATGNUMFOUR)
                .blndotsdep(UPDATED_BLNDOTSDEP)
                .blndotsgrp(UPDATED_BLNDOTSGRP)
                .blndotspage(UPDATED_BLNDOTSPAGE)
                .catgnumfive(UPDATED_CATGNUMFIVE)
                .plandesc(UPDATED_PLANDESC);
        StoreparentDTO storeparentDTO = storeparentMapper.storeparentToStoreparentDTO(updatedStoreparent);

        restStoreparentMockMvc.perform(put("/api/storeparents")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(storeparentDTO)))
            .andExpect(status().isOk());

        // Validate the Storeparent in the database
        List<Storeparent> storeparentList = storeparentRepository.findAll();
        assertThat(storeparentList).hasSize(databaseSizeBeforeUpdate);
        Storeparent testStoreparent = storeparentList.get(storeparentList.size() - 1);
        assertThat(testStoreparent.getDeptnum()).isEqualTo(UPDATED_DEPTNUM);
        assertThat(testStoreparent.getDivnum()).isEqualTo(UPDATED_DIVNUM);
        assertThat(testStoreparent.getGroups()).isEqualTo(UPDATED_GROUPS);
        assertThat(testStoreparent.getPages()).isEqualTo(UPDATED_PAGES);
        assertThat(testStoreparent.getTransitional()).isEqualTo(UPDATED_TRANSITIONAL);
        assertThat(testStoreparent.getPostonlyind()).isEqualTo(UPDATED_POSTONLYIND);
        assertThat(testStoreparent.getCatgnumone()).isEqualTo(UPDATED_CATGNUMONE);
        assertThat(testStoreparent.getCatgnumtwo()).isEqualTo(UPDATED_CATGNUMTWO);
        assertThat(testStoreparent.getCatgnumthree()).isEqualTo(UPDATED_CATGNUMTHREE);
        assertThat(testStoreparent.getCatgnumfour()).isEqualTo(UPDATED_CATGNUMFOUR);
        assertThat(testStoreparent.getBlndotsdep()).isEqualTo(UPDATED_BLNDOTSDEP);
        assertThat(testStoreparent.getBlndotsgrp()).isEqualTo(UPDATED_BLNDOTSGRP);
        assertThat(testStoreparent.getBlndotspage()).isEqualTo(UPDATED_BLNDOTSPAGE);
        assertThat(testStoreparent.getCatgnumfive()).isEqualTo(UPDATED_CATGNUMFIVE);
        assertThat(testStoreparent.getPlandesc()).isEqualTo(UPDATED_PLANDESC);
    }

    @Test
    @Transactional
    public void updateNonExistingStoreparent() throws Exception {
        int databaseSizeBeforeUpdate = storeparentRepository.findAll().size();

        // Create the Storeparent
        StoreparentDTO storeparentDTO = storeparentMapper.storeparentToStoreparentDTO(storeparent);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restStoreparentMockMvc.perform(put("/api/storeparents")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(storeparentDTO)))
            .andExpect(status().isCreated());

        // Validate the Storeparent in the database
        List<Storeparent> storeparentList = storeparentRepository.findAll();
        assertThat(storeparentList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deleteStoreparent() throws Exception {
        // Initialize the database
        storeparentRepository.saveAndFlush(storeparent);
        int databaseSizeBeforeDelete = storeparentRepository.findAll().size();

        // Get the storeparent
        restStoreparentMockMvc.perform(delete("/api/storeparents/{id}", storeparent.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Storeparent> storeparentList = storeparentRepository.findAll();
        assertThat(storeparentList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Storeparent.class);
    }
}
