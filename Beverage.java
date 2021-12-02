package com.cafe.menu;

public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRADE = 1;
    public static final int VENTI = 2;

    String name; int basePrice; int size;
    public void setSize(int size) {
        this.size = size;
    }
}