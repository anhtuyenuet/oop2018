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
public class Shape {
    
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * tra ve mo ta ve shape
     * @return mo ta ve shape
     */
    @Override
    public String toString() {
        if (this.filled) {
            return "Color: " + this.color + " filled";
        } else {
            return "Color: " + this.color + " not filled";
        }
    }
}
