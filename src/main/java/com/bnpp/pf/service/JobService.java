package com.bnpp.pf.service;

import com.bnpp.pf.repository.JobRepository;
import org.springframework.stereotype.Service;


@Service
public class JobService {

    private final JobRepository jobRepository;


    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;

    }
}

