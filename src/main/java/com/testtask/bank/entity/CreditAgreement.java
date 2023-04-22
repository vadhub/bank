package com.testtask.bank.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "credit_agmt")
public class CreditAgreement {

    @Id
    @Column(name = "id_credit_agmt")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgrmt;

    @Column(name = "date_sigh")
    private Date dateSigh;

    @Column(name = "sigh")
    private int sigh;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_credit")
    private CreditApp creditApp;

    public CreditAgreement() {
    }

    public CreditAgreement(Date dateSigh, int sigh, CreditApp creditApp) {
        this.dateSigh = dateSigh;
        this.sigh = sigh;
        this.creditApp = creditApp;
    }

    public CreditAgreement(CreditApp creditApp) {
        this.creditApp = creditApp;
    }

    public Date getDateSigh() {
        return dateSigh;
    }

    public void setDateSigh(Date dateSigh) {
        this.dateSigh = dateSigh;
    }

    public int getSigh() {
        return sigh;
    }

    public void setSigh(int sigh) {
        this.sigh = sigh;
    }

    public CreditApp getCreditApp() {
        return creditApp;
    }

    public void setCreditApp(CreditApp creditApp) {
        this.creditApp = creditApp;
    }

    public void setIdAgrmt(Long idAgrmt) {
        this.idAgrmt = idAgrmt;
    }

    public Long getIdAgrmt() {
        return idAgrmt;
    }

    @Override
    public String toString() {
        return "CreditAgrmt{" +
                "idAgrmt=" + idAgrmt +
                ", dateSigh=" + dateSigh +
                ", sigh=" + sigh +
                ", creditApp=" + creditApp +
                '}';
    }
}