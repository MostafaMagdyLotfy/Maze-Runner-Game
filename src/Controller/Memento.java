/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Adel
 */
public class Memento {
    private int tx;
    private int ty;
    private int score;
    private int am;
    private int health;
    private int armor;
    private int time;
    public Memento(int tx ,int ty ,int score,int am,int health,int armor,int time){
      this.tx = tx;
      this.ty = ty;
      this.score = score;
      this.am = am;
      this.armor=armor;
      this.health=health;
      this.time=time;
   }

    public int getTime() {
        return time;
    }

    public int gettx(){
        return tx;
    }
     public int getty(){
        return ty;
    }
      public int getscore(){
        return score;
    }
       public int getam(){
        return am;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }
       
}
