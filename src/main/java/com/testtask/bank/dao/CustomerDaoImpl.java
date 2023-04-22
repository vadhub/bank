package com.testtask.bank.dao;

import com.testtask.bank.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    private HibernateTemplate template;

    @Autowired
    public CustomerDaoImpl(HibernateTemplate template) {
        this.template = template;
    }

    @Override
    public List<Customer> findAll() {
        return template.loadAll(Customer.class);
    }

    @Override
    public void save(Customer customer) {
        template.save(customer);
    }

    @Override
    public List<Customer> findByPhoneNumber(int poneNumber) {
        return List.of(new Customer());
    }

    @Override
    public Customer findById(int id) {
        return template.getSessionFactory().getCurrentSession().get(Customer.class, id);
    }
}
