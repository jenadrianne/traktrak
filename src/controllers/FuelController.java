package controllers;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import views.Menu;
import views.gameplay;

public class FuelController implements Runnable  {
   
    JLabel fuel;
    private long start, end;
    public int duration; //fuel duration in seconds.
    public int interval;
   
    
    public void FuelControllers(gameplay gp) {
        fuel = gp.getLbl_fuel();
        this.start =  System.currentTimeMillis();
        this.end = start + (60 * 1000);
        this.duration = 60; 
        this.interval = this.duration;
       
    }
    
    @Override
     public void run() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
               
                    if(System.currentTimeMillis() < end){
                        if(interval==duration){
                            fuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fuelfull.png")));
                            System.out.println("full");
                        }

                        else if (interval == 1){
                            fuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fuelempty.png")));
                            timer.cancel();
                            System.out.println("gas out");
                        }
                        else if(interval == duration/2){
                            fuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fuelmid.png")));
                            System.out.println("mid");
                        }

                       --interval;
                    }else{
                        timer.cancel(); 
                        timer.purge();
                        
                        Menu m = new Menu();
                        m.setVisible(true);
                        
                    }

            }
            
       };
         timer.scheduleAtFixedRate(task, 0,1000);
    }
}
