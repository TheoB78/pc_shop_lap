package com.example.pc_shop_backend.controller;

import com.example.pc_shop_backend.model.Customer_account;
import com.example.pc_shop_backend.service.Customer_accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Customer_AccountController {
    @Autowired
    private Customer_accountService customerAccountService;

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/addCustomerAccount")
    public Customer_account addCustomerAccount(@RequestBody Customer_account customer_account) {
        return customerAccountService.addCustomer(customer_account);
    }
}
