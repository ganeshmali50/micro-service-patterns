package com.techinfo.cqrs.gateways;

import java.util.List;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techinfo.cqrs.command.EmployeeCommand;
import com.techinfo.cqrs.dto.EmployeeResponse;
import com.techinfo.cqrs.dto.GetEmployeeQuery;

@Component
public class EmployeeGateway {

	@Autowired
	private CommandGateway commandGateway;

	@Autowired
	QueryGateway queryGateway;

	public String sendAndWait(EmployeeCommand employeeCommand) {

		return commandGateway.sendAndWait(employeeCommand);
	}

	public List<EmployeeResponse> get() {

		GetEmployeeQuery employeeQuery = new GetEmployeeQuery();

		return queryGateway.query(employeeQuery, ResponseTypes.multipleInstancesOf(EmployeeResponse.class)).join();

	}

}
