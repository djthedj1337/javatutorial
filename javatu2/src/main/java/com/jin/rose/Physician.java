package com.jin.rose;

public class Physician extends MedicalStaff {
    @Override
    public void diagnose() {
        System.out.println("Patient has been diagnosed by the attending physician.");
    }

    public void treat(){
        super.treat();
    }

    public void treat(int x){
        System.out.println("Patient has been treated x" + x);
    }

}
