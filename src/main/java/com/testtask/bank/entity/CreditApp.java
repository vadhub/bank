package com.testtask.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "credit_app")
public class CreditApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credit")
    private Long idCredit;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @Column(name = "sum_")
    private int sum;

    @Column(name = "period")
    private int period;

    @Column(name = "approve")
    private int approve;

    public CreditApp() {
    }

    public CreditApp(Customer customer, int sum, int period, int approve) {
        this.customer = customer;
        this.sum = sum;
        this.period = period;
        this.approve = approve;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setIdCredit(Long idCredit) {
        this.idCredit = idCredit;
    }

    public Long getIdCredit() {
        return idCredit;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getApprove() {
        return approve;
    }

    public void setApprove(int approve) {
        this.approve = approve;
    }

    @Override
    public String toString() {
        return "CreditApp{" +
                "idCredit=" + idCredit +
                ", customer=" + customer +
                ", sum=" + sum +
                ", period=" + period +
                ", approve=" + approve +
                '}';
    }
}

