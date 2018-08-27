package com.bnpp.pf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "_contributors")
public class Contributors extends AbstractAuditingEntity implements Serializable {

    @Id
    private Long id;

    @Column(name = "uid")
    private String uid;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "comments")
    private String comments;

    @Column(name = "job")
    private Integer job;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public Contributors() {

    }

    public Contributors(String uid, String firstname, String lastname, Integer job, String comments) {
        this.uid = uid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = job;
        this.comments = comments;
    }
}

