package com.neto.accounting.accounting.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wande on 27/10/2017.
 */

@Entity
@Table(name = "job02")
public class Job {

    @Id
    @Column(name = "job_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String description;

    @Column
    private Date date;

    @Column
    private Double TimeSpend;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employer_id", nullable = false)
    private Employer employer;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTimeSpend() {
        return TimeSpend;
    }

    public void setTimeSpend(Double timeSpend) {
        TimeSpend = timeSpend;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
