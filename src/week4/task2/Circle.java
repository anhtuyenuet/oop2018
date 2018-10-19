/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    private final double pi = 3.14; //so pi
    double radius; //ban kinh
    
    public Circle(){
        this.radius = 1.0;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius() {
        this.radius = radius;
    }
    
    /**
     * phuong thuc tinh dien tich
     * @return dien tich
     */
    public double getArea() {
        double area = this.radius*this.radius*this.pi;
        return area; 
    }
    
    /**
     * phuong thuc tinh chu vi
     * @return chu vi
     */
    public double getPerimeter() {
        double per = this.radius*2*this.pi;
        return per;
    }
    
    @Override
    public String toString() {
        String tmp = "Color: " + this.getColor() + "Area: " + this.getArea() + "Perimeter: " + this.getPerimeter();
        return tmp;
    }
            
}
