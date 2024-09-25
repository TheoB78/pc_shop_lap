package com.example.pc_shop.repository;

import com.example.pc_shop.model.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcRepository extends JpaRepository<Pc, Integer> {
}
