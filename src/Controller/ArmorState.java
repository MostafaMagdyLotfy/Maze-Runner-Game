/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.ArmorOb;
import Model.HealthOb;
import Model.Play;
import Model.ScoreOb;
import Model.Subject;

/**
 *
 * @author Mostafa
 */
public class  ArmorState implements State {
Subject sub = new Subject();
Play p =Play.getInstance();
 public ArmorState()
    {

       
           
            new ArmorOb(sub);
    }
    @Override
    public void doAction(Context context, int x, int y) {
        
    sub.setState(1);
        String S="s";
        p.SetString(x, y, S);
        context.setState(this);//To change body of generated methods, choose Tools | Templates.
    }
    
}
