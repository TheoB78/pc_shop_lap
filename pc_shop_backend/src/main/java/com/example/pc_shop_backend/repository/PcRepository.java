package com.example.pc_shop_backend.repository;

import com.example.pc_shop_backend.model.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcRepository extends JpaRepository<Pc, Integer> {
}
