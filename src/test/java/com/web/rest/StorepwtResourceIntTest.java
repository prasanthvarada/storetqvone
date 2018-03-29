package com.web.rest;

import com.StoretqvoneApp;

import com.domain.Storepwt;
import com.repository.StorepwtRepository;
import com.service.StorepwtService;
import com.service.dto.StorepwtDTO;
import com.service.mapper.StorepwtMapper;
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
 * Test class for the StorepwtResource REST controller.
 *
 * @see StorepwtResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StoretqvoneApp.class)
public class StorepwtResourceIntTest {/*

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

    private static final String DEFAULT_WORKUID = "AAAAAAAAAA";
    private static final String UPDATED_WORKUID = "BBBBBBBBBB";

    private static final Long DEFAULT_ORDINALKEY = 1L;
    private static final Long UPDATED_ORDINALKEY = 2L;

    private static final Long DEFAULT_STRNUM = 1L;
    private static final Long UPDATED_STRNUM = 2L;

    private static final Long DEFAULT_DCNUM = 1L;
    private static final Long UPDATED_DCNUM = 2L;

    private static final Long DEFAULT_ZONENUM = 1L;
    private static final Long UPDATED_ZONENUM = 2L;

    private static final Double DEFAULT_SSRATTURN = 1D;
    private static final Double UPDATED_SSRATTURN = 2D;

    private static final Long DEFAULT_CURRENTOTS = 1L;
    private static final Long UPDATED_CURRENTOTS = 2L;

    private static final Long DEFAULT_TOTACTUALSALES = 1L;
    private static final Long UPDATED_TOTACTUALSALES = 2L;

    private static final Long DEFAULT_TOTPLNDSALES = 1L;
    private static final Long UPDATED_TOTPLNDSALES = 2L;

    private static final Long DEFAULT_TWINVT = 1L;
    private static final Long UPDATED_TWINVT = 2L;

    private static final Long DEFAULT_INVTPLNDEND = 1L;
    private static final Long UPDATED_INVTPLNDEND = 2L;

    private static final Long DEFAULT_TWSALES = 1L;
    private static final Long UPDATED_TWSALES = 2L;

    private static final Long DEFAULT_WTDDIST = 1L;
    private static final Long UPDATED_WTDDIST = 2L;

    private static final Long DEFAULT_ORIGOTS = 1L;
    private static final Long UPDATED_ORIGOTS = 2L;

    private static final Long DEFAULT_OTSADJ = 1L;
    private static final Long UPDATED_OTSADJ = 2L;

    private static final Long DEFAULT_SALESAGO = 1L;
    private static final Long UPDATED_SALESAGO = 2L;

    private static final Long DEFAULT_LWSALES = 1L;
    private static final Long UPDATED_LWSALES = 2L;

    private static final Long DEFAULT_SALESPLND = 1L;
    private static final Long UPDATED_SALESPLND = 2L;

    private static final Long DEFAULT_SALESPLNDWKTWO = 1L;
    private static final Long UPDATED_SALESPLNDWKTWO = 2L;

    private static final Long DEFAULT_SALESPLNDBAL = 1L;
    private static final Long UPDATED_SALESPLNDBAL = 2L;

    private static final Long DEFAULT_OTSWEEKS = 1L;
    private static final Long UPDATED_OTSWEEKS = 2L;

    private static final Long DEFAULT_LWDISTREG = 1L;
    private static final Long UPDATED_LWDISTREG = 2L;

    private static final Long DEFAULT_INVTPLND = 1L;
    private static final Long UPDATED_INVTPLND = 2L;

    private static final Long DEFAULT_LWINVT = 1L;
    private static final Long UPDATED_LWINVT = 2L;

    private static final Long DEFAULT_ORIGPCT = 1L;
    private static final Long UPDATED_ORIGPCT = 2L;

    @Autowired
    private StorepwtRepository storepwtRepository;

    @Autowired
    private StorepwtMapper storepwtMapper;

    @Autowired
    private StorepwtService storepwtService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restStorepwtMockMvc;

    private Storepwt storepwt;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        StorepwtResource storepwtResource = new StorepwtResource(storepwtService);
        this.restStorepwtMockMvc = MockMvcBuilders.standaloneSetup(storepwtResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setMessageConverters(jacksonMessageConverter).build();
    }

    *//**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     *//*
    public static Storepwt createEntity(EntityManager em) {
        Storepwt storepwt = new Storepwt()
                .deptnum(DEFAULT_DEPTNUM)
                .divnum(DEFAULT_DIVNUM)
                .groups(DEFAULT_GROUPS)
                .pages(DEFAULT_PAGES)
                .transitional(DEFAULT_TRANSITIONAL)
                .workuid(DEFAULT_WORKUID)
                .ordinalkey(DEFAULT_ORDINALKEY)
                .strnum(DEFAULT_STRNUM)
                .dcnum(DEFAULT_DCNUM)
                .zonenum(DEFAULT_ZONENUM)
                .ssratturn(DEFAULT_SSRATTURN)
                .currentots(DEFAULT_CURRENTOTS)
                .totactualsales(DEFAULT_TOTACTUALSALES)
                .totplndsales(DEFAULT_TOTPLNDSALES)
                .twinvt(DEFAULT_TWINVT)
                .invtplndend(DEFAULT_INVTPLNDEND)
                .twsales(DEFAULT_TWSALES)
                .wtddist(DEFAULT_WTDDIST)
                .origots(DEFAULT_ORIGOTS)
                .otsadj(DEFAULT_OTSADJ)
                .salesago(DEFAULT_SALESAGO)
                .lwsales(DEFAULT_LWSALES)
                .salesplnd(DEFAULT_SALESPLND)
                .salesplndwktwo(DEFAULT_SALESPLNDWKTWO)
                .salesplndbal(DEFAULT_SALESPLNDBAL)
                .otsweeks(DEFAULT_OTSWEEKS)
                .lwdistreg(DEFAULT_LWDISTREG)
                .invtplnd(DEFAULT_INVTPLND)
                .lwinvt(DEFAULT_LWINVT)
                .origpct(DEFAULT_ORIGPCT);
        return storepwt;
    }

    @Before
    public void initTest() {
        storepwt = createEntity(em);
    }

    @Test
    @Transactional
    public void createStorepwt() throws Exception {
        int databaseSizeBeforeCreate = storepwtRepository.findAll().size();

        // Create the Storepwt
        StorepwtDTO storepwtDTO = storepwtMapper.storepwtToStorepwtDTO(storepwt);

        restStorepwtMockMvc.perform(post("/api/storepwts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(storepwtDTO)))
            .andExpect(status().isCreated());

        // Validate the Storepwt in the database
        List<Storepwt> storepwtList = storepwtRepository.findAll();
        assertThat(storepwtList).hasSize(databaseSizeBeforeCreate + 1);
        Storepwt testStorepwt = storepwtList.get(storepwtList.size() - 1);
        assertThat(testStorepwt.getDeptnum()).isEqualTo(DEFAULT_DEPTNUM);
        assertThat(testStorepwt.getDivnum()).isEqualTo(DEFAULT_DIVNUM);
        assertThat(testStorepwt.getGroups()).isEqualTo(DEFAULT_GROUPS);
        assertThat(testStorepwt.getPages()).isEqualTo(DEFAULT_PAGES);
        assertThat(testStorepwt.getTransitional()).isEqualTo(DEFAULT_TRANSITIONAL);
        assertThat(testStorepwt.getWorkuid()).isEqualTo(DEFAULT_WORKUID);
        assertThat(testStorepwt.getOrdinalkey()).isEqualTo(DEFAULT_ORDINALKEY);
        assertThat(testStorepwt.getStrnum()).isEqualTo(DEFAULT_STRNUM);
        assertThat(testStorepwt.getDcnum()).isEqualTo(DEFAULT_DCNUM);
        assertThat(testStorepwt.getZonenum()).isEqualTo(DEFAULT_ZONENUM);
        assertThat(testStorepwt.getSsratturn()).isEqualTo(DEFAULT_SSRATTURN);
        assertThat(testStorepwt.getCurrentots()).isEqualTo(DEFAULT_CURRENTOTS);
        assertThat(testStorepwt.getTotactualsales()).isEqualTo(DEFAULT_TOTACTUALSALES);
        assertThat(testStorepwt.getTotplndsales()).isEqualTo(DEFAULT_TOTPLNDSALES);
        assertThat(testStorepwt.getTwinvt()).isEqualTo(DEFAULT_TWINVT);
        assertThat(testStorepwt.getInvtplndend()).isEqualTo(DEFAULT_INVTPLNDEND);
        assertThat(testStorepwt.getTwsales()).isEqualTo(DEFAULT_TWSALES);
        assertThat(testStorepwt.getWtddist()).isEqualTo(DEFAULT_WTDDIST);
        assertThat(testStorepwt.getOrigots()).isEqualTo(DEFAULT_ORIGOTS);
        assertThat(testStorepwt.getOtsadj()).isEqualTo(DEFAULT_OTSADJ);
        assertThat(testStorepwt.getSalesago()).isEqualTo(DEFAULT_SALESAGO);
        assertThat(testStorepwt.getLwsales()).isEqualTo(DEFAULT_LWSALES);
        assertThat(testStorepwt.getSalesplnd()).isEqualTo(DEFAULT_SALESPLND);
        assertThat(testStorepwt.getSalesplndwktwo()).isEqualTo(DEFAULT_SALESPLNDWKTWO);
        assertThat(testStorepwt.getSalesplndbal()).isEqualTo(DEFAULT_SALESPLNDBAL);
        assertThat(testStorepwt.getOtsweeks()).isEqualTo(DEFAULT_OTSWEEKS);
        assertThat(testStorepwt.getLwdistreg()).isEqualTo(DEFAULT_LWDISTREG);
        assertThat(testStorepwt.getInvtplnd()).isEqualTo(DEFAULT_INVTPLND);
        assertThat(testStorepwt.getLwinvt()).isEqualTo(DEFAULT_LWINVT);
        assertThat(testStorepwt.getOrigpct()).isEqualTo(DEFAULT_ORIGPCT);
    }

    @Test
    @Transactional
    public void createStorepwtWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = storepwtRepository.findAll().size();

        // Create the Storepwt with an existing ID
        Storepwt existingStorepwt = new Storepwt();
        existingStorepwt.setId(1L);
        StorepwtDTO existingStorepwtDTO = storepwtMapper.storepwtToStorepwtDTO(existingStorepwt);

        // An entity with an existing ID cannot be created, so this API call must fail
        restStorepwtMockMvc.perform(post("/api/storepwts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(existingStorepwtDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<Storepwt> storepwtList = storepwtRepository.findAll();
        assertThat(storepwtList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllStorepwts() throws Exception {
        // Initialize the database
        storepwtRepository.saveAndFlush(storepwt);

        // Get all the storepwtList
        restStorepwtMockMvc.perform(get("/api/storepwts?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(storepwt.getId().intValue())))
            .andExpect(jsonPath("$.[*].deptnum").value(hasItem(DEFAULT_DEPTNUM.intValue())))
            .andExpect(jsonPath("$.[*].divnum").value(hasItem(DEFAULT_DIVNUM.intValue())))
            .andExpect(jsonPath("$.[*].groups").value(hasItem(DEFAULT_GROUPS.intValue())))
            .andExpect(jsonPath("$.[*].pages").value(hasItem(DEFAULT_PAGES.intValue())))
            .andExpect(jsonPath("$.[*].transitional").value(hasItem(DEFAULT_TRANSITIONAL.toString())))
            .andExpect(jsonPath("$.[*].workuid").value(hasItem(DEFAULT_WORKUID.toString())))
            .andExpect(jsonPath("$.[*].ordinalkey").value(hasItem(DEFAULT_ORDINALKEY.intValue())))
            .andExpect(jsonPath("$.[*].strnum").value(hasItem(DEFAULT_STRNUM.intValue())))
            .andExpect(jsonPath("$.[*].dcnum").value(hasItem(DEFAULT_DCNUM.intValue())))
            .andExpect(jsonPath("$.[*].zonenum").value(hasItem(DEFAULT_ZONENUM.intValue())))
            .andExpect(jsonPath("$.[*].ssratturn").value(hasItem(DEFAULT_SSRATTURN.doubleValue())))
            .andExpect(jsonPath("$.[*].currentots").value(hasItem(DEFAULT_CURRENTOTS.intValue())))
            .andExpect(jsonPath("$.[*].totactualsales").value(hasItem(DEFAULT_TOTACTUALSALES.intValue())))
            .andExpect(jsonPath("$.[*].totplndsales").value(hasItem(DEFAULT_TOTPLNDSALES.intValue())))
            .andExpect(jsonPath("$.[*].twinvt").value(hasItem(DEFAULT_TWINVT.intValue())))
            .andExpect(jsonPath("$.[*].invtplndend").value(hasItem(DEFAULT_INVTPLNDEND.intValue())))
            .andExpect(jsonPath("$.[*].twsales").value(hasItem(DEFAULT_TWSALES.intValue())))
            .andExpect(jsonPath("$.[*].wtddist").value(hasItem(DEFAULT_WTDDIST.intValue())))
            .andExpect(jsonPath("$.[*].origots").value(hasItem(DEFAULT_ORIGOTS.intValue())))
            .andExpect(jsonPath("$.[*].otsadj").value(hasItem(DEFAULT_OTSADJ.intValue())))
            .andExpect(jsonPath("$.[*].salesago").value(hasItem(DEFAULT_SALESAGO.intValue())))
            .andExpect(jsonPath("$.[*].lwsales").value(hasItem(DEFAULT_LWSALES.intValue())))
            .andExpect(jsonPath("$.[*].salesplnd").value(hasItem(DEFAULT_SALESPLND.intValue())))
            .andExpect(jsonPath("$.[*].salesplndwktwo").value(hasItem(DEFAULT_SALESPLNDWKTWO.intValue())))
            .andExpect(jsonPath("$.[*].salesplndbal").value(hasItem(DEFAULT_SALESPLNDBAL.intValue())))
            .andExpect(jsonPath("$.[*].otsweeks").value(hasItem(DEFAULT_OTSWEEKS.intValue())))
            .andExpect(jsonPath("$.[*].lwdistreg").value(hasItem(DEFAULT_LWDISTREG.intValue())))
            .andExpect(jsonPath("$.[*].invtplnd").value(hasItem(DEFAULT_INVTPLND.intValue())))
            .andExpect(jsonPath("$.[*].lwinvt").value(hasItem(DEFAULT_LWINVT.intValue())))
            .andExpect(jsonPath("$.[*].origpct").value(hasItem(DEFAULT_ORIGPCT.intValue())));
    }

    @Test
    @Transactional
    public void getStorepwt() throws Exception {
        // Initialize the database
        storepwtRepository.saveAndFlush(storepwt);

        // Get the storepwt
        restStorepwtMockMvc.perform(get("/api/storepwts/{id}", storepwt.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(storepwt.getId().intValue()))
            .andExpect(jsonPath("$.deptnum").value(DEFAULT_DEPTNUM.intValue()))
            .andExpect(jsonPath("$.divnum").value(DEFAULT_DIVNUM.intValue()))
            .andExpect(jsonPath("$.groups").value(DEFAULT_GROUPS.intValue()))
            .andExpect(jsonPath("$.pages").value(DEFAULT_PAGES.intValue()))
            .andExpect(jsonPath("$.transitional").value(DEFAULT_TRANSITIONAL.toString()))
            .andExpect(jsonPath("$.workuid").value(DEFAULT_WORKUID.toString()))
            .andExpect(jsonPath("$.ordinalkey").value(DEFAULT_ORDINALKEY.intValue()))
            .andExpect(jsonPath("$.strnum").value(DEFAULT_STRNUM.intValue()))
            .andExpect(jsonPath("$.dcnum").value(DEFAULT_DCNUM.intValue()))
            .andExpect(jsonPath("$.zonenum").value(DEFAULT_ZONENUM.intValue()))
            .andExpect(jsonPath("$.ssratturn").value(DEFAULT_SSRATTURN.doubleValue()))
            .andExpect(jsonPath("$.currentots").value(DEFAULT_CURRENTOTS.intValue()))
            .andExpect(jsonPath("$.totactualsales").value(DEFAULT_TOTACTUALSALES.intValue()))
            .andExpect(jsonPath("$.totplndsales").value(DEFAULT_TOTPLNDSALES.intValue()))
            .andExpect(jsonPath("$.twinvt").value(DEFAULT_TWINVT.intValue()))
            .andExpect(jsonPath("$.invtplndend").value(DEFAULT_INVTPLNDEND.intValue()))
            .andExpect(jsonPath("$.twsales").value(DEFAULT_TWSALES.intValue()))
            .andExpect(jsonPath("$.wtddist").value(DEFAULT_WTDDIST.intValue()))
            .andExpect(jsonPath("$.origots").value(DEFAULT_ORIGOTS.intValue()))
            .andExpect(jsonPath("$.otsadj").value(DEFAULT_OTSADJ.intValue()))
            .andExpect(jsonPath("$.salesago").value(DEFAULT_SALESAGO.intValue()))
            .andExpect(jsonPath("$.lwsales").value(DEFAULT_LWSALES.intValue()))
            .andExpect(jsonPath("$.salesplnd").value(DEFAULT_SALESPLND.intValue()))
            .andExpect(jsonPath("$.salesplndwktwo").value(DEFAULT_SALESPLNDWKTWO.intValue()))
            .andExpect(jsonPath("$.salesplndbal").value(DEFAULT_SALESPLNDBAL.intValue()))
            .andExpect(jsonPath("$.otsweeks").value(DEFAULT_OTSWEEKS.intValue()))
            .andExpect(jsonPath("$.lwdistreg").value(DEFAULT_LWDISTREG.intValue()))
            .andExpect(jsonPath("$.invtplnd").value(DEFAULT_INVTPLND.intValue()))
            .andExpect(jsonPath("$.lwinvt").value(DEFAULT_LWINVT.intValue()))
            .andExpect(jsonPath("$.origpct").value(DEFAULT_ORIGPCT.intValue()));
    }

    @Test
    @Transactional
    public void getNonExistingStorepwt() throws Exception {
        // Get the storepwt
        restStorepwtMockMvc.perform(get("/api/storepwts/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateStorepwt() throws Exception {
        // Initialize the database
        storepwtRepository.saveAndFlush(storepwt);
        int databaseSizeBeforeUpdate = storepwtRepository.findAll().size();

        // Update the storepwt
        Storepwt updatedStorepwt = storepwtRepository.findOne(storepwt.getId());
        updatedStorepwt
                .deptnum(UPDATED_DEPTNUM)
                .divnum(UPDATED_DIVNUM)
                .groups(UPDATED_GROUPS)
                .pages(UPDATED_PAGES)
                .transitional(UPDATED_TRANSITIONAL)
                .workuid(UPDATED_WORKUID)
                .ordinalkey(UPDATED_ORDINALKEY)
                .strnum(UPDATED_STRNUM)
                .dcnum(UPDATED_DCNUM)
                .zonenum(UPDATED_ZONENUM)
                .ssratturn(UPDATED_SSRATTURN)
                .currentots(UPDATED_CURRENTOTS)
                .totactualsales(UPDATED_TOTACTUALSALES)
                .totplndsales(UPDATED_TOTPLNDSALES)
                .twinvt(UPDATED_TWINVT)
                .invtplndend(UPDATED_INVTPLNDEND)
                .twsales(UPDATED_TWSALES)
                .wtddist(UPDATED_WTDDIST)
                .origots(UPDATED_ORIGOTS)
                .otsadj(UPDATED_OTSADJ)
                .salesago(UPDATED_SALESAGO)
                .lwsales(UPDATED_LWSALES)
                .salesplnd(UPDATED_SALESPLND)
                .salesplndwktwo(UPDATED_SALESPLNDWKTWO)
                .salesplndbal(UPDATED_SALESPLNDBAL)
                .otsweeks(UPDATED_OTSWEEKS)
                .lwdistreg(UPDATED_LWDISTREG)
                .invtplnd(UPDATED_INVTPLND)
                .lwinvt(UPDATED_LWINVT)
                .origpct(UPDATED_ORIGPCT);
        StorepwtDTO storepwtDTO = storepwtMapper.storepwtToStorepwtDTO(updatedStorepwt);

        restStorepwtMockMvc.perform(put("/api/storepwts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(storepwtDTO)))
            .andExpect(status().isOk());

        // Validate the Storepwt in the database
        List<Storepwt> storepwtList = storepwtRepository.findAll();
        assertThat(storepwtList).hasSize(databaseSizeBeforeUpdate);
        Storepwt testStorepwt = storepwtList.get(storepwtList.size() - 1);
        assertThat(testStorepwt.getDeptnum()).isEqualTo(UPDATED_DEPTNUM);
        assertThat(testStorepwt.getDivnum()).isEqualTo(UPDATED_DIVNUM);
        assertThat(testStorepwt.getGroups()).isEqualTo(UPDATED_GROUPS);
        assertThat(testStorepwt.getPages()).isEqualTo(UPDATED_PAGES);
        assertThat(testStorepwt.getTransitional()).isEqualTo(UPDATED_TRANSITIONAL);
        assertThat(testStorepwt.getWorkuid()).isEqualTo(UPDATED_WORKUID);
        assertThat(testStorepwt.getOrdinalkey()).isEqualTo(UPDATED_ORDINALKEY);
        assertThat(testStorepwt.getStrnum()).isEqualTo(UPDATED_STRNUM);
        assertThat(testStorepwt.getDcnum()).isEqualTo(UPDATED_DCNUM);
        assertThat(testStorepwt.getZonenum()).isEqualTo(UPDATED_ZONENUM);
        assertThat(testStorepwt.getSsratturn()).isEqualTo(UPDATED_SSRATTURN);
        assertThat(testStorepwt.getCurrentots()).isEqualTo(UPDATED_CURRENTOTS);
        assertThat(testStorepwt.getTotactualsales()).isEqualTo(UPDATED_TOTACTUALSALES);
        assertThat(testStorepwt.getTotplndsales()).isEqualTo(UPDATED_TOTPLNDSALES);
        assertThat(testStorepwt.getTwinvt()).isEqualTo(UPDATED_TWINVT);
        assertThat(testStorepwt.getInvtplndend()).isEqualTo(UPDATED_INVTPLNDEND);
        assertThat(testStorepwt.getTwsales()).isEqualTo(UPDATED_TWSALES);
        assertThat(testStorepwt.getWtddist()).isEqualTo(UPDATED_WTDDIST);
        assertThat(testStorepwt.getOrigots()).isEqualTo(UPDATED_ORIGOTS);
        assertThat(testStorepwt.getOtsadj()).isEqualTo(UPDATED_OTSADJ);
        assertThat(testStorepwt.getSalesago()).isEqualTo(UPDATED_SALESAGO);
        assertThat(testStorepwt.getLwsales()).isEqualTo(UPDATED_LWSALES);
        assertThat(testStorepwt.getSalesplnd()).isEqualTo(UPDATED_SALESPLND);
        assertThat(testStorepwt.getSalesplndwktwo()).isEqualTo(UPDATED_SALESPLNDWKTWO);
        assertThat(testStorepwt.getSalesplndbal()).isEqualTo(UPDATED_SALESPLNDBAL);
        assertThat(testStorepwt.getOtsweeks()).isEqualTo(UPDATED_OTSWEEKS);
        assertThat(testStorepwt.getLwdistreg()).isEqualTo(UPDATED_LWDISTREG);
        assertThat(testStorepwt.getInvtplnd()).isEqualTo(UPDATED_INVTPLND);
        assertThat(testStorepwt.getLwinvt()).isEqualTo(UPDATED_LWINVT);
        assertThat(testStorepwt.getOrigpct()).isEqualTo(UPDATED_ORIGPCT);
    }

    @Test
    @Transactional
    public void updateNonExistingStorepwt() throws Exception {
        int databaseSizeBeforeUpdate = storepwtRepository.findAll().size();

        // Create the Storepwt
        StorepwtDTO storepwtDTO = storepwtMapper.storepwtToStorepwtDTO(storepwt);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restStorepwtMockMvc.perform(put("/api/storepwts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(storepwtDTO)))
            .andExpect(status().isCreated());

        // Validate the Storepwt in the database
        List<Storepwt> storepwtList = storepwtRepository.findAll();
        assertThat(storepwtList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deleteStorepwt() throws Exception {
        // Initialize the database
        storepwtRepository.saveAndFlush(storepwt);
        int databaseSizeBeforeDelete = storepwtRepository.findAll().size();

        // Get the storepwt
        restStorepwtMockMvc.perform(delete("/api/storepwts/{id}", storepwt.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Storepwt> storepwtList = storepwtRepository.findAll();
        assertThat(storepwtList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Storepwt.class);
    }
*/}
