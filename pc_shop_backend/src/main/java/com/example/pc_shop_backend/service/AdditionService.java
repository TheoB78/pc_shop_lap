package com.example.pc_shop_backend.service;

import com.example.pc_shop_backend.model.Addition;
import com.example.pc_shop_backend.repository.AdditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditionService {
    @Autowired
    private AdditionRepository additionRepository;

    public List<Addition> findAll() {
        return additionRepository.findAll();
    }

    public Addition save(Addition addition) {
        return additionRepository.save(addition);
    }
}
