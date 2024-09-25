package com.example.pc_shop_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pc_name;

    @Column(precision = 10, scale = 2)
    private BigDecimal base_price;

    private Integer ram;

    private String processor;

    private Integer pc_memory;

    private String image_path;
}
