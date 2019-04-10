package com.gamingservice.services.user;

import com.gamingservice.models.User;
import com.gamingservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private UserRepository userRepository;

    public UserRegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public boolean isLoginUnique(String login) {
        return userRepository.findByLogin(login) == null;
    }

    @Override
    public boolean isEmailUnique(String email) {
        return userRepository.findByEmail(email) == null;
    }
}
