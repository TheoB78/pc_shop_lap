package com.example.pc_shop_backend.repository;

import com.example.pc_shop_backend.model.Addition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionRepository extends JpaRepository<Addition, Integer> {
}
