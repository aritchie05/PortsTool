package com.apex.model;

import java.io.Serializable;

public class Stat implements Serializable {

    private StatName name;
    private int value;

    Stat(StatName name, int value) {
        this.name = name;
        this.value = value;
    }

    public StatName getName() {
        return name;
    }

    public void setName(StatName name) {
        this.name = name;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }

    enum StatName {
        MORALE, COMBAT, SEAFARING, SPEED
    }
}