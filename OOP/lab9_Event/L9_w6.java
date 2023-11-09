/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author student
 */
public class L9_w6 extends JFrame{
    int x=40;
    int y=20;
    int a;
    L9_w6(){
        add(new Draw());
    }
    class Draw extends JPanel{
       Timer timer = new Timer(10,new Listener());
       Draw(){
           timer.start();
       }
    
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(160-x == 200 || 160+y == 120){
                a = 1;
            }
            if(160-x == 120 || 160+y == 200){
                a = 0;
            }
            g.drawArc(20, 220, 80, 40, 0, 180);
            g.drawLine(20 + 40, 220, 20 + 40, 20);
            g.drawLine(20 + 40, 20, 20 + 40 + 100, 20);
            g.drawLine(20 + 40 + 100, 20, 20 + 40 + 100-x, 40);
            int radius = 20;
            g.fillOval(20+40+100-x-radius,40,2*radius,2*radius);
           // g.drawOval(20 + 40 + 100 - radius, 40, 2 * radius, 2 * radius);
            g.drawLine(20 + 40-x +100 - (int)(radius *Math.cos(Math.toRadians(45))),
            40 + radius + (int)(radius * Math.sin(Math.toRadians(45))),
            20 + 40 + 100 - 60-x*2, 40 + radius + 60);
            g.drawLine(20 + 40 + 100-x + (int)(radius *Math.cos(Math.toRadians(45))),
            40 + radius + (int)(radius * Math.sin(Math.toRadians(45))),
            20 + 40 + 100 + 60-x*2, 40 + radius + 60);
            g.drawLine(20 + 40 + 100-x, 40 + 2* radius,160-x*2, 40 + radius + 80);
            g.drawLine(20 + 40 + 100-2*x, 40 + radius + 80, 140-x*3,40 + radius + 80 + 40);
            g.drawLine(20 + 40 + 100-2*x, 40 + radius + 80, 180-x*3,40 + radius + 80 + 40);
            if(a==0){
                x--;
                y--;
            }
            else{
                x++;
                y++;
            }
        }
        class Listener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
            
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        L9_w6 frame = new L9_w6();
        frame.setTitle("Convert US Dollars to Canadian Dollars");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
}
