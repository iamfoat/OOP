import javax.swing.*;
import java.awt.*;

class w3 extends JFrame{
    JPanel p =new JPanel();
    JPanel p1 = new JPanel(new GridLayout(4,4));
    JLabel jlb = new JLabel("eieieieieieieieeie");
    JButton jbt = new JButton("1");
    JTextField jtf = new JTextField(20);
    
    w3(){
        setLayout(new BorderLayout()); 
        p.add(jtf);
        p1.add(jbt);
        // p.add(new paint());
        // this.add(jlb,BorderLayout.NORTH);
        // this.add(jbt,BorderLayout.SOUTH);
        // this.add(jtf,BorderLayout.CENTER);
        add(p,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
    }
    class paint extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 100, 100);
            

        }
    }
    public static void main(String[] args){
        w3 frame = new w3();
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("test");
        frame.setLocationRelativeTo(null);
    }
}