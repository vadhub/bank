package com.testtask.bank.dao;

import com.testtask.bank.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();
    List<Customer> findByParams(String param);
}
