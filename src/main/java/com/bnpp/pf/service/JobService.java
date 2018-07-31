package com.bnpp.pf.service;

import com.bnpp.pf.domain.Job;
import com.bnpp.pf.repository.JobRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class JobService {

    private final JobRepository jobRepository;


    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;

    }

    @Transactional()
    public Optional<Job> getJobByName(String name) {
        return jobRepository.findOneByName(name);
    }
}

