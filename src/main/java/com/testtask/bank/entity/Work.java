package com.testtask.bank.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "work")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_work")
    private Long idWork;

    @Column(name = "name_org")
    private String nameOrg;

    @Column(name = "position_job")
    private String positionJob;

    @Column(name = "period_from")
    private Date periodFrom;

    @Column(name = "period_to")
    private Date periodTo;

    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    public String getPositionJob() {
        return positionJob;
    }

    public void setPositionJob(String positionJob) {
        this.positionJob = positionJob;
    }

    public void setIdWork(Long idWork) {
        this.idWork = idWork;
    }

    public Long getIdWork() {
        return idWork;
    }

    public Date getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(Date periodFrom) {
        this.periodFrom = periodFrom;
    }

    public Date getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(Date periodTo) {
        this.periodTo = periodTo;
    }

    @Override
    public String toString() {
        return "Work{" +
                "idWork=" + idWork +
                ", nameOrg='" + nameOrg + '\'' +
                ", positionJob='" + positionJob + '\'' +
                ", periodFrom=" + periodFrom +
                ", periodTo=" + periodTo +
                '}';
    }
}
