/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l9_w4;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author student
 */
public class L9_w4 extends JFrame {
    JLabel jlbIp = new JLabel("US Dollars");
    JTextField jtfIp = new JTextField(10);
    JLabel jlbOp = new JLabel("Canadian Dollars");
    JTextField jtfOp = new JTextField(10);
    JButton jbtCV = new JButton("convert");
    JPanel p = new JPanel(new BorderLayout());
    JPanel p2 = new JPanel(new GridLayout(2,1));
    JPanel p3 = new JPanel(new GridLayout(2,1));
    JPanel p4 = new JPanel(new BorderLayout());
    
    L9_w4(){
        add(p);
        GridLayout layoutManager = new GridLayout(2,1);
        setLayout(layoutManager);
        p.add(p3,BorderLayout.CENTER);
        p.add(p2,BorderLayout.WEST);
        p.add(p4,BorderLayout.SOUTH);
        p2.add(jlbIp);
        p3.add(jtfIp);
        p2.add(jlbOp);
        p3.add(jtfOp);
        jtfOp.setText(" ");
        jtfOp.setEditable(false);
        jtfOp.setHorizontalAlignment(JTextField.RIGHT);
        jtfIp.setHorizontalAlignment(JTextField.RIGHT);
        p4.add(jbtCV,BorderLayout.EAST);
        Listener spyObj = new Listener();
        jbtCV.addActionListener(spyObj);
        
    }
    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand()=="convert"){
                double sol = Double.parseDouble(jtfIp.getText());
                double ans = sol*1.5;
                jtfOp.setText(""+ans);
            }
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        L9_w4 frame = new L9_w4();
        frame.setTitle("Convert US Dollars to Canadian Dollars");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
