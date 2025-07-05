package com.example.autom_pres.Specializare.CommandHandler;

import com.example.autom_pres.Command;
import com.example.autom_pres.Facultate.FacultatiRepository;
import com.example.autom_pres.Facultate.Model.Facultate;
import com.example.autom_pres.Specializare.Model.Specializare;
import com.example.autom_pres.Specializare.Model.SpecializareDTO;
import com.example.autom_pres.Specializare.SpecializareRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AddSpecializareCommandHandler implements Command<SpecializareDTO, ResponseEntity> {
private final SpecializareRepository specializareRepository;
private final FacultatiRepository facultatiRepository;

public AddSpecializareCommandHandler(SpecializareRepository specializareRepository, FacultatiRepository facultatiRepository){
    this.specializareRepository = specializareRepository;
    this.facultatiRepository = facultatiRepository;
}


private Facultate getFacultatefromDTO(SpecializareDTO specializareDTO){
    Facultate  facultate =  facultatiRepository.findById(specializareDTO.getFacultateId()).get();
    if(facultate == null){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"FACULTATE DOES NOT EXIST");
    }
    return facultate;
}

    @Override
    public ResponseEntity execute(SpecializareDTO input) {
       Facultate facultate = getFacultatefromDTO(input);
       Specializare specializare =  new Specializare();
       specializare.setDenumire(input.getDenumire());
       specializare.setFacultate(facultate);
    try {
        specializareRepository.save(specializare);
        return ResponseEntity.ok().body("ok");
    }catch (Exception e){
        return ResponseEntity.badRequest().body("error"+ e.getMessage());
    }
    }
}
