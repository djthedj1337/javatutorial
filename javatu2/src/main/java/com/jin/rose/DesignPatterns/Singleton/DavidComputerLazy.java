package com.jin.rose.DesignPatterns.Singleton;

public class DavidComputerLazy {

    private static DavidComputerLazy dclInstance;

    private DavidComputerLazy(){}

    public static DavidComputerLazy getInstance() {
        if (dclInstance == null) {
            synchronized (DavidComputerLazy.class) {
                if (dclInstance == null) {
                    dclInstance = new DavidComputerLazy();
                }
            }
        }
        return dclInstance;
    }
}
