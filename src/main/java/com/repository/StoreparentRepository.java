package com.repository;

import com.domain.Storeparent;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Storeparent entity.
 */
@SuppressWarnings("unused")
public interface StoreparentRepository extends JpaRepository<Storeparent,Long> {

	
}
