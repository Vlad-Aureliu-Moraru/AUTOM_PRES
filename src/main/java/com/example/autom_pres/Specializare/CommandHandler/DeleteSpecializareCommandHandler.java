package com.example.autom_pres.Specializare.CommandHandler;

import com.example.autom_pres.Command;
import com.example.autom_pres.Specializare.SpecializareRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DeleteSpecializareCommandHandler implements Command<Integer, ResponseEntity> {
    private final SpecializareRepository specializareRepository;

    public DeleteSpecializareCommandHandler(SpecializareRepository specializareRepository) {
        this.specializareRepository = specializareRepository;
    }
    @Override
    public ResponseEntity execute(Integer input) {


        return ResponseEntity.ok().body("SUCCESSFULLY DELETED SPECIALIZARE");
    }
}
