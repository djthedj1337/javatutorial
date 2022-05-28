package com.jin.rose.Checkings;


public class InsufficientFundsException extends Exception {
    private int difference;

    public InsufficientFundsException(int difference){
        this.difference = difference;

    }

    public int getDifference(){
        return difference;
    }
}
