package com.example.pc_shop_backend.controller;

import com.example.pc_shop_backend.model.Shipment;
import com.example.pc_shop_backend.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShipmentController {
    @Autowired
    private ShipmentService shipmentService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("shipments")
    public List<Shipment> getAllShipments() {
        return shipmentService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("addShipment")
    public Shipment addShipment(@RequestBody Shipment shipment) {
        return shipmentService.save(shipment);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("shipment")
    public Optional<Shipment> getShipmentById(@RequestParam Integer id) {
        return shipmentService.getShipmentById(id);
    }
}
