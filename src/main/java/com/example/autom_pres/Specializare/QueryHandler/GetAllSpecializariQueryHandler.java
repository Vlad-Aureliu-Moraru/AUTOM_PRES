package com.example.autom_pres.Specializare.QueryHandler;

import com.example.autom_pres.Query;
import com.example.autom_pres.Specializare.Model.Specializare;
import com.example.autom_pres.Specializare.Model.SpecializareDTO;
import com.example.autom_pres.Specializare.Model.SpecializareDTOget;
import com.example.autom_pres.Specializare.SpecializareRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GetAllSpecializariQueryHandler implements Query<Void, List<SpecializareDTOget>> {
private final SpecializareRepository specializareRepository;
public GetAllSpecializariQueryHandler(SpecializareRepository specializareRepository) {
    this.specializareRepository = specializareRepository;
}
    @Override
    public ResponseEntity<List<SpecializareDTOget>> execute(Void input) {
    try {
        List<SpecializareDTOget> specializares = specializareRepository.findAll().stream()
                .map(specializare ->
                        new SpecializareDTOget(specializare.getDenumire(),specializare.getFacultate().getDenumire()
                        )).toList();
        return  ResponseEntity.ok().body(specializares);
    }catch (Exception e){
        throw  new ResponseStatusException(HttpStatus.NO_CONTENT,e.getMessage());
    }
    }
}
