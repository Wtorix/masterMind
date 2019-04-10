package com.gamingservice.validators.userRegistration;

import com.gamingservice.annotations.userRegistration.UniqueUserLogin;
import com.gamingservice.dtos.user.UserRegistrationDto;
import com.gamingservice.services.user.UserRegistrationService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserLoginValidator implements ConstraintValidator<UniqueUserLogin, UserRegistrationDto> {

    private UserRegistrationService userRegistrationService;

    public UniqueUserLoginValidator(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    public void initialize(UniqueUserLogin constraint) {
    }

    public boolean isValid(UserRegistrationDto userRegistrationDto, ConstraintValidatorContext context) {
        return userRegistrationService.isLoginUnique(userRegistrationDto.getLogin());

    }
}
