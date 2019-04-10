package com.gamingservice.dtos.user;

import com.gamingservice.annotations.userRegistration.PasswordRepeat;
import com.gamingservice.annotations.userRegistration.UniqueUserEmail;
import com.gamingservice.annotations.userRegistration.UniqueUserLogin;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Component
@Data
@UniqueUserLogin
@UniqueUserEmail
@PasswordRepeat
public class UserRegistrationDto {

    @NotBlank(message = "Login is required!")

    private String login;

    @NotBlank(message = "Password is required!")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,20}$", message = "Incorrect password pattern!")
    private String password;

    private String repeatPassword;

    @Email(message = "Wrong email pattern!")
    @NotBlank(message = "Email is required!")
    private String email;

}


