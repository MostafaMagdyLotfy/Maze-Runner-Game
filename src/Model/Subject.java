/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Context;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Ramy
 */
public class Subject {
  private  ArrayList<Observer> observers;
   private int state;

    public Subject() {
        this.observers = new ArrayList<Observer>();
    }

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}

