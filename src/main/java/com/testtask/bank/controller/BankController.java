package com.testtask.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

    @GetMapping("/main")
    public String showMainPage() {
        return "main_page";
    }

    @GetMapping("/take_credit")
    public String showTakeCredit() {
        return "credit_app_create";
    }

    @GetMapping("/customer_list")
    public String showCustomerList() {
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
