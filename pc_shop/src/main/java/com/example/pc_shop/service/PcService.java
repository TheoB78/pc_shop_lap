package com.example.pc_shop.service;

import com.example.pc_shop.model.Pc;
import com.example.pc_shop.repository.PcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PcService {
    @Autowired
    private PcRepository pcRepository;

    public List<Pc> findAll() {
        return pcRepository.findAll();
    }

    public Optional<Pc> findById(Integer id) {
        return pcRepository.findById(id);
    }
}
