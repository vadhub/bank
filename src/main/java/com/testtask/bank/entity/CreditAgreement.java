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

    @Column(name = "date_sign")
    private Date dateSign;

    @Column(name = "sign")
    private int sign;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_credit")
    private CreditApp creditApp;

    public CreditAgreement() {
    }

    public CreditAgreement(Date dateSigh, int sigh, CreditApp creditApp) {
        this.dateSign = dateSigh;
        this.sign = sigh;
        this.creditApp = creditApp;
    }

    public CreditAgreement(CreditApp creditApp) {
        this.creditApp = creditApp;
    }

    public Date getDateSign() {
        return dateSign;
    }

    public void setDateSign(Date dateSign) {
        this.dateSign = dateSign;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
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
                ", dateSign=" + dateSign +
                ", sign=" + sign +
                ", creditApp=" + creditApp +
                '}';
    }
}