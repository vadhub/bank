package com.testtask.bank.service;

import com.testtask.bank.dao.CreditAgreementDao;
import com.testtask.bank.entity.CreditAgreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class CreditAgreementService {
    private CreditAgreementDao dao;

    @Autowired
    public CreditAgreementService(CreditAgreementDao dao) {
        this.dao = dao;
    }

    @Transactional
    public List<CreditAgreement> getAll() {
        return dao.findAll();
    }

    @Transactional
    public CreditAgreement save(CreditAgreement credit) {
        return dao.save(credit);
    }

    @Transactional
    public CreditAgreement update(CreditAgreement credit){
        return dao.update(credit);
    }
}
