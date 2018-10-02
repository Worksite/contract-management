package com.aconex.cost.contract.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "contracts")
public class Contract {

    private Long id;
    private List<Contract> dependentContracts = new ArrayList<>();
    private Contract parent;

    private String code;
    private String description;
    private String vendor;

    private double budget;
    private double committed;
    private double forecast;
    private double paid;
    private double percentComplete;
    private DateTime createdAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public Contract setId(Long id) {
        this.id = id;
        return this;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "parent_id")
    public Contract getParent() {
        return parent;
    }

    public void setParent(Contract parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER)
    public List<Contract> getDependentContracts() {
        return dependentContracts;
    }

    public void setDependentContracts(List<Contract> dependentContracts) {
        this.dependentContracts = dependentContracts;
    }

    @Column(name = "created_at")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public Contract setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public Contract setCode(String code) {
        this.code = code;
        return this;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public Contract setDescription(String description) {
        this.description = description;
        return this;
    }

    @Column(name = "vendor")
    public String getVendor() {
        return vendor;
    }

    public Contract setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    @Column(name = "budget", columnDefinition = "NUMERIC")
    public double getBudget() {
        return budget;
    }

    public Contract setBudget(double budget) {
        this.budget = budget;
        return this;
    }

    @Column(name = "committed", columnDefinition = "NUMERIC")
    public double getCommitted() {
        return committed;
    }

    public Contract setCommitted(double committed) {
        this.committed = committed;
        return this;
    }

    @Column(name = "forecast", columnDefinition = "NUMERIC")
    public double getForecast() {
        return forecast;
    }

    public Contract setForecast(double forecast) {
        this.forecast = forecast;
        return this;
    }

    @Column(name = "paid", columnDefinition = "NUMERIC")
    public double getPaid() {
        return paid;
    }

    public Contract setPaid(double paid) {
        this.paid = paid;
        return this;
    }

    @Column(name = "percent_complete", columnDefinition = "NUMERIC")
    public double getPercentComplete() {
        return percentComplete;
    }

    public Contract setPercentComplete(double percentComplete) {
        this.percentComplete = percentComplete;
        return this;
    }
}
