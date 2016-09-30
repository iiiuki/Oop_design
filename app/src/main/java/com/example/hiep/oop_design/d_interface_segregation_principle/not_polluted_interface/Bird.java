package com.example.hiep.oop_design.d_interface_segregation_principle.not_polluted_interface;

public class Bird implements Flyable, Runnable {
    @Override
    public void fly() {
        // write code about running of the bird
    }

    @Override
    public void run() {
        // write code about running of the bird
    }
}