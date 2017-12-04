package com.aconex.cost.contract.repositories;

import com.aconex.cost.contract.models.Contract;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import java.util.List;

public class ContractRepository {

    private final SessionFactory sessionFactory;

    public ContractRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    public List<Contract> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(Contract.class).addOrder(Order.asc("code")).list();
    }
}
