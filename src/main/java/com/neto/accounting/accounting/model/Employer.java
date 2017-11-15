package com.neto.accounting.accounting.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by wande on 27/10/2017.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "employer01")
public class Employer {

    @Id
    @Column(name = "employer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Double pricePerHour;

    @Column
    private Double deductPerHour;

    @Column
    private Double amountLiquidPerHour;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private TypeWorkEnum typeOfWork;

    private int typeWork;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeWorkEnum getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(TypeWorkEnum typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public int getTypeWork() {
        return typeWork;
    }

    public void setTypeWork(int typeWork) {
        this.typeWork = typeWork;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getDeductPerHour() {
        return deductPerHour;
    }

    public void setDeductPerHour(Double deductPerHour) {
        this.deductPerHour = deductPerHour;
    }

    public Double getAmountLiquidPerHour() {
        return amountLiquidPerHour;
    }

    public void setAmountLiquidPerHour(Double amountLiquidPerHour) {
        this.amountLiquidPerHour = amountLiquidPerHour;
    }
}
