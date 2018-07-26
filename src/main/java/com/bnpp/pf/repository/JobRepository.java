package com.bnpp.pf.repository;

import com.bnpp.pf.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data JPA repository for the Job entity.
 */


@Repository
public interface JobRepository extends JpaRepository<Job, String> {

}



