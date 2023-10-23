import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankApp extends JFrame {
    JLabel head = new JLabel("ACCOUNT MONEY");
    JLabel h1 = new JLabel("Enter data Account Money");
    JLabel LId = new JLabel("ID : ");
    JTextField TId = new JTextField(10);
    JLabel LMoney = new JLabel("Money : ");
    JTextField TMoney = new JTextField(10);
    JLabel LBaht = new JLabel("Baht : ");
    JLabel LDay = new JLabel("Day Open ACCOUNT : ");
    Choice dateChoice = new Choice();
        for (int i = 1; i <= 31; i++) {
            dateChoice.add(Integer.toString(i));
        }
    Choice monthChoice = new Choice();
    for (int i = 1; i <= 12; i++) {
        dateChoice.add(Integer.toString(i));
    }
    Choice yearChoice = new Choice();
    for (int i = 2000; i <= 2050; i++) {
        yearChoice.add(Integer.toString(year));
    }

    JPanel p = new JPanel(new BorderLayout());



 

    


    BankApp() {
        add(p);
        p.add(head);
        p.add(h1);
    }
    



    public static void main(String[] args) {
        BankApp frame = new BankApp();
        frame.setTitle("Show Detail of Account");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
