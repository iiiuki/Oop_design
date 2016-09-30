package com.example.hiep.oop_design.d_interface_segregation_principle.not_polluted_interface;

public class Dog implements Runnable, Barkable {
    public void bark() {
        // write code about barking of the dog
    }
 
    public void run() {
        // write code about running of the dog
    }
}