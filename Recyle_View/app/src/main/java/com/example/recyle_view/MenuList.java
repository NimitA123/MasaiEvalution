package com.example.recyle_view;

public class MenuList {
    private int image;
    private String name;
    private double price;

    public int getImage() {

        return image;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public MenuList(int image, String name, double price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }


}