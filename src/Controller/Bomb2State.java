/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HealthOb;
import Model.Play;
import Model.ScoreOb;
import Model.Subject;

/**
 *
 * @author Mostafa
 */
public class Bomb2State implements State{
    Play p=Play.getInstance();
Subject sub=new Subject();

    public Bomb2State()
    {
new HealthOb(sub);
           new ScoreOb(sub);
            
    }
    @Override
    public void doAction(Context context,int x,int y) {
        sub.setState(3);
        String S="s";
        p.SetString(x, y, S);
        context.setState(this);
       
  
     }
    public String toString()
    {
        return "Bomb State";
    }
  
}
