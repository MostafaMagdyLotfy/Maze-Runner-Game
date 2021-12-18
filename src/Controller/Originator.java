/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Memento;

/**
 *
 * @author Adel
 */
public class Originator {
     private int tx;
    private int ty;
    private int score;
    private int am;
    private int health;
    private int armor;
    private int time;

    public int getTime() {
        return time;
    }
     public void settx(int tx){
        this.tx = tx;
    }

    public void setTime(int time) {
        this.time = time;
    }
     public void setty(int ty){
        this.ty = ty;
    }
      public void setscore(int score){
     this.score = score;
    }
       public void setam(int am){
        this.am = am;
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

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

       public Memento saveStateToMemento(){
      return new Memento(tx ,ty ,score, am, health, armor,time);
   }
        public void getStateFromMemento(Memento memento){
      tx = memento.gettx();
      ty= memento.getty();
      score = memento.getscore();
      am = memento.getam();
      health = memento.getHealth();
      armor= memento.getArmor();
      time=memento.getTime();
   }
       
}
