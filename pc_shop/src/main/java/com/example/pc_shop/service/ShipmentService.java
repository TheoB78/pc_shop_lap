package com.example.pc_shop.service;

import com.example.pc_shop.model.Shipment;
import com.example.pc_shop.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService {
    @Autowired
    private ShipmentRepository shipmentRepository;

    public List<Shipment> findAll() {
        return shipmentRepository.findAll();
    }

    public Shipment save(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }
}
