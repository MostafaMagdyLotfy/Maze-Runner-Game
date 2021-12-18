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
 * @author Mostafa
 */
public class GiftA implements Cell {
  private static int x;
private Image Wall;
private ImageIcon img;
public GiftA()
{
     x=0;
}
    @Override
    public void Setcell() {
    img= new ImageIcon("armor.png");
     Wall=img.getImage();}

    @Override
    public Image getCell() {
return Wall;   
    }   
}
