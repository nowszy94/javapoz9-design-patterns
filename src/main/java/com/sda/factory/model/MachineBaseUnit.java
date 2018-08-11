package com.sda.factory.model;

import java.util.List;

public class MachineBaseUnit extends BaseUnit {

    private Integer weight;

    public MachineBaseUnit(String name, Integer health, Integer baseAttack, Integer baseDefence, List<Attribute> attributes, Integer weight) {
        super(name, health, baseAttack, baseDefence, attributes);
        this.weight = weight;
    }
}
