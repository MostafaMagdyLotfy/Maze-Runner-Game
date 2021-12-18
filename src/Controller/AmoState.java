/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AmmoObserver;
import Model.HealthOb;
import Model.Play;
import Model.ScoreOb;
import Model.Subject;

/**
 *
 * @author Mostafa
 */
public class AmoState implements State{
     Play p=Play.getInstance();
Subject sub=new Subject();
public AmoState()
    {

        new AmmoObserver(sub);    
    }

    @Override
    public void doAction(Context context, int x, int y) {
     sub.setState(4);
        String S="s";
        p.SetString(x, y, S);
        context.setState(this);
    }
}
