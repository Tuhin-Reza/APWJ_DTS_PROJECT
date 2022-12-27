package com.service;

import com.domain.Registration;
import com.repository.RegistrationRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrationServiceImp implements RegistrationService{

    private RegistrationRepository registrationRepository;

    private PasswordEncoder passwordEncoder;

    public RegistrationServiceImp(RegistrationRepository registrationRepository, PasswordEncoder passwordEncoder) {
        this.registrationRepository = registrationRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Transactional
    public Registration create(Registration registration) {
        registration.setPassword(passwordEncoder.encode(registration.getPassword()));
        return registrationRepository.create(registration);
    }
}
