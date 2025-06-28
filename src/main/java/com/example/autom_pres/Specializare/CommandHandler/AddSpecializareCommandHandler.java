package com.example.autom_pres.Specializare.CommandHandler;

import com.example.autom_pres.Command;
import com.example.autom_pres.Specializare.Model.Specializare;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddSpecializareCommandHandler implements Command<Specializare, ResponseEntity> {


    @Override
    public ResponseEntity<ResponseEntity> execute(Specializare input) {
        return null;
    }
}
