package com.greatlearning.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}