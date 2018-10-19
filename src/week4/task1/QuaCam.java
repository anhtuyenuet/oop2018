/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author Admin
 */
public class QuaCam extends HoaQua{
    
    protected String color;
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String s){
        this.color = s;
    }
    
    public QuaCam(String s, double price, String c) {
        this.type = s;
        this.price = price;
        this.color = c;
    }
    
    @Override
    public String toString() {
        return "Type: " + this.gettype() + " Color: " + this.getColor() + " Price: " + this.getPrice();
    }
    
}
