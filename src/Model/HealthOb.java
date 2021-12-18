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
public class HealthOb extends Observer {
    int Health;
    int Armor;
     Play p=Play.getInstance();
public HealthOb(Subject subject)
{   

     this.subject = subject;
      this.subject.attach(this);
   
}
    @Override
    public void update() {
        System.out.println(this.subject.getState());
        if(this.subject.getState()==1)
        {Health=  p.getHealth();
    
    Health+=25;
        System.out.println(Health);
    p.setHealth(Health);}
        else if(this.subject.getState()==2)
        {
            Armor=p.getArmor();
         Health=p.getHealth();
         if(Armor>0){
             Armor-=25;}
         else {
             Health-=25;}
     p.setArmor(Armor);
     p.setHealth(Health);
        }
        else if(this.subject.getState()==3)
        {
       Armor=p.getArmor();
         Health=p.getHealth();
    if(Armor>0&&Armor==25){
         Armor-=25;
   Health-=25;
    }
    else if(Armor>25)
        Armor-=50;
    else 
        Health-=50;
    p.setHealth(Health);
    p.setArmor(Armor);
        }
    }
    
}
