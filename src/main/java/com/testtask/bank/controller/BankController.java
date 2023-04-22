package com.testtask.bank.controller;

import com.testtask.bank.entity.CreditApp;
import com.testtask.bank.service.CreditAppService;
import com.testtask.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankController {

    private CustomerService customerService;
    private CreditAppService creditAppService;

    @Autowired
    public BankController(CustomerService customerService, CreditAppService creditAppService) {
        this.customerService = customerService;
        this.creditAppService = creditAppService;
    }

    @GetMapping("/main")
    public String showMainPage() {
        return "main_page";
    }

    @GetMapping("/take_credit")
    public String showTakeCredit() {
        return "credit_app_create";
    }

    @GetMapping("/saveAgreement/{id}")
    public String showAgreement(@PathVariable("id") int id, Model model) {
        model.addAttribute("customer_id", customerService.findById(id));
        return "credit_agrmt_create";
    }

    @PostMapping("/saveCredit")
    public String insertCredit(@ModelAttribute("credit") CreditApp credit) {

        CreditApp save = creditAppService.save(credit);

        if (save.getApprove() == 0) {
            return "disapprove_credit";
        }

        return "redirect:/saveAgreement/"+save.getCustomer().getId();
    }

    @GetMapping("/customer_list")
    public String showCustomerList(Model model) {
        model.addAttribute("customer", customerService.getAll());
        return "customer_list";
    }

    @GetMapping("/credit_app_list")
    public String showCreditAppList(Model model) {
        model.addAttribute("credit", creditAppService.getAll());
        return "credit_app_list";
    }

    @GetMapping("/credit_agrmt_list")
    public String showCreditAgrmtList() {
        return "credit_agrmt_list";
    }

}
