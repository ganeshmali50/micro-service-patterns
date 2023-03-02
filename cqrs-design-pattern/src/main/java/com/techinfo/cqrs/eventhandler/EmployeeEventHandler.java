package com.techinfo.cqrs.eventhandler;

import com.techinfo.cqrs.domain.Employee;
import com.techinfo.cqrs.dto.EmployeeEvent;
import com.techinfo.cqrs.repository.EmployeeRepository;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeEventHandler {

    @Autowired
    private EmployeeRepository employeeRepository;

    @EventHandler
    public void employeCretedEvent(EmployeeEvent employeeCreatedEvent){
        Employee emp = new Employee();
        BeanUtils.copyProperties(employeeCreatedEvent, emp);
        employeeRepository.save(emp);
    }
}
