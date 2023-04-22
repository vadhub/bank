package com.testtask.bank.dao;

import com.testtask.bank.entity.CreditApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Repository
public class CreditAppDaoImpl implements CreditAppDao {

    private HibernateTemplate template;

    @Autowired
    public CreditAppDaoImpl(HibernateTemplate template) {
        this.template = template;
    }

    @Override
    public List<CreditApp> findAll() {
        return template.loadAll(CreditApp.class);
    }

    @Override
    @Transactional
    public CreditApp save(CreditApp credit) {
        template.save(credit);
        return credit;
    }

    @Override
    public CreditApp findById(int id) {
        return Objects.requireNonNull(template.getSessionFactory()).getCurrentSession().get(CreditApp.class, id);
    }

}
