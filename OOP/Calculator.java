import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JTextField display;
    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    public Calculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonText = ((JButton) e.getSource()).getText();

            if (buttonText.matches("[0-9]")) {
                if (isOperatorClicked) {
                    display.setText(buttonText);
                    isOperatorClicked = false;
                } else {
                    display.setText(display.getText() + buttonText);
                }
            } else if (buttonText.matches("[+\\-*/]")) {
                if (!operator.isEmpty()) {
                    calculate();
                }
                num1 = Double.parseDouble(display.getText());
                operator = buttonText;
                isOperatorClicked = true;
            } else if (buttonText.equals("=")) {
                calculate();
                operator = "";
            } else if (buttonText.equals("C")) {
                display.setText("");
                num1 = 0;
                num2 = 0;
                operator = "";
            }
        }

        private void calculate() {
            num2 = Double.parseDouble(display.getText());
            double result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            display.setText(String.valueOf(result));
            num1 = result;
            isOperatorClicked = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
