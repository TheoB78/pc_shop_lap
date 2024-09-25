package com.example.pc_shop_backend.controller;

import com.example.pc_shop_backend.model.Pc;
import com.example.pc_shop_backend.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/save_pc")
    public Pc savePc(@RequestBody Pc pc) {
        return pcService.save(pc);
    }
}
