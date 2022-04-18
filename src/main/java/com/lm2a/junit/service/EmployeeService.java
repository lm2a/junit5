package com.lm2a.junit.service;


import java.util.List;
import java.util.Optional;

import com.lm2a.junit.domain.Employee;

public interface EmployeeService {

    Integer count();

    List<Employee> findAll();

    Employee findOne(Long id);

    Optional<Employee> findOneOptional(Long id);

    Employee save(Employee employee);

    boolean delete(Long id);

    void deleteAll();
}
