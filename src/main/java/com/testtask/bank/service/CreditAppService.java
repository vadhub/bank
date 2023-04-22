package com.testtask.bank.service;

import com.testtask.bank.dao.CreditAppDaoImpl;
import com.testtask.bank.entity.CreditApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

@Service
public class CreditAppService {
    private CreditAppDaoImpl dao;

    @Autowired
    public CreditAppService(CreditAppDaoImpl dao) {
        this.dao = dao;
    }

    @Transactional
    public List<CreditApp> getAll() {
        return dao.findAll();
    }

    @Transactional
    public CreditApp save(CreditApp credit) {
        Random random = new Random();
        if (random.nextBoolean()) {
            credit.setPeriod((int) (Math.random() * 335) + 30);
            credit.setApprove(1);
        } else {
            credit.setApprove(0);
        }
        return dao.save(credit);
    }
}
