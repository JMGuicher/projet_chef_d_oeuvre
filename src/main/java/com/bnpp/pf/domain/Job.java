package com.bnpp.pf.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "_job")
public class Job extends AbstractAuditingEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceJob")
    @SequenceGenerator(name = "sequenceJob")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="job")
    private List<Contributors> contributors;

    @Column(name = "only_one")
    private Boolean onlyOne;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOnlyOne() {
        return onlyOne;
    }

    public void setOnlyOne(boolean onlyOne) {
        this.onlyOne = onlyOne;
    }


    //empty constructor
    public Job() {

    }

    public Job(Long id, String name, boolean onlyOne) {
        this.id = id;
        this.name = name;
        this.onlyOne = onlyOne;
    }

    @Override
    public String toString() {
        return "Job{" +
            ", name='" + name + '\'' +
            ", onlyOne='" + onlyOne + '\'' +
            "}";
    }
}


