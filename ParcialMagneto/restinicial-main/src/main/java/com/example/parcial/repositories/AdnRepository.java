package com.example.parcial.repositories;

import com.example.parcial.entities.Adn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AdnRepository extends JpaRepository<Adn, Long> {
    // Aquí puedes agregar métodos personalizados si es necesariO
    Optional<Adn> findByDna(String dnaSequence);
    long countByIsMutant (boolean isMutant);
}