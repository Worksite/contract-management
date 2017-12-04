package com.aconex.cost.contract.controllers;

import com.aconex.cost.contract.models.Contract;
import com.aconex.cost.contract.services.ContractService;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/contracts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContractsController {

    private final ContractService contractService;

    public ContractsController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GET
    @UnitOfWork
    public Response index() {
        List<Contract> contracts = contractService.findAll();
        return Response.ok(contracts).build();
    }
}
