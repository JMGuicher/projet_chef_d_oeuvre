package com.bnpp.pf.service.dto;

import com.bnpp.pf.domain.Job;


/**
 * A DTO representing a job, with his authorities.
 */

public class JobDTO {

    private Long id;

    private String name;

    public JobDTO() {
        //Empty constructor

    }

    public JobDTO(Job job) {
        this.id = job.getId();
        this.name = job.getName();

    }

    public String gettName() {
        return name;
    }

    @Override
    public String toString() {
        return "JobDTO{" +
            ", name='" + name + '\'' +
            "}";
    }


}
