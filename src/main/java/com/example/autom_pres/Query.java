package com.example.autom_pres;

import org.springframework.http.ResponseEntity;

public interface Query <I,O> {
    ResponseEntity<O> execute(I input);
}
