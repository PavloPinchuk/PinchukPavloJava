package com.univ;

public class Bus {
    private String driverPIB;
    private String number;
    private String routeNumber;
    private String model;
    private int year;
    private int mileage;

    public Bus(String driverPIB, String number, String routeNumber, String model, int year, int mileage) {
        this.driverPIB = driverPIB;
        this.number = number;
        this.routeNumber = routeNumber;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getDriverPIB() {
        return driverPIB;
    }

    public String getNumber() {
        return number;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setDriverPIB(String driverPIB) {
        this.driverPIB = driverPIB;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString()
    {
        return "Bus: " + number + ", " + model + ", " + driverPIB + "}";
    }
}
