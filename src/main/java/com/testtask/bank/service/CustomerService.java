package com.testtask.bank.service;

import com.testtask.bank.dao.CustomerDao;
import com.testtask.bank.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerDao dao;

    @Autowired
    public CustomerService(CustomerDao dao) {
        this.dao = dao;
    }

    @Transactional
    public List<Customer> getAll() {
        return dao.findAll();
    }

    @Transactional
    public List<Customer> findByParam(String param) {
        return dao.findByParams(param.trim());
    }
}
