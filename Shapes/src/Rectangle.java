// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU

package com.company;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width ;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (height + width);
    }
}
// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU
