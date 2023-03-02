package com.techinfo.cqrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techinfo.cqrs.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeId(long empId);
}
