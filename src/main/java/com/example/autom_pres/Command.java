package com.example.autom_pres;

import org.springframework.http.ResponseEntity;

public interface Command <E,T>{
    ResponseEntity<T> execute(E input);
}
