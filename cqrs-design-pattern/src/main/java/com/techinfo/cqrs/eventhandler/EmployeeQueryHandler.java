package com.techinfo.cqrs.eventhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techinfo.cqrs.domain.Employee;
import com.techinfo.cqrs.dto.EmployeeResponse;
import com.techinfo.cqrs.dto.GetEmployeeQuery;
import com.techinfo.cqrs.repository.EmployeeRepository;

@Component
public class EmployeeQueryHandler {
    @Autowired
    EmployeeRepository employeeRepository;

    @QueryHandler
    public List<EmployeeResponse> getEmployees(GetEmployeeQuery employeeQuery){

        List<EmployeeResponse> employeeResponses = new ArrayList<>();
        Optional<List<Employee>> employees = Optional.ofNullable(employeeRepository.findAll());

        if(employees.isPresent()){
            for (Employee empObj: employees.get()){
                EmployeeResponse response = new EmployeeResponse();
                BeanUtils.copyProperties(empObj,response);
                employeeResponses.add(response);
            }
        }

        return employeeResponses;
    }
}
