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
public class Property extends Description{
   String shape,color;
   int radius, pressure;
   public Property(String a, String b, String c, String d, int e, int f){
    super(a,b);
    this.shape=c;
    this.color=d;
    this.radius=e;
    this.pressure=f;
}
   public String getShape(){
    return this.shape;
    }
   public String getColor(){
    return this.color;
    }
   public int getRadius(){
       return this.radius;
    }
   public int getPressure(){
       return this.pressure;
    }
   
}
