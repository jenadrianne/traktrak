/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import views.Menu;
import views.gameplay;

/**
 *
 * @author DYUAN
 */
public class ObstacleController implements Runnable{
    gameplay gp;

    public gameplay getGp() {
        return gp;
    }

    public void setGp(gameplay gp) {
        this.gp = gp;
    }
    
    
    public int time;
    public int picture;
    public boolean status;
    public int posX;
    public int posY;

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public ObstacleController(){
        Random rand = new Random();
     
        this.time = rand.nextInt(5)+5;
        this.posX = rand.nextInt(890 - 690) + 690;
        this.posY = rand.nextInt(640);
        this.status = true;
        
    }
    
   
    public void setObstacles(gameplay gp )
    {
        
        //gameplay gp = new gameplay();
       Random rand = new Random();
     
        this.posX = rand.nextInt(890 - 690) + 690;
        this.posY = rand.nextInt(640);
        int i = rand.nextInt(6);
        //for (int i = 0; i <  6; i++){
            //System.out.println("lolong");
            switch(i){
                case 0 : this.displayPicture(i, gp.getLbl_cone()); 
                        gp.getLbl_cone().setBounds(this.posX, this.posY, 30, 40);
                        break;
                case 1 : this.displayPicture(i, gp.getLbl_cone2()); 
                         gp.getLbl_cone2().setBounds(this.posX, this.posY, 30, 40);
                         break;
                case 2:  this.displayPicture(i, gp.getLbl_cone3()); 
                         gp.getLbl_cone3().setBounds(this.posX, this.posY, 30, 40);
                         break;
                case 3:  this.displayPicture(i, gp.getLbl_spike1()); 
                         gp.getLbl_spike1().setBounds(this.posX, this.posY, 30, 40);
                         break;
                case 4:  this.displayPicture(i, gp.getLbl_spike2()); 
                         gp.getLbl_spike2().setBounds(this.posX, this.posY, 30, 40);
                         break;
                case 5:  this.displayPicture(i, gp.getLbl_spike2());
                         gp.getLbl_spike2().setBounds(this.posX, this.posY, 30, 40);
                         break;
                         
            }
            
        //}
    }
    
    public void displayPicture(int i, JLabel pic)
    {
        Random rand = new Random();
        i = rand.nextInt(3);
        pic.setVisible(true);
        switch (i){ 
            case 0 : pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cone2_top.png"))); 
                     break;
            case 1 : pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/spike.png")));
                     break;
        }               
        
        
    }
    
 

    

    @Override
    public void run() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                    while (status == true){
                        System.out.println("lolong");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ObstacleController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            setObstacles( gp );
                        }
                    if(System.currentTimeMillis() > time){
                        //System.out.println("Diplay");
                        
                        
                        
                    }else{
                        timer.cancel(); 
                        timer.purge();
                        
                    }

            }
            
       };
         timer.scheduleAtFixedRate(task, 0,1000);
        
       
    }
    
    
}
