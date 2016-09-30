package com.example.hiep.oop_design.c_liskov_substitution.violation;

class LspTest {
    private static Rectangle getNewRectangle() {
        return new Square();
    }
    /*
    public static void main(String args[]) {
        Rectangle r = LspTest.getNewRectangle();

        r.setWidth(5);
        r.setHeight(10);
        // user knows that r it's a rectangle.
        // It assumes that he's able to set the width and height as for the base
        // class

        System.out.println(r.getArea());
        // now he's surprised to see that the area is 100 instead of 50.
        // Diện tích = 100 ?
    }
     */
}