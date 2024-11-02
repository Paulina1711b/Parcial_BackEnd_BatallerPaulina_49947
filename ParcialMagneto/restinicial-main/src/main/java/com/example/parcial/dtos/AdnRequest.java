package com.example.parcial.dtos;


import com.example.parcial.validators.ValidAdn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdnRequest {
@ValidAdn
    private String[] dna;
}
