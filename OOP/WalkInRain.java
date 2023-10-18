import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class walkinrain extends JFrame {
    private int x = 0;
    private int speed = 2;

    public walkinrain() {
        setTitle("Walking in the Rain Animation");
        add(new WalkingPanel());
        Timer timer = new Timer(20, new TimerListener());
        timer.start();
    }

    public static void main(String[] args) {
        walkinrain frame = new walkinrain();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    class WalkingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int y = getHeight() - 200; 
            

            g.setColor(Color.BLACK);
            g.drawOval(x + 140, y, 50, 50);
            g.drawLine(x + 170, y + 70, x + 200, y + 85);
            g.drawLine(x + 170, y + 70, x + 180, y + 100);

            g.setColor(Color.GREEN);
            g.drawLine(x + 200, y, x + 200, y + 85);
            g.setColor(Color.RED);
            g.drawLine(x, y + 100, x, y + 100);
            g.fillArc(x + 100, y - 50, 200, 150, 0, 180);

            int[] a = {x + 60, x + 70, x + 70, x + 60};
            int[] b = {y + 25, y + 25, y + 125, y + 125};

            g.setColor(Color.PINK);
            g.fillRect(x + 160, y + 50, 10, 100);

            g.setColor(Color.BLACK);
            g.drawLine(x + 100, y + 125, x + 85, y + 165);
        }
    }

    class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            x += speed;
            repaint();
        }
    }
}
