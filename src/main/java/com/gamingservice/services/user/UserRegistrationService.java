package com.gamingservice.services.user;

import com.gamingservice.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserRegistrationService {
    User register (User user);

    boolean isLoginUnique(String login);

    boolean isEmailUnique (String email);

}
