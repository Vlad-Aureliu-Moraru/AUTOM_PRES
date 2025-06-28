package com.example.autom_pres.Facultate.CommandHandlers;

import com.example.autom_pres.Command;
import com.example.autom_pres.Facultate.FacultatiRepository;
import com.example.autom_pres.Facultate.Model.Facultate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DeleteFacultateCommandHandler implements Command<Integer, ResponseEntity> {
    private  final FacultatiRepository facultatiRepository;
    public DeleteFacultateCommandHandler(FacultatiRepository facultatiRepository) {
        this.facultatiRepository = facultatiRepository;
    }
    @Override
    public ResponseEntity execute(Integer input) {
        Facultate facultate = facultatiRepository.findById(input).orElse(null);
        if (facultate!=null){
            facultatiRepository.delete(facultate);
        }else{
            throw new RuntimeException("Facultate not found");
        }
        return ResponseEntity.ok().body("Deleted Facultate with id: " + input);
    }
}
