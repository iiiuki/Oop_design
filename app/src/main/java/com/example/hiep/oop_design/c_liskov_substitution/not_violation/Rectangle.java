package com.example.hiep.oop_design.c_liskov_substitution.not_violation;

public class Rectangle extends Shape {
    @Override
    public int getWidth() {
        return width;
    }
 
    @Override
    public int getHeight() {
        return height;
    }
 
    @Override
    public void setWidth(int inWidth) {
        this.width = inWidth;
    }
 
    @Override
    public void setHeight(int inHeight) {
        this.height = inHeight;
    }
 
}