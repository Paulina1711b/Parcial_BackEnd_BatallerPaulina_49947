package com.example.parcial.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Base implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
}