/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author CCNE
 */
public class Triangle extends Shape {
    private final String name = "Triangle";
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public Triangle() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    
    @Override
    public String toString() {
        String tmp = this.getName() + " - " + this.getColor();
        return tmp;
    }
   
}
