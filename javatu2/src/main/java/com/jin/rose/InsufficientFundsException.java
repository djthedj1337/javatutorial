package com.jin.rose;


public class InsufficientFundsException extends Exception {
    private int difference;

    public InsufficientFundsException(int difference){
        this.difference = difference;

    }

    public int getDifference(){
        return difference;
    }
}
