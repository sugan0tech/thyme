package com.example.thyme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thyme.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
