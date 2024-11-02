package com.example.parcial.controllers;

import com.example.parcial.dtos.AdnRequest;
import com.example.parcial.dtos.AdnResponse;
import com.example.parcial.services.AdnService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mutant")
public class AdnController {

    private final AdnService dnaService;

    // Constructor para inyectar el servicio
    public AdnController(AdnService dnaService) {
        this.dnaService = dnaService;
    }

    @PostMapping
    public ResponseEntity<AdnResponse> checkMutant(@Valid @RequestBody AdnRequest dnaRequest) {
        boolean isMutant = dnaService.analyzeDna(dnaRequest.getDna());
        AdnResponse dnaResponse = new AdnResponse(isMutant);

        if (isMutant) {
            // Devuelve la respuesta con el objeto DnaResponse
            return ResponseEntity.status(HttpStatus.OK).body(dnaResponse);
        } else {
            // Devuelve la respuesta con el objeto DnaResponse
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(dnaResponse);
        }

    }

    @GetMapping
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("/mutant funciona");
    }
}