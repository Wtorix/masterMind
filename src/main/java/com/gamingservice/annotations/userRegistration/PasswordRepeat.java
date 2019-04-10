package com.gamingservice.annotations.userRegistration;

import com.gamingservice.validators.userRegistration.PasswordRepeatValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordRepeatValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordRepeat {

    String message() default "Passwords are not the same!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
