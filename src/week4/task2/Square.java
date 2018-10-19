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
public class Square extends Rectangle{
    public Square() {
        super();
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String c, boolean f) {
        super(side, side, c, f);
    }
    
    public double getSide() {
        return this.length;
    }
    
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    
    @Override
    public void setWidth(double side) {
        this.width = side;
    }
    
    @Override
    public void setLength(double side) {
        this.length = side;
    }
    
    @Override
    public String toString() {
        String tmp = "Color: " + this.getColor() + " Area: " + this.getArea() + " Perimeter: " + this.getPerimeter();
        return tmp;
    }
}
