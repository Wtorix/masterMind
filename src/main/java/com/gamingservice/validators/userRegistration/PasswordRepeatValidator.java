package com.gamingservice.validators.userRegistration;

import com.gamingservice.annotations.userRegistration.PasswordRepeat;
import com.gamingservice.dtos.user.UserRegistrationDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class PasswordRepeatValidator implements ConstraintValidator<PasswordRepeat, UserRegistrationDto> {

    public void initialize(PasswordRepeat constraint) {
    }

    @Override
    public boolean isValid(UserRegistrationDto userRegDto, ConstraintValidatorContext context) {
        return Objects.equals(userRegDto.getPassword(), userRegDto.getRepeatPassword());
    }
}
