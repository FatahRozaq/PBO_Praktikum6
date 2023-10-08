/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polban.jtk.pertemuan6.soal2;

/**
 *
 * @author USER
 */

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Circle circle1 = new Circle(3.0, "blue", false);
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle(4.0, 5.0, "purple", true);
        System.out.println(rectangle1);

        Square square1 = new Square(2.5, "yellow", true);
        System.out.println(square1);
    }
}
