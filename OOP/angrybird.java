import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author student
 */
public class angrybird extends JFrame{
    
    angrybird(){
        add(new DrawArea());
    }

    //inner class 
    class DrawArea extends JPanel{
        URL imageURL = this.getClass().getResource("manga-one-piece-wallpaper-preview.jpg");
        Image image = new ImageIcon(imageURL).getImage();
        URL imageActorURL = this.getClass().getResource("a.png");
        Image imageActor = new ImageIcon(imageActorURL).getImage();
        Timer timer = new Timer(10,new Listener());
        int x=0;
        int y = 600;
        DrawArea(){
            timer.start();
        }
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(x>getWidth()){
                x=0;
            }
            else{
                x+=5;
            }
            
            g.drawImage(image, 0, 0,getWidth(), getHeight(), this);
            g.drawImage(imageActor, x, y,100,100,this);
        }
        //inner class 
        class Listener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        
        }
    
    
    }
    public static void main(String[] args) {
        angrybird frame = new angrybird();
        frame.setTitle("Example");
        frame.setSize(1500, 1500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
    