/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{
    protected double width; //chieu rong
    protected double length; //chieu dai
    private final String name = "Rectangle";
    
    
    @Override
    public String getName() {
        return this.name;
    }
    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }
    
    public Rectangle(double w, double l) {
        this.length = l;
        this.width = w;
    }
    
    public Rectangle(double w, double l, String c, boolean f) {
        this.length = l;
        this.width = w;
        this.color = c;
        this.filled = f;
    }
    
    public double getWidth() {
        return this.width; 
    }
    
    public void setWidth(double w) {
        this.width = w;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public void setLength(double l) {
        this.length = l;
    }
    
    /**
     * phuong thuc tinh dien tich
     * @return dien tich
     */
    public double getArea() {
        return this.length*this.width;
    }
    
    /**
     * phuong thuc tinh chu vi
     * @return chu vi
     */
    public double getPerimeter() {
        return 2*(this.length+this.width);
    }
    
    @Override
    public String toString() {
        String tmp = this.getName() + " - " + this.getColor() + " Area: " + this.getArea();
        return tmp;
    }
}
