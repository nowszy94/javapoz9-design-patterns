package com.sda.factory;

import com.sda.factory.model.BaseUnit;
import com.sda.factory.model.Level;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Select unit");
        System.out.println("0. Only range units");
        System.out.println("1. Knight");
        System.out.println("2. Archer");
        System.out.println("3. Spearman");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        BaseUnitFactory baseUnitFactory = new BaseUnitFactory(Level.NIGHTMARE);

        BaseUnit unit = null;
        if ("0".equals(name)) {
            String generation = scanner.nextLine();
            unit = baseUnitFactory.createRangedUnit(generation);
        } else {
            unit = baseUnitFactory.createNewBaseUnit(name);
        }
        System.out.println(unit);
    }
}
