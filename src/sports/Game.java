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
public class Game extends Description{
    String shape, gametype, material;
    public Game(String a, String b, String c, String d, String e){
        super(a,b);
        this.shape=c;
        this.gametype=d;
        this.material=e;
    }
    public String getShape(){
        return this.shape;
    }
    public String getGametype(){
        return this.gametype;
    }
    public String getMaterial(){
        return this.material;
    }
    
}
