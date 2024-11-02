package com.example.parcial.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Adn extends Base implements Serializable {
private String dna;
private boolean isMutant;


}
