package com.example.autom_pres.Facultate.CommandHandlers;

import com.example.autom_pres.Command;
import com.example.autom_pres.Facultate.Model.Facultate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddFacultateCommandHandler implements Command <Facultate,Void> {


    @Override
    public ResponseEntity<Void> execute(Facultate input) {

        return ResponseEntity.ok().build();
    }
}
