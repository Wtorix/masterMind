package com.gamingservice.validators.userRegistration;

import com.gamingservice.annotations.userRegistration.UniqueUserEmail;
import com.gamingservice.dtos.user.UserRegistrationDto;
import com.gamingservice.services.user.UserRegistrationService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserEmailValidator implements ConstraintValidator<UniqueUserEmail, UserRegistrationDto> {

    private UserRegistrationService userRegistrationService;

    public UniqueUserEmailValidator(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    public void initialize(UniqueUserEmail constraint) {
    }

    public boolean isValid(UserRegistrationDto userRegistrationDto, ConstraintValidatorContext context) {

        return userRegistrationService.isEmailUnique(userRegistrationDto.getEmail());
    }
}
