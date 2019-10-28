package com.poll.repository;

import com.poll.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository  extends JpaRepository<Language,Long> {
}
