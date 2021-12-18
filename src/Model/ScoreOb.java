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
public class ScoreOb extends Observer{
    int Score;
     Play p=Play.getInstance();
public ScoreOb(Subject subject)
{
    this.subject = subject;
      this.subject.attach(this);
}

   
    @Override
    public void update() {
        if (this.subject.getState()==1){
       Score=  p.getScore();
    
    Score+=25;
        System.out.println(Score);
    p.setScore(Score);}
        if(this.subject.getState()==2)
        {  Score=  p.getScore();
    
    Score-=0;
        System.out.println(Score);
    p.setScore(Score);
            
        }
          if(this.subject.getState()==3)
        {  Score=  p.getScore();
    
    Score-=10;
        System.out.println(Score);
    p.setScore(Score);
            
        }
    }
    
}
