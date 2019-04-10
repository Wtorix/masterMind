package com.gamingservice.annotations.userRegistration;

import com.gamingservice.validators.userRegistration.UniqueUserLoginValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueUserLoginValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueUserLogin {
    String message() default "Login is already in use, choose a different one!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
