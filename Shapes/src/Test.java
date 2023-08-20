package com.company;

public class Test {
    public static void main(String[] args) {

        //Circle
        System.out.println("Circle");
        System.out.println();

        Circle circle = new Circle(2);

        System.out.println("Cap: " + circle.getRadius());

        circle.setRadius(11.8);

        System.out.println("Yeni cap: " + circle.getRadius());
        System.out.printf("%s %.2f %n","Alan:",circle.calculateArea());
        System.out.printf("%s %.2f %n","Cevre:",circle.calculateCircumference());

        //Rectangle
        System.out.println();
        System.out.println("Rectangle");
        System.out.println();


        Rectangle rectangle = new Rectangle(5.7, 9.8);

        System.out.println("Yukseklik: " + rectangle.getHeight());
        System.out.println("Genislik: " + rectangle.getWidth());

        rectangle.setHeight(12.8);
        rectangle.setWidth(17.8);

        System.out.println("Yeni yukseklik: " + rectangle.getHeight());
        System.out.println("Yeni genislik: " + rectangle.getWidth());
        System.out.printf("%s %.2f %n","Alan:",rectangle.calculateArea());
        System.out.printf("%s %.2f %n","Cevre:",rectangle.calculateCircumference());

        //Triangle

        System.out.println();
        System.out.println("Triangle");
        System.out.println();

        Triangle triangle = new Triangle(14.6, 6.7);

        System.out.println("Yukseklik: " + triangle.getHeight());
        System.out.println("Kenar: " + triangle.getBase());

        triangle.setHeight(13.1);
        triangle.setBase(5.8);

        System.out.println("Yeni yukseklik: " + triangle.getHeight());
        System.out.println("Yeni kenar: " + triangle.getBase());
        System.out.printf("%s %.2f %n","Alan:",triangle.calculateArea());
        System.out.printf("%s %.2f %n","Cevre:",triangle.calculateCircumference());
    }
}
