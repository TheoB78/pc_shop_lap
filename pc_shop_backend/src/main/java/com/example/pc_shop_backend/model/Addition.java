package com.example.pc_shop_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Addition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String addition_name;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    @JsonIgnore
    @ManyToMany(mappedBy = "additions")
    private List<Shipment_item> shipment_items;
}
