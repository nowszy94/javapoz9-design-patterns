package com.sda.factory.model;

public enum Level {
    NORMAL(1), NIGHTMARE(5), HELL(15);

    public static Level create(int i) {
        if (i == 1) {
            return NORMAL;
        } else if (i == 2) {
            return NIGHTMARE;
        } else if (i == 3) {
            return HELL;
        }
        return null;
    }

    private Integer multiplier;

    Level(int multiplier) {
        this.multiplier = multiplier;
    }

    public Integer getMultiplier() {
        return multiplier;
    }
}
