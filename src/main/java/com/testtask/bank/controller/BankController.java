package com.testtask.bank.controller;

import com.testtask.bank.entity.CreditAgreement;
import com.testtask.bank.entity.CreditApp;
import com.testtask.bank.entity.Customer;
import com.testtask.bank.service.CreditAgreementService;
import com.testtask.bank.service.CreditAppService;
import com.testtask.bank.service.CustomerService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@Controller
public class BankController {

    private CustomerService customerService;
    private CreditAppService creditAppService;
    private CreditAgreementService creditAgreementService;

    @Autowired
    public BankController(CustomerService customerService, CreditAppService creditAppService, CreditAgreementService creditAgreementService) {
        this.customerService = customerService;
        this.creditAppService = creditAppService;
        this.creditAgreementService = creditAgreementService;
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
    public String showAgreement(@PathVariable("id") Long id, Model model) {
        CreditAgreement creditAgreement = creditAgreementService.findById(id);

        model.addAttribute("creadit_agrmt", creditAgreement);
        model.addAttribute("credit_app", creditAgreement.getCreditApp());

        return "credit_agrmt_create";
    }

    @PostMapping("/save_credit")
    public String insertCredit(@ModelAttribute("credit") CreditApp credit) {

        CreditApp save = creditAppService.save(credit);

        if (save.getApprove() == 0) {
            return "disapprove_credit";
        }

        CreditAgreement creditAgreement = creditAgreementService.save(new CreditAgreement(save));

        return "redirect:/saveAgreement/"+creditAgreement.getIdAgrmt();
    }

    @GetMapping("/customer_list")
    public String showCustomerList(Model model) {
        model.addAttribute("customer", customerService.getAll());
        return "customer_list";
    }

    @GetMapping("/search")
    public String searchCustomers(@RequestParam("param") String param, Model model) {
        model.addAttribute("customer", customerService.findByParam(param));
        return "customer_list";
    }

    @GetMapping("/credit_app_list")
    public String showCreditAppList(Model model) {
        model.addAttribute("credit", creditAppService.getAll());
        return "credit_app_list";
    }

    @GetMapping("/credit_agrmt_list")
    public String showCreditAgrmtList(Model model) {
        model.addAttribute("credit_agreement", creditAgreementService.findBySign());
        return "credit_agrmt_list";
    }

    @PostMapping("/save_credit_agreement/{id}")
    public String insertCreditAgreement(@PathVariable("id") Long id) {

        Date sqlDate = new Date(System.currentTimeMillis());

        CreditAgreement creditAgreement = creditAgreementService.findById(id);
        creditAgreement.setSign(1);
        creditAgreement.setDateSign(sqlDate);
        creditAgreementService.update(creditAgreement);

        return "redirect:/saveAgreement/"+creditAgreement.getIdAgrmt();
    }

}
