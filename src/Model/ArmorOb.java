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
public class ArmorOb extends Observer {
 int armor;
     Play p=Play.getInstance();
public ArmorOb(Subject subject)
{
    this.subject = subject;
      this.subject.attach(this);
}
    @Override
    public void update() {
    armor=p.getArmor();
    armor+=25;
    p.setArmor(armor);
    
    }
    
}
