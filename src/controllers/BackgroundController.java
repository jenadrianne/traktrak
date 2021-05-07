/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import views.gameplay;

/**
 *
 * @author Jennifer Caballes
 */
public class BackgroundController implements Runnable{
    JLabel g, g2,g3; 
    private long start, end;
    
    public void MoveBackground (gameplay gp ){
        this.g = gp.getjLabel1();
        this.g2 = gp.getjLabel4();
        this.start =  System.currentTimeMillis();
        this.end = start + (60 * 1000);
    }    
    
    @Override
     public void run() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
               
                    if(System.currentTimeMillis() < end){
                        if(g.getY() <= 660 && g2.getY() <= 660){
                            g.setLocation(g.getX(), g.getY()+1);
                            g2.setLocation(g2.getX(), g2.getY()+1);
                        }else if (g.getY() >=664){
                            g.setLocation(g.getX(), -580);
                        }else if (g2.getY() >=664){
                            g.setLocation(g2.getX(), -580 );
                        }
                       
                    }else{
                        timer.cancel(); 
                        timer.purge();
                    }

            }
            
       };
         timer.scheduleAtFixedRate(task, 0,100);
    }
}

