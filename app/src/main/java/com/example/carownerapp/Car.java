package com.example.carownerapp;

public class Car {
    private String make;
    private String model;
    private String ownerName;
    private String regNum;
    private String plateNum;
    private String phoneNum;

    public Car(String make, String model, String ownerName, String regNum, String plateNum, String phoneNum) {
        this.make = make;
        this.model = model;
        this.ownerName = ownerName;
        this.regNum = regNum;
        this.plateNum = plateNum;
        this.phoneNum = phoneNum;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
