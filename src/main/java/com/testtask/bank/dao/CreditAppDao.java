package com.testtask.bank.dao;

import com.testtask.bank.entity.CreditApp;

import java.util.List;

public interface CreditAppDao {
    List<CreditApp> findAll();
    CreditApp save(CreditApp creditApp);
    CreditApp findById(Long id);
}
