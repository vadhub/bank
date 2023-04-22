package com.testtask.bank.controller;

import com.testtask.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

    private CustomerService customerService;

    @Autowired
    public BankController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/main")
    public String showMainPage() {
        return "main_page";
    }

    @GetMapping("/take_credit")
    public String showTakeCredit() {
        return "credit_app_create";
    }

    @GetMapping("/customer_list")
    public String showCustomerList(Model model) {
        model.addAttribute("customer", customerService.getAll());
        return "customer_list";
    }

    @GetMapping("/credit_app_list")
    public String showCreditAppList() {
        return "credit_app_list";
    }

    @GetMapping("/credit_agrmt_list")
    public String showCreditAgrmtList() {
        return "credit_agrmt_list";
    }

}
