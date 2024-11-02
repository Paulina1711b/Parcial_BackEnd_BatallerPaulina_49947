package com.example.parcial.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class AdnValidator implements ConstraintValidator<ValidAdn, String[]> {

    private static final String VALID_CHARACTERS = "AGTC";

    @Override
    public void initialize(ValidAdn constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String[] dna, ConstraintValidatorContext constraintValidatorContext) {
        if (dna == null) {
            return false;
        }

        int n = dna.length;
        if (n == 0) {
            return false;
        }

        for (String sequence : dna) {
            if (sequence == null || sequence.length() != n) {
                return false;
            }
            for (char c : sequence.toCharArray()) {
                if (VALID_CHARACTERS.indexOf(c) == -1) {
                    return false;
                }
            }
        }

        return true; // Asegúrate de devolver true si todas las validaciones pasan
    }
}
