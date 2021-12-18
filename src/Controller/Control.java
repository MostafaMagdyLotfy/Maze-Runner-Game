/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cell;
import Model.Play;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Ramy
 */
public class Control extends KeyAdapter {
  
    public Control ()
    {
        
    }
      @Override
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        System.out.println("move right");
       Cell c=Model.Character.getInstance();
       
       if (keyCode==KeyEvent.VK_UP)
       { System.out.println("Move UP");
           ((Model.Character)c).move(0, -1);
       }
       if (keyCode==KeyEvent.VK_DOWN)
       { System.out.println("MoveDown");
           ((Model.Character)c).move( 0, 1);
           
       }
       if (keyCode==KeyEvent.VK_LEFT)
       { System.out.println("move left");
           ((Model.Character)c).move( -1,0);
           
       }
       if (keyCode==KeyEvent.VK_RIGHT)
       { System.out.println("move right");
               
           ((Model.Character)c).move( 1,0);
           
       }
        
    }
}
