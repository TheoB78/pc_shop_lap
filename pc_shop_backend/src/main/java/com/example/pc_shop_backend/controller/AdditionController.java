package com.example.pc_shop_backend.controller;

import com.example.pc_shop_backend.model.Addition;
import com.example.pc_shop_backend.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdditionController {
    @Autowired
    private AdditionService additionService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("additions")
    public List<Addition> getAllAdditions() {
        return additionService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("add_addition")
    public Addition addAddition(@RequestBody Addition addition) {
        return additionService.save(addition);
    }
}
