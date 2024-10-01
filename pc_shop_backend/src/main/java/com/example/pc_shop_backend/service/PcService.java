package com.example.pc_shop_backend.service;

import com.example.pc_shop_backend.model.Pc;
import com.example.pc_shop_backend.repository.PcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

    public Pc save(Pc pc) {
        return pcRepository.save(pc);
    }
}
