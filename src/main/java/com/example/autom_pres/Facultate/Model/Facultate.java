package com.example.autom_pres.Facultate.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "facultati")
public class Facultate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "denumire")
    private String denumire;

}
