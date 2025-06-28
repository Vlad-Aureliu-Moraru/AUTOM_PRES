package com.example.autom_pres.Specializare.CommandHandler;

import com.example.autom_pres.Command;
import com.example.autom_pres.Specializare.Model.SpecializareDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UpdateSpecializareCommandHandler implements Command<SpecializareDTO, ResponseEntity> {

    @Override
    public ResponseEntity<ResponseEntity> execute(SpecializareDTO input) {
        return null;
    }
}
