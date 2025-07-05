package com.example.autom_pres.Specializare.Model;

import com.example.autom_pres.Facultate.Model.Facultate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "specializari")
@AllArgsConstructor
@NoArgsConstructor
public class Specializare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "denumire")
    private String denumire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facultate_id" , nullable = false)
    private Facultate facultate;


}
