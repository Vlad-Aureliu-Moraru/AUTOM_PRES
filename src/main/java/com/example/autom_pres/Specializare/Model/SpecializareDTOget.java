package com.example.autom_pres.Specializare.Model;

import com.example.autom_pres.Facultate.Model.Facultate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecializareDTOget {
    private String denumire;
    private String facultate;
}
