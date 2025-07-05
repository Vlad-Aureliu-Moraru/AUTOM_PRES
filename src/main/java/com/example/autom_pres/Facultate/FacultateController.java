package com.example.autom_pres.Facultate;

import com.example.autom_pres.Facultate.CommandHandlers.AddFacultateCommandHandler;
import com.example.autom_pres.Facultate.CommandHandlers.DeleteFacultateCommandHandler;
import com.example.autom_pres.Facultate.CommandHandlers.UpdateFacultateCommandHandler;
import com.example.autom_pres.Facultate.Model.Facultate;
import com.example.autom_pres.Facultate.Model.FacultateDTO;
import com.example.autom_pres.Facultate.QueryHandlers.GetAllFacultatiQueryHandler;
import com.example.autom_pres.Facultate.QueryHandlers.GetFacultateQueryHandler;
import com.example.autom_pres.Student.CommandHandlers.AddStudentCommandHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facultati")
public class FacultateController {
    private final GetAllFacultatiQueryHandler  getAllFacultatiQueryHandler;
    private final AddFacultateCommandHandler addFacultateCommandHandler;
    private final UpdateFacultateCommandHandler updateFacultateCommandHandler;
    private final DeleteFacultateCommandHandler deleteFacultateCommandHandler;
    private final GetFacultateQueryHandler getFacultateQueryHandler;

    public FacultateController(GetAllFacultatiQueryHandler getAllFacultatiQueryHandler,GetFacultateQueryHandler getFacultateQueryHandler,UpdateFacultateCommandHandler updateFacultateCommandHandler, DeleteFacultateCommandHandler deleteFacultateCommandHandler,AddFacultateCommandHandler addFacultateCommandHandler) {
        this.getAllFacultatiQueryHandler = getAllFacultatiQueryHandler;
        this.addFacultateCommandHandler= addFacultateCommandHandler;
        this.updateFacultateCommandHandler = updateFacultateCommandHandler;
        this.deleteFacultateCommandHandler = deleteFacultateCommandHandler;
        this.getFacultateQueryHandler = getFacultateQueryHandler;
    }

    @GetMapping
    public ResponseEntity getFacultate(){
        return getAllFacultatiQueryHandler.execute(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Facultate> getFacultateById(@PathVariable Integer id){
        return getFacultateQueryHandler.execute(id);
    }

    @PostMapping
    public ResponseEntity addFacultate(@RequestBody Facultate facultate){
        return addFacultateCommandHandler.execute(facultate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFacultate(@PathVariable Integer id){
        return deleteFacultateCommandHandler.execute(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateFacultate(@PathVariable Integer id, @RequestBody Facultate facultate){
        FacultateDTO facultateDTO = new FacultateDTO(id, facultate);
        return updateFacultateCommandHandler.execute(facultateDTO);
    }
}
