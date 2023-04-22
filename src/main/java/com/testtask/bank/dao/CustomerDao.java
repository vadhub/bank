package com.testtask.bank.dao;

import com.testtask.bank.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();
    void save(Customer customer);
    List<Customer> findByPhoneNumber(int poneNumber);
    Customer findById(int id);
}
