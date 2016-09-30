package com.example.hiep.oop_design.c_liskov_substitution.violation;

class Square extends Rectangle {
    public void setWidth(int width) {
        m_width = width;
        m_height = width;
    }
 
    public void setHeight(int height) {
        m_width = height;
        m_height = height;
    }
 
}