package com.example.pc_shop.controller;

import com.example.pc_shop.model.Pc;
import com.example.pc_shop.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PcController {
    @Autowired
    private PcService pcService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/pcs")
    public List<Pc> getAllPcs() {
        return pcService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/pc")
    public Optional<Pc> getPcById(@RequestParam Integer id) {
        return pcService.findById(id);
    }
}
