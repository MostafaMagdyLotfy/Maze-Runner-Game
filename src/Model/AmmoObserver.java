/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ramy
 */
public class AmmoObserver extends Observer {
     int bullets;
    Play p=Play.getInstance();
    Ammo a= Ammo.getInstance();
public AmmoObserver(Subject subject)
{
     this.subject = subject;
      this.subject.attach(this);
   
}

    @Override
    public void update() {
     if(this.subject.getState()==4)
     {
bullets =p.getAmmo();
bullets+=2;
if(bullets>6)
    bullets=6;
p.setAmmo(bullets);
}
}
}