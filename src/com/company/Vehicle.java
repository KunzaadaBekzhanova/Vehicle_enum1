package com.company;

public abstract class Vehicle {
    private String model;
    private int year;
    private Engine type;

    public Vehicle(String model, int year, Engine type) {
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        if (year<1991) {
            throw new InvalidIssueYear("Старая модель");
        }else
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getType() {
        return type;
    }

    public void setType(Engine type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", type=" + type +
                '}';
    }
}
