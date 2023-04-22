package com.testtask.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

    @GetMapping("/main")
    public String showMainPage() {
        return "main_page";
    }

}
