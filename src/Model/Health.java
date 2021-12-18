/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mostafa
 */
public class Health {
   int h=100;
    public Health()
    {
        
    }
    public void SetHealth(int h,int x)
    {
        if ( x==1)
        {
          h-=25;
          this.h=h;
        }
        if(x==2)
        {
            h-=50;
            this.h=h;
        }
        if(x==3)
        {
            h+=25;
            this.h=h;
        }
    }
    public int getHealth()
    {
        return h;
    }       
}
