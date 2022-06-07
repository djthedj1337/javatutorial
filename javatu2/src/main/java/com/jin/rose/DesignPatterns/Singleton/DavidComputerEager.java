package com.jin.rose.DesignPatterns.Singleton;

public class DavidComputerEager {

    private static final DavidComputerEager davidC = new DavidComputerEager();

    private DavidComputerEager() {
    }

    public static DavidComputerEager getInstance() {
        return davidC;
    }

}

