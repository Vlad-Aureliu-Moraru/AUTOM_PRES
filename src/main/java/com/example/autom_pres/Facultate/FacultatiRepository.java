package com.example.autom_pres.Facultate;

import com.example.autom_pres.Facultate.Model.Facultate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultatiRepository extends JpaRepository<Facultate ,Integer> {

    @Query("SELECT f FROM Facultate f WHERE f.denumire = :name")
    Optional<Facultate> findByNameWithJpql(@Param("name") String name);
}
