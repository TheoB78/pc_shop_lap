package com.example.pc_shop.repository;

import com.example.pc_shop.model.Addition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionRepository extends JpaRepository<Addition, Integer> {
}
