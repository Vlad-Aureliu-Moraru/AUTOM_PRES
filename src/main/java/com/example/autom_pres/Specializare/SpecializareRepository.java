package com.example.autom_pres.Specializare;

import com.example.autom_pres.Specializare.Model.Specializare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializareRepository extends JpaRepository<Specializare, Integer> {
}
