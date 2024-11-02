package com.example.parcial.validators;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = AdnValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidAdn { // Cambié "interface" por "@interface"
    String message() default "Secuencia de ADN inválida";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}