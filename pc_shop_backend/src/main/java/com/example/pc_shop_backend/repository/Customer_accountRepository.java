package com.example.pc_shop_backend.repository;

import com.example.pc_shop_backend.model.Customer_account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer_accountRepository extends JpaRepository<Customer_account, Integer> {
}
