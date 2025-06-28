package com.example.autom_pres.Student.Model;

import com.example.autom_pres.Specializare.Model.Specializare;
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

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column (name = "password_hash")
    private String passwordHash;

    @Column(name = "year_of_study")
    private int year;

    @Column(name = "group_number")
    private int group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specializare_id" , nullable = false)
    private Specializare specializare;

}
