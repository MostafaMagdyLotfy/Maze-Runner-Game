/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Ramy
 */
public interface State {
     public void doAction(Context context, int x,int y);
   public String toString();}
