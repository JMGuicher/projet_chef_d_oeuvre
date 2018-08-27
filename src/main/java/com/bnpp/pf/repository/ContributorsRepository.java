package com.bnpp.pf.repository;

import com.bnpp.pf.domain.Contributors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data JPA repository for the Job entity.
 */


@Repository
public interface ContributorsRepository extends JpaRepository<Contributors, String> {

    List<Contributors> findAll();

    @Override
    Contributors save(Contributors s);

    @Override
    void delete(String s);
}



