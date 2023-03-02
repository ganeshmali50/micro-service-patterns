package com.techinfo.cqrs.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techinfo.cqrs.command.EmployeeCommand;
import com.techinfo.cqrs.dto.EmployeeInfo;
import com.techinfo.cqrs.dto.EmployeeResponse;
import com.techinfo.cqrs.dto.GetEmployeeQuery;
import com.techinfo.cqrs.gateways.EmployeeGateway;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeGateway employeeGateway;

	@PostMapping("/employee")
	public String newEmployee(@Valid @RequestBody EmployeeInfo employeeInfo) {

		EmployeeCommand employeeCommand = EmployeeCommand.builder().uid(UUID.randomUUID().toString())
				.name(employeeInfo.getName()).address(employeeInfo.getAddress()).role(employeeInfo.getRole())
				.status("CREATED").build();

		return employeeGateway.sendAndWait(employeeCommand);
	}

	@GetMapping("/employees")
	public List<EmployeeResponse> getEmployees() {
		return employeeGateway.get();
	}

}
