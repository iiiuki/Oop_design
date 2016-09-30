package com.example.hiep.oop_design.c_liskov_substitution.not_violation;

/**
 * Created by Hiep on 9/30/2016.
 */
public abstract class Shape {
    protected  int width;
    protected  int height;

    public abstract int getWidth();

    public abstract void setWidth(int width);

    public abstract int getHeight();

    public abstract void setHeight(int height);

    public int getArea(){
       return width * height;
    }
}
