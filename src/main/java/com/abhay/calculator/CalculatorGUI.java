package com.abhay.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {

    private JTextField num1Field;
    private JTextField num2Field;
    private JComboBox<String> operationBox;
    private JLabel resultLabel;

    public CalculatorGUI() {
        setTitle("Maven Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 220);
        setLocationRelativeTo(null); // center window

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);

        String[] operations = { "+", "-", "*", "/" };
        operationBox = new JComboBox<>(operations);

        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Result: ");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 0
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Number 1:"), gbc);
        gbc.gridx = 1;
        panel.add(num1Field, gbc);

        // Row 1
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Number 2:"), gbc);
        gbc.gridx = 1;
        panel.add(num2Field, gbc);

        // Row 2
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Operation:"), gbc);
        gbc.gridx = 1;
        panel.add(operationBox, gbc);

        // Row 3 button
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        panel.add(calculateButton, gbc);

        // Row 4 result
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        panel.add(resultLabel, gbc);

        add(panel);

        calculateButton.addActionListener(e -> calculate());
    }

    private void calculate() {
        try {
            double a = Double.parseDouble(num1Field.getText().trim());
            double b = Double.parseDouble(num2Field.getText().trim());
            String op = (String) operationBox.getSelectedItem();
            double result;

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        resultLabel.setText("Result: Error (divide by 0)");
                        return;
                    }
                    result = a / b;
                    break;
                default:
                    resultLabel.setText("Result: Invalid op");
                    return;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid number");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI gui = new CalculatorGUI();
            gui.setVisible(true);
        });
    }
}
