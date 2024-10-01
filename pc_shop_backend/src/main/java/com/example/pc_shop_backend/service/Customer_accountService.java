package com.example.pc_shop_backend.service;

import com.example.pc_shop_backend.model.Customer_account;
import com.example.pc_shop_backend.repository.Customer_accountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Customer_accountService {
    @Autowired
    private Customer_accountRepository customerAccountRepository;

    public Customer_account addCustomer (Customer_account customer_account) {
        return customerAccountRepository.save(customer_account);
    }
}
