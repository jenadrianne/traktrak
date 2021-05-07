/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.geom.Area;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author DYUAN
 */
public class ColliderController  implements Runnable{
    
    //public boolean isColl;
    
    public boolean intersects(JLabel car, JLabel obs){
        Area areaA = new Area(car.getBounds());
        Area areaB = new Area(obs.getBounds());
       
        return areaA.intersects(areaB.getBounds2D());
    }

    @Override
    public void run() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
               
                    if(System.currentTimeMillis() < 5){
                        
                        System.out.println("Diplay");
                        
                    }else{
                        timer.cancel(); 
                        timer.purge();
                        
                    }

            }
            
       };
         timer.scheduleAtFixedRate(task, 0,1000);
    }
    
    
    
    
    
    
    
    
}
