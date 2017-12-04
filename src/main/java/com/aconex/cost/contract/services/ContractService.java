package com.aconex.cost.contract.services;

import com.aconex.cost.contract.models.Contract;
import com.aconex.cost.contract.repositories.ContractRepository;

import java.util.List;

public class ContractService {

    private final ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
