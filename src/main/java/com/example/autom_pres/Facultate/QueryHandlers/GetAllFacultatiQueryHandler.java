package com.example.autom_pres.Facultate.QueryHandlers;

import com.example.autom_pres.Facultate.FacultatiRepository;
import com.example.autom_pres.Facultate.Model.Facultate;
import com.example.autom_pres.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllFacultatiQueryHandler implements Query <Void,List<Facultate>> {
    private final FacultatiRepository facultatiRepository;

    public GetAllFacultatiQueryHandler(FacultatiRepository facultatiRepository) {
        this.facultatiRepository = facultatiRepository;
    }
    public ResponseEntity<List<Facultate>> execute(Void input) {
        List<Facultate> facultateList = facultatiRepository.findAll();
        return ResponseEntity.ok(facultateList);
    }
}
