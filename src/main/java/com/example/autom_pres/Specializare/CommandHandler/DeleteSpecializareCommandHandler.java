package com.example.autom_pres.Specializare.CommandHandler;

import com.example.autom_pres.Command;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DeleteSpecializareCommandHandler implements Command<Integer, ResponseEntity> {

    @Override
    public ResponseEntity<ResponseEntity> execute(Integer input) {
        return null;
    }
}
