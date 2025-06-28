package com.example.autom_pres.Facultate;

import com.example.autom_pres.Facultate.Model.Facultate;
import com.example.autom_pres.Facultate.QueryHandlers.GetAllFacultatiQueryHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facultati")
public class FacultateController {
    private GetAllFacultatiQueryHandler  getAllFacultatiQueryHandler;

    public FacultateController(GetAllFacultatiQueryHandler getAllFacultatiQueryHandler) {
        this.getAllFacultatiQueryHandler = getAllFacultatiQueryHandler;
    }

    @GetMapping
    public ResponseEntity getFacultate(){
        return getAllFacultatiQueryHandler.execute(null);
    }

    @PostMapping
    public ResponseEntity addFacultate(){
        return ResponseEntity.ok().body("POST");
    }

    @DeleteMapping
    public ResponseEntity deleteFacultate(){
        return ResponseEntity.ok().body("DELETE");
    }

    @PutMapping
    public ResponseEntity updateFacultate(){
        return ResponseEntity.ok().body("PUT");
    }
}
