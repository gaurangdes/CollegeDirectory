package com.college.service;

import com.college.exception.InvalidCredentialsException;
import com.college.exception.UserNotFoundException;
import com.college.model.User;
import com.college.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User validateUser(String username, String password, String role) throws InvalidCredentialsException, UserNotFoundException {
        User user = userRepository.findByUsernameAndRole(username, role)
                .orElseThrow(() -> new UserNotFoundException("User not found"));

        if (passwordEncoder.matches(password, user.getPassword())) {
            return user;
        } else {
            throw new InvalidCredentialsException("Invalid credentials");
        }
    }
}
