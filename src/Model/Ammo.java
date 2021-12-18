/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ahmed
 */
public class Ammo implements Cell{
    int bullets=6;
      private int tilex;
     private int tiley;
    private static Ammo instance = new Ammo();
    private Image Bullet;
   private ImageIcon img;
      public Ammo()
    {
   
    }
       public static Ammo getInstance(){
      return instance;
   }
       public void SetTile(int tilex,int tiley){
           this.tilex=tilex;
           this.tiley=tiley;
           
       }
      public void move (int tx,int ty)
{
    tilex+=tx;
    tiley+=ty;
    
}
     
public int gettiley()
{
    return tiley;
}
public int gettilex()
{
    return tilex;
}
      
      public void SetAmmo(int a){
          bullets=a;
         
      }
    public int getAmmo(){
        return bullets;
    }

    @Override
    public void Setcell() {
  img= new ImageIcon("bullet.png");
     Bullet=img.getImage();
    }
    public void Setcell(int x){
     this.img= new ImageIcon();
     Bullet=img.getImage();
    }

    @Override
    public Image getCell() {
      return Bullet; 
    }
}
