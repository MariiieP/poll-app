package com.poll.service;

import com.poll.excpection.EmployeeNotFoundException;
import com.poll.model.Language;
import com.poll.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAll() {
        return languageRepository.findAll();
    }

    public Language getById(long id) {
        return languageRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Language addLanguage(Language language) {
        Language savedLanguage = languageRepository.saveAndFlush(language);

        return savedLanguage;
    }

    public void delete(long id) {
        languageRepository.deleteById(id);
    }

    public Language editPoll(Language language){
        return languageRepository.saveAndFlush(language);
    }
}
