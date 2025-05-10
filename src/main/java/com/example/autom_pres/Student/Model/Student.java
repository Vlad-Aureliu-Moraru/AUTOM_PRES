package com.example.autom_pres.Student.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nume")
    private String name;
    @Column(name = "prenume")
    private String surname;
    @Column(name = "mac")
    private String MACaddress;
    @Column(name = "anul")
    private int year;
    @Column(name = "grupa")
    private int group;
}
