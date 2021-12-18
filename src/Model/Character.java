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
 * @author Ramy
 */
public class Character implements Cell  {
     
     private int tilex;
     private int tiley;
     private static Character instance = new Character();
private Image Wall;
private ImageIcon img;
private Character()
{
     tilex=0;
     tiley=0;
     
}
  public static Character getInstance(){
      return instance;
   }
public void move (int tx,int ty)
{System.out.println("1111111111");
   
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
    @Override
    public void Setcell() {
    img= new ImageIcon("morta2.png");
     Wall=img.getImage();
    }

    @Override
    public Image getCell() {
return Wall;
}
}
