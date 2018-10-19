/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.ArrayList;

public class Diagram {
    public static ArrayList<Layer> diagram = new ArrayList<Layer>();
    
    
    public static void deleteCircle(){
        for (int i = 0; i < Diagram.diagram.size(); i++){
            for(int j = 0; j < Diagram.diagram.get(i).getShapes().size(); j++){
               if(Diagram.diagram.get(i).getShapes().get(j) instanceof Circle){
                    Diagram.diagram.get(i).getShapes().remove(j);
                    j--;
                }
            }
        }
    }

}
