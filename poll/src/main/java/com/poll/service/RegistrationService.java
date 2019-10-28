package com.poll.service;

import com.poll.excpection.EmployeeNotFoundException;
import com.poll.model.Registration;
import com.poll.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    public List<Registration> getAll() {
        return registrationRepository.findAll();
    }

    public Registration getById(long id) {
        return registrationRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Registration addRegistration(Registration registration) {
        Registration savedRegistration = registrationRepository.saveAndFlush(registration);

        return savedRegistration;
    }

    public void delete(long id) {
        registrationRepository.deleteById(id);
    }

    public Registration editRegistration(Registration registration){
        return registrationRepository.saveAndFlush(registration);
    }
}
