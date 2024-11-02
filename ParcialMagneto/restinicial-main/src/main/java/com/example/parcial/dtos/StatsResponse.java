package com.example.parcial.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StatsResponse {
    @JsonProperty("COUNT_Mutant")
        private long countMutantDna;

    @JsonProperty("COUNT_Human")
        private long countHumanDna;

     private double ratio;
}
