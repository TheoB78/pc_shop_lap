package com.example.pc_shop_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Shipment_item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "shipment_id", nullable = false)
    private Shipment shipment;

    @ManyToMany
    @JoinTable(name = "shipment_item2addition",joinColumns = @JoinColumn(name = "shipment_item_id"), inverseJoinColumns = @JoinColumn(name = "addition_id"))
    private List<Addition> additions;

    @ManyToOne
    @JoinColumn(name = "pc_id")
    private Pc pc;

}
