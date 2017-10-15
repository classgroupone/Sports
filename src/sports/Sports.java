/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sports;

/**
 *
 * @author KAMWANA
 */
public class Sports {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Description desc=new Description("India","Mhindi");
        Property prop=new Property("Japan","Leo","Oval","brown",15,30);
        Game mchezo=new Game("China","Naisa","Round","Football","leather");
        
        System.out.println("the ball originates from "+desc.getOrigin());
        System.out.println("the ball is "+prop.getColor()+" in color");
        System.out.println("the ball is made of "+mchezo.getMaterial());
    }
    
}
