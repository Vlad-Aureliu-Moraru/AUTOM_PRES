package com.example.autom_pres.Facultate.CommandHandlers;

import com.example.autom_pres.Command;
import com.example.autom_pres.Facultate.FacultatiRepository;
import com.example.autom_pres.Facultate.Model.Facultate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddFacultateCommandHandler implements Command <Facultate,ResponseEntity> {
private FacultatiRepository facultatiRepository;
public AddFacultateCommandHandler(FacultatiRepository facultatiRepository){
    this.facultatiRepository=facultatiRepository;
}
    @Override
    public ResponseEntity execute(Facultate input) {
        facultatiRepository.save(input);
        return ResponseEntity.ok().build();
    }
}
