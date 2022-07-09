package com.example.thyme.service;

import java.util.List;

import com.example.thyme.modal.Employee;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
