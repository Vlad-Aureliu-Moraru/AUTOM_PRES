package com.example.autom_pres.Specializare;

import com.example.autom_pres.Specializare.CommandHandler.AddSpecializareCommandHandler;
import com.example.autom_pres.Specializare.CommandHandler.DeleteSpecializareCommandHandler;
import com.example.autom_pres.Specializare.CommandHandler.UpdateSpecializareCommandHandler;
import com.example.autom_pres.Specializare.QueryHandler.GetAllSpecializariQueryHandler;
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
    @PutMapping
    @DeleteMapping
    @PostMapping

}
