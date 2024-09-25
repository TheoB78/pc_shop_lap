package com.example.pc_shop_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "reseller_id", nullable = false)
    private Reseller reseller;

    @OneToMany(mappedBy = "shipment")
    private List<Shipment_item> shipment_items;

}
