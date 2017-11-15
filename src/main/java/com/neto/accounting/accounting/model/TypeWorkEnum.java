package com.neto.accounting.accounting.model;

/**
 * Created by wande on 27/10/2017.
 */
public enum TypeWorkEnum {
    ABN(0, "ABN"),
    TFN(1, "TFN");

    private final int value;
    private final String name;

    private TypeWorkEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }


    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
