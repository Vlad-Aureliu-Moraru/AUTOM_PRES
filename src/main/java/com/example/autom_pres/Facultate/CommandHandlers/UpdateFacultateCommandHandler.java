package com.example.autom_pres.Facultate.CommandHandlers;

import com.example.autom_pres.Command;
import com.example.autom_pres.Facultate.FacultatiRepository;
import com.example.autom_pres.Facultate.Model.Facultate;
import com.example.autom_pres.Facultate.Model.FacultateDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UpdateFacultateCommandHandler implements Command<FacultateDTO, ResponseEntity> {
    private final FacultatiRepository facultatiRepository;
    public  UpdateFacultateCommandHandler(FacultatiRepository facultatiRepository) {
        this.facultatiRepository = facultatiRepository;
    }
    @Override
    public ResponseEntity execute(FacultateDTO input) {
        Facultate toReplace = facultatiRepository.findById(input.getId()).get();
        if(toReplace == null){
            throw new RuntimeException("Facultate not found");
        }
        Facultate facultate = input.getFacultate();
        int id =  input.getId();
        facultate.setId(id);
        facultatiRepository.save(facultate);
        return ResponseEntity.ok().body("Updated Facultate with id: " + id);
    }
}
