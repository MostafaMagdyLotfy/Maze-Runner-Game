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
public class Finish implements Cell{
       private static int x;
private Image Wall;
private ImageIcon img;
 @Override
    public void Setcell() {
    img= new ImageIcon("finish.png");
     Wall=img.getImage();}

    @Override
    public Image getCell() {
return Wall;   
    }   
}
