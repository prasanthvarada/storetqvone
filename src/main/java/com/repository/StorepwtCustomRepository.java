package com.repository;

import com.domain.Storepwt;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

/**
 * Spring Data JPA repository for the Storepwt entity.
 */
@SuppressWarnings("unused")
public interface StorepwtCustomRepository extends Repository<Storepwt,Long> {
	
	//working query
	//@Query("select id, deptnum, divnum, groups, pages, strnum, dcnum from storepwt u where u.deptnum=:deptnum AND u.groups=:groups and u.pages=:pages")
	@Query("select u from storepwt u where u.deptnum=:deptnum AND u.groups=:groups and u.pages=:pages")
	List<Storepwt> findByDeptAndGroups(@Param("deptnum") Long deptnum, @Param("groups") Long groups, @Param("pages") Long pages);
	
	@Query("select u from storepwt u where u.deptnum=:deptnum AND u.groups=:groups and u.pages=:pages and u.dcnum=:dcnum and u.strnum=:strnum")
	List<Storepwt> findByDeptAndDc(@Param("deptnum") Long deptnum, @Param("groups") Long groups, @Param("pages") Long pages, @Param("dcnum") Optional<Long> dcnum, @Param("strnum") Optional<Long> strnum);
	
	@Query("select u from storepwt u where u.deptnum=:deptnum AND u.groups=:groups and u.pages=:pages and u.dcnum=:dcnum")
	List<Storepwt> findByDeptAndDcOnly(@Param("deptnum") Long deptnum, @Param("groups") Long groups, @Param("pages") Long pages, @Param("dcnum") Optional<Long> dcnum);
	//dummy
	//List<Storepwt> findByDeptAndGroups(@Param("deptnum") Long deptnum, @Param("groups") Long groups, @Param("pages") Long pages);
	
	//List<Storepwt> findByDeptnumAndGroupsAndPages(Long deptnum, Long groups, Long pages);
	
}
