/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mouseex;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author student
 */
public class MouseEx extends JFrame{
//    DrawStringArea drawStringobj = new DrawStringArea();
    DrawKeyArea drawKeyArea = new DrawKeyArea();
    MouseEx(){
//        add(drawStringobj);
        add(drawKeyArea);
        drawKeyArea.setFocusable(true);
    }
    

    //inner class
    class DrawKeyArea extends JPanel{
//        String str = "Hello JAVA";
        char ch = 'A';
        int x = 10;
        int y = 10;
        DrawKeyArea(){
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e){
                    switch(e.getKeyCode()){
                        case KeyEvent.VK_UP:
                            y-=10;
                            break;
                        case KeyEvent.VK_DOWN:
                            y+=10;
                            break;
                        case KeyEvent.VK_LEFT:
                            x-=10;
                            break;
                        case KeyEvent.VK_RIGHT:
                            x+=10;
                            break;
                        default:
                            ch = e.getKeyChar();
                    }
                    repaint();
                }
            });
        }
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.red);
//            g.setFont("TimesRoman");
            g.drawString("Position x = "+x+"Position y = "+y, 100, 100);
            g.drawString(String.valueOf(ch), x, y);
        }
        
//        DrawStringArea(){
//            addMouseMotionListener(new MouseMotionListener() {
//                @Override
//                public void mouseDragged(MouseEvent e) {
//                    x = e.getX();
//                    y = e.getY();
//                    repaint();   
//                }
//
//                @Override
//                public void mouseMoved(MouseEvent e) {
//                  x = e.getX();
//                  y = e.getY();
//                  repaint();
//                }
//            });
        
        
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MouseEx frame = new MouseEx();
        frame.setTitle("Event Example");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
