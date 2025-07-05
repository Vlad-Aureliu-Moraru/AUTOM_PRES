package com.example.autom_pres.Specializare.CommandHandler;

import com.example.autom_pres.Command;
import com.example.autom_pres.Facultate.FacultatiRepository;
import com.example.autom_pres.Facultate.Model.Facultate;
import com.example.autom_pres.Facultate.Model.FacultateDTO;
import com.example.autom_pres.Facultate.Model.FacultateDTOget;
import com.example.autom_pres.Specializare.Model.Specializare;
import com.example.autom_pres.Specializare.Model.SpecializareDTO;
import com.example.autom_pres.Specializare.SpecializareRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateSpecializareCommandHandler implements Command<SpecializareDTO, ResponseEntity> {
    private final SpecializareRepository specializareRepository;
    private final FacultatiRepository facultatiRepository;
    public UpdateSpecializareCommandHandler(SpecializareRepository specializareRepository,FacultatiRepository facultatiRepository){
        this.specializareRepository = specializareRepository;
        this.facultatiRepository = facultatiRepository;
    }
    @Override
    public ResponseEntity execute(SpecializareDTO input) {
        Facultate facultate = facultatiRepository.findByNameWithJpql(input.getFacultateDenumire()).get();
        if (facultate == null){
            throw new RuntimeException("MESSAGE");
        }

        Specializare specializare = new Specializare();
        specializare.setFacultate(facultate);
        specializare.setDenumire(input.getDenumire());
        specializare.setId(input.getId());
        specializareRepository.save(specializare);

        return ResponseEntity.ok().body("SUCCESSFULLY UPDATED SPEC WITH ID " + input.getId());
    }
}
