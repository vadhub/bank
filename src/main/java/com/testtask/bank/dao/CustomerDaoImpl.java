package com.testtask.bank.dao;

import com.testtask.bank.entity.Customer;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    private final HibernateTemplate template;

    @Autowired
    public CustomerDaoImpl(HibernateTemplate template) {
        this.template = template;
    }

    @Override
    public List<Customer> findAll() {
        return template.loadAll(Customer.class);
    }

    @Override
    public List<Customer> findByParams(String param) {

        List<Customer> customers;

        if (param != null && !param.isEmpty()) {
            Query query = template.getSessionFactory().getCurrentSession()
                    .createQuery("from Customer customer " +
                                    "where lower(customer.firstName) like :theParam " +
                                    "or lower(customer.lastName) like :theParam " +
                                    "or lower(customer.patronymic) like :theParam " +
                                    "or cast(customer.seria as string) like :theParam " +
                                    "or cast(customer.number as string) like :theParam " +
                                    "or cast(customer.phoneNumber as string) like :theParam",
                            Customer.class);
            query.setParameter("theParam", "%" + param +"%");
            customers = query.getResultList();
        } else {
            customers = template.loadAll(Customer.class);
        }

        return customers;
    }
}
