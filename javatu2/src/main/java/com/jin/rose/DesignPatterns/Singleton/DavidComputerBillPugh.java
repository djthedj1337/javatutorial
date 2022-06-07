package com.jin.rose.DesignPatterns.Singleton;

public class DavidComputerBillPugh {

    private DavidComputerBillPugh(){};

    private static class BillPughSingleton{
        private static final DavidComputerBillPugh instance = new DavidComputerBillPugh();
    }

    public static DavidComputerBillPugh getInstance() {
        return BillPughSingleton.instance;
    }


}
