package com.poll.service;

import com.poll.excpection.EmployeeNotFoundException;
import com.poll.model.Test_result;
import com.poll.repository.Test_resultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test_resultService {
    @Autowired
    private Test_resultRepository test_resultRepository;

    public List<Test_result> getAll() {
        return test_resultRepository.findAll();
    }

    public Test_result getById(long id) {
        return test_resultRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Test_result addTest_result(Test_result test_result) {
        Test_result savedTest_result = test_resultRepository.saveAndFlush(test_result);

        return savedTest_result;
    }

    public void delete(long id) {
        test_resultRepository.deleteById(id);
    }

    public Test_result editTest_result(Test_result test_result){
        return test_resultRepository.saveAndFlush(test_result);
    }
}
