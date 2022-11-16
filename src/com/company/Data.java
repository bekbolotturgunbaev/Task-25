package com.company;

public class Data {
    private int yearOfRelease;
    private String model;
    private int price;
    private String color;


    public Data(int yearOfRelease, String model, int price, String color) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "com.Data{" +
                "yearOfRelease=" + yearOfRelease +
                ", model=" + model +
                ", price=" + price + "rub" +
                ", color='" + color + '\'' +
                '}';
    }
}
