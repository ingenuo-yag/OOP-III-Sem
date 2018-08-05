/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirc;

/**
 *
 * @author Placement
 */
public class AreaCirc {

    public static void main(String args[]) 
    {
        int length,breadth,circ,area;
        length = Integer.parseInt(args[0]);
        breadth = Integer.parseInt(args[1]);
        System.out.println("The Length You Have Entered is: "+length);
        System.out.println("The Breadth You Have Entered is: "+breadth);
        circ = 2*(length+breadth);
        area = length*breadth;
        System.out.println("The Cirumference is: "+circ);
        System.out.println("The Area is: "+area);
        
    }
    
}
