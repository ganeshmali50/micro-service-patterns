package com.techinfo.cqrs.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@Builder
public class EmployeeCommand {

    @TargetAggregateIdentifier
    private String uid;
    private String name;
    private String address;
    private String role;
    private String status;
}
