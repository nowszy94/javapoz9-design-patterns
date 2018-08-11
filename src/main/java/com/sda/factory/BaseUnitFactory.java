package com.sda.factory;

import com.sda.factory.model.BaseUnit;
import com.sda.factory.model.Level;
import com.sda.factory.model.MachineBaseUnit;

public class BaseUnitFactory {

    private Level level;
    private Integer multiplier;
//    private AktualnyStanBadan aktualnyStanBadan;

    public BaseUnitFactory(Level level) {
        this.level = level;
        this.multiplier = level.getMultiplier();
    }

    public BaseUnit createNewBaseUnit(String name) {
        BaseUnit unit = null;
        if ("knight".equalsIgnoreCase(name)) {
            unit = new BaseUnit("Knight", 100 , 10 * multiplier, 10, null);
        } else if ("archer".equalsIgnoreCase(name)) {
            unit = new BaseUnit("Archer", 50, 25 * multiplier, 5, null);
        } else if ("spearman".equalsIgnoreCase(name)) {
            unit = new BaseUnit("Spearman", 70, 15 * multiplier, 5, null);
        }
        return unit;
    }

    public BaseUnit createRangedUnit(String generation) {
        BaseUnit unit = null;
        if ("modern".equalsIgnoreCase(generation)) {
            unit = new BaseUnit("Rifleman", 150, 50, 30, null);
        } else if("not-modern".equalsIgnoreCase(generation)) {
            unit = new BaseUnit("Archer", 50, 25, 5, null);
        } else if ("machine".equalsIgnoreCase(generation)) {
//            unit = new MachineBaseUnit();
        }
        return unit;
    }
}
