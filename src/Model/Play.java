/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Ramy
 */
public class Play {
        private  int health =100; 
private int score=0;
private int ammo=6;
    private static Play instance = new Play();
   private String  f [][]=new String[30][30];
private int armor=0;
   Cell c;
   private int total;

   private Play(){
 
   
   }
 
   //Get the only object available
  public static Play getInstance(){
      return instance;
   }
 public void makemaze(Graphics g)
 {
     Scanner scan=null;
       try {
           scan = new Scanner(new File("Game2.txt"));
        
       } catch (FileNotFoundException ex) {
         
           Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
         
       }
         String zer;
     
    for (int i=0;i<30;i++){
             for(int j=0;j<30;j++){
                 if(scan.hasNext()){
               zer=scan.next();
   f[i][j]=zer;
                      }
 
                }
         }
     for(int y=0;y<30;y++){
         for(int x=0;x<30;x++){
             if(f[y][x].equals("w"))
         {
             c= new Block();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
            
         if(f[y][x].equals("h"))
         {
             c= new GiftH();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("a"))
         {
             c= new GiftA();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("b"))
         {
             c= new Bomb();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("B"))
         {
             c= new TNT();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
           if(f[y][x].equals("t"))
         {
             c= new Tree();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
               if(f[y][x].equals("p"))
         {
             c= new GiftB();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
                              if(f[y][x].equals("f"))
         {
             c= new Finish();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
                                     if(f[y][x].equals("z"))
         {
             c= new Checkpoint();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("s"))
         {
             c= new Grass();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }     
         }
 
 }   Cell v=Character.getInstance();
 v.Setcell();
 g.drawImage(v.getCell(), ((Character)v).gettilex()*22, ((Character)v).gettiley()*22, null);   
     
 }
  public void DrawSavedMap(String filename,Graphics g){
         Scanner scan=null;
       try {
           scan = new Scanner(new File(filename));
        
       } catch (FileNotFoundException ex) {
         
           Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
         
       }
         String zer;
     
    for (int i=0;i<30;i++){
             for(int j=0;j<30;j++){
                 if(scan.hasNext()){
               zer=scan.next();
   f[i][j]=zer;
                      }
 
                }
         }
     for(int y=0;y<30;y++){
         for(int x=0;x<30;x++){
             if(f[y][x].equals("w"))
         {
             c= new Block();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
            
         if(f[y][x].equals("h"))
         {
             c= new GiftH();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("a"))
         {
             c= new GiftA();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("b"))
         {
             c= new Bomb();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("B"))
         {
             c= new TNT();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
           if(f[y][x].equals("t"))
         {
             c= new Tree();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
               if(f[y][x].equals("p"))
         {
             c= new GiftB();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
                 if(f[y][x].equals("z"))
         {
             c= new Checkpoint();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
         }
     }
       Cell v=Character.getInstance();
 v.Setcell();
 g.drawImage(v.getCell(), ((Character)v).gettilex()*22, ((Character)v).gettiley()*22, null);   
    }

    public String getString(int x, int y)
    {
        return f[y][x];
    }
    public void SetString(int x,int y,String vr)
    {
        f[y][x]=vr;
    }
    public void makemaze2(Graphics g)
    {
     for(int y=0;y<30;y++){
         for(int x=0;x<30;x++){
             if(f[y][x].equals("w"))
         {
             c= new Block();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
            
         if(f[y][x].equals("h"))
         {
             c= new GiftH();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("a"))
         {
             c= new GiftA();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("b"))
         {
             c= new Bomb();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
          if(f[y][x].equals("B"))
         {
             c= new TNT();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
           if(f[y][x].equals("t"))
         {
             c= new Tree();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
               if(f[y][x].equals("p"))
         {
             c= new GiftB();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
                      if(f[y][x].equals("f"))
         {
             c= new Finish();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
           if(f[y][x].equals("z"))
         {
             c= new Checkpoint();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }
               if(f[y][x].equals("s"))
         {
             c= new Grass();
             c.Setcell();
             g.drawImage(c.getCell(), x*22, y*22, null);
         }                                       
         }
 
 }  
     Cell v=Character.getInstance();
 v.Setcell();
 g.drawImage(v.getCell(), ((Character)v).gettilex()*22, ((Character)v).gettiley()*22, null);   
 
    }
    public void setHealth(int h)
  {
      System.out.println("Health="+h);
      health=h;
  }
  public int getHealth()
  {if (health>100)
      health=100;
      return health;
  }
   public void setScore(int h)
  {
      score=h;
  }
  public int getScore()
  {if(score<0)
      score=0;
      return score;
  }
     public void setAmmo(int h)
  {
      ammo=h;
  }
  public int getAmmo()
  {
      return ammo;
  }
  public void setArmor(int h)
  {System.out.println("Armor="+h);
      armor=h;
  }
  public int getArmor()
  {
      return armor;
  }
  public int getH()
  {
      return health+armor;
  }
    public void setTotal(int h)
  {
 
  }
  public int getTotal()
  {
      return health+armor;
  }
    
}
