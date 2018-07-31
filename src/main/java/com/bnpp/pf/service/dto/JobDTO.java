package com.bnpp.pf.service.dto;

import com.bnpp.pf.domain.Job;

import java.time.Instant;


/**
 * A DTO representing a job, with his authorities.
 */

public class JobDTO {

    private Long id;
    private String name;
    private boolean onlyOne;

    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;


    public JobDTO() {
        //Empty constructor

    }

    public JobDTO(Job job) {
        this.id = job.getId();
        this.name = job.getName();
        this.onlyOne = job.getOnlyOne();
        this.createdBy = job.getCreatedBy();
        this.createdDate = job.getCreatedDate();
        this.lastModifiedBy = job.getLastModifiedBy();
        this.lastModifiedDate = job.getLastModifiedDate();

    }

    public String getName() {
        return name;
    }

    public boolean getOnlyOne() {
        return onlyOne;
    }

    @Override
    public String toString() {
        return "JobDTO{" +
            ", name='" + name + '\'' +
            ", onlyOne'" + onlyOne + '\'' +
            "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnlyOne() {
        return onlyOne;
    }

    public void setOnlyOne(boolean onlyOne) {
        this.onlyOne = onlyOne;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
