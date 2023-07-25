package com.headfirst.designInventory.restInventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author gaura
 * @date 24-07-2023
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "giutar")
@Entity
public class Guitar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "serialNumber")
    private String serialNumber;

    @Column(name = "price")
    private double price;

    @Column(name = "builder")
    private String builder;

    @Column(name = "model")
    private String model;

    @Column(name = "type")
    private String type;

    @Column(name = "backWood")
    private String backWood;

    @Column(name = "topWood")
    private String topWood;

}
