package com.bnpp.pf.domain;

import javax.annotation.Nullable;
import javax.persistence.*;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Entity
@Table(name = "_contributors")
public class Contributors extends AbstractAuditingEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceContributor")
    @SequenceGenerator(name = "sequenceContributor")
    private Long id;

    @Column(name = "uid")
    private String uid;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "comments")
    private String comments;

    @JoinColumn(name = "job")
    @ManyToOne
    @Null
    private Job job;

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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Contributors() {

    }

    public Contributors(String uid, String firstname, String lastname, Job job, String comments) {
        this.uid = uid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = job;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Contributors{" +
            "id=" + id +
            ", uid='" + uid + '\'' +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
    }
}

