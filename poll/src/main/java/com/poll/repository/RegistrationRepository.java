package com.poll.repository;

import com.poll.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository  extends JpaRepository<Registration,Long> {
}
