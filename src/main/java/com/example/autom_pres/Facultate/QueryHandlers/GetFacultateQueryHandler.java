package com.example.autom_pres.Facultate.QueryHandlers;

import com.example.autom_pres.Facultate.FacultatiRepository;
import com.example.autom_pres.Facultate.Model.Facultate;
import com.example.autom_pres.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetFacultateQueryHandler implements Query<Integer,Facultate> {
    private final FacultatiRepository facultatiRepository;
    public GetFacultateQueryHandler(FacultatiRepository facultatiRepository) {
        this.facultatiRepository = facultatiRepository;
    }
    @Override
    public ResponseEntity<Facultate> execute(Integer input) {
        Facultate facultate = facultatiRepository.findById(input).get();
        if(facultate==null){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok().body(facultate);
    }
}
