package com.example.autom_pres.Specializare.QueryHandler;

import com.example.autom_pres.Query;
import com.example.autom_pres.Specializare.Model.Specializare;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllSpecializariQueryHandler implements Query<Void, List<Specializare>> {

    @Override
    public ResponseEntity<List<Specializare>> execute(Void input) {
        return null;
    }
}
