package com.repository;

import com.domain.Storepwt;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Storepwt entity.
 */
@SuppressWarnings("unused")
public interface StorepwtRepository extends JpaRepository<Storepwt,Long> {

	
		Page<Storepwt> findByStrnum(Long strnum, Pageable pageable);
		
		@Modifying
		@Query("update storepwt pwt set pwt.otsadj = ?1, pwt.currentots =?2, pwt.origpct = ?3 where pwt.id = ?4")
		void updateOts(Long otsadj, Long currentots, Long origpct, Long id);
		
	
}
