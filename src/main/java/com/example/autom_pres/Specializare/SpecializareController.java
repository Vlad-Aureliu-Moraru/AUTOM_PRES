package com.example.autom_pres.Specializare;

import com.example.autom_pres.Specializare.CommandHandler.AddSpecializareCommandHandler;
import com.example.autom_pres.Specializare.CommandHandler.DeleteSpecializareCommandHandler;
import com.example.autom_pres.Specializare.CommandHandler.UpdateSpecializareCommandHandler;
import com.example.autom_pres.Specializare.Model.Specializare;
import com.example.autom_pres.Specializare.Model.SpecializareDTO;
import com.example.autom_pres.Specializare.Model.SpecializareDTOget;
import com.example.autom_pres.Specializare.QueryHandler.GetAllSpecializariQueryHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/specializare")
public class SpecializareController {
    private final AddSpecializareCommandHandler addSpecializareCommandHandler;
    private final UpdateSpecializareCommandHandler updateSpecializareCommandHandler;
    private final DeleteSpecializareCommandHandler deleteSpecializareCommandHandler;
    private final GetAllSpecializariQueryHandler getAllSpecializariQueryHandler;

    public SpecializareController(AddSpecializareCommandHandler addSpecializareCommandHandler, UpdateSpecializareCommandHandler updateSpecializareCommandHandler,DeleteSpecializareCommandHandler deleteSpecializareCommandHandler , GetAllSpecializariQueryHandler getAllSpecializariQueryHandler) {
        this.addSpecializareCommandHandler = addSpecializareCommandHandler;
        this.updateSpecializareCommandHandler = updateSpecializareCommandHandler;
        this.deleteSpecializareCommandHandler = deleteSpecializareCommandHandler;
        this.getAllSpecializariQueryHandler = getAllSpecializariQueryHandler;
    }

    @GetMapping
    private ResponseEntity getAllSpecializari(){
        try {
            return getAllSpecializariQueryHandler.execute(null);
        }catch (Exception e){
            throw  new RuntimeException("<UNK>");
        }

    }
    @PutMapping("/{id}")
    private ResponseEntity updateSpecializare(@PathVariable Integer id ,@RequestBody SpecializareDTOget specializare){
        SpecializareDTO specializareDTO = new SpecializareDTO();
        specializareDTO.setDenumire(specializare.getDenumire());
        specializareDTO.setId(id);
        specializareDTO.setFacultateDenumire(specializare.getFacultate());
        return  updateSpecializareCommandHandler.execute(specializareDTO);
    }
    @DeleteMapping
    private ResponseEntity deleteSpecializare(@RequestBody Specializare specializare){
        return ResponseEntity.ok().body("ok");
    }
    @PostMapping
    private ResponseEntity addSpecializare(@RequestBody SpecializareDTO specializare){
        return addSpecializareCommandHandler.execute(specializare);
    }
}
