package com.example.autom_pres.Facultate;

import com.example.autom_pres.Facultate.Model.Facultate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultatiRepository extends JpaRepository<Facultate ,Integer> {

}
