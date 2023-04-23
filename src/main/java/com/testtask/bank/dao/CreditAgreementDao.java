package com.testtask.bank.dao;

import com.testtask.bank.entity.CreditAgreement;

import java.util.List;

public interface CreditAgreementDao {
    List<CreditAgreement> findAll();
    CreditAgreement save(CreditAgreement agreement);
    CreditAgreement update(CreditAgreement agreement);
    CreditAgreement findById(Long id);
    List<CreditAgreement> findBySign();
}
