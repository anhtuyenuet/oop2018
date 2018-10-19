/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Layer {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
    public void printShape(){
        for(int i = 0; i < shapes.size(); i++){
            System.out.print("-");
            System.out.println(shapes.get(i));
        }
    }
    
    public void deleteTriangle(){
        for(int i = 0; i < shapes.size(); i++){
            if(getShapes().get(i) instanceof Triangle){
                getShapes().remove(i);
                i--;
            }
        }
    }
}
