import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    // Create components
     JTextField resultField;
     JPanel buttonPanel;
     String currentInput;
     double firstOperand;
     String operator;

    public SimpleCalculator() {
        // Initialize frame
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        resultField = new JTextField();
       // resultField.setFont(new Font("Arial", Font.PLAIN, 24));
        //resultField.setHorizontalAlignment(JTextField.RIGHT);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        currentInput = "";
        firstOperand = 0.0;
        operator = "";

        // Create buttons for digits and operations
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            // button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Add components to the frame
        add(resultField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    // @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789.".contains(command)) {
            currentInput += command;
            resultField.setText(currentInput);
        } else if ("+-*/".contains(command)) {
            if (!currentInput.isEmpty()) {
                firstOperand = Double.parseDouble(currentInput);
                operator = command;
                currentInput = "";
            }
        } else if ("=".equals(command)) {
            if (!currentInput.isEmpty()) {
                double secondOperand = Double.parseDouble(currentInput);
                double result = 0.0;

                switch (operator) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        if (secondOperand != 0) {
                            result = firstOperand / secondOperand;
                        } 
                        break;
                }

                // resultField.setText(Double.toString(result));
                // currentInput = "";
            }
        }
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> new SimpleCalculator());
        SimpleCalculator s=new SimpleCalculator();
    }
}
