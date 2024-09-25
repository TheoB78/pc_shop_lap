package com.example.pc_shop.controller;

import com.example.pc_shop.model.Shipment;
import com.example.pc_shop.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
