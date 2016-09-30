package com.example.hiep.oop_design.c_liskov_substitution.not_violation;

public class Square extends Shape {
 
    @Override
    public int getWidth() {
        return width;
    }
 
    @Override
    public void setWidth(int inWidth) {
        SetWidthAndHeight(inWidth);
    }
 
    @Override
    public int getHeight() {
        return height;
    }
 
    @Override
    public void setHeight(int inHeight) {
        SetWidthAndHeight(inHeight);
    }
 
    private void SetWidthAndHeight(int inValue) {
        height = inValue;
        width = inValue;
    }
}