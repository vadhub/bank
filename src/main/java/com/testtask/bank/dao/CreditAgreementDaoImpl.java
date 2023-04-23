package com.testtask.bank.dao;

import com.testtask.bank.entity.CreditAgreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreditAgreementDaoImpl implements CreditAgreementDao {

    private HibernateTemplate template;

    @Autowired
    public CreditAgreementDaoImpl(HibernateTemplate template) {
        this.template = template;
    }

    @Override
    public List<CreditAgreement> findAll() {
        return template.loadAll(CreditAgreement.class);
    }

    @Override
    public CreditAgreement save(CreditAgreement agreement) {
        template.save(agreement);
        return agreement;
    }

    @Override
    public CreditAgreement update(CreditAgreement agreement) {
        template.update(agreement);
        return agreement;
    }

    @Override
    public CreditAgreement findById(Long id) {
        return template.getSessionFactory().getCurrentSession().get(CreditAgreement.class, id);
    }

    @Override
    public List<CreditAgreement> findBySign() {
        return template.getSessionFactory().getCurrentSession()
                .createQuery("from CreditAgreement credit where credit.sign=1", CreditAgreement.class).getResultList();
    }
}
