package is2.ulpgc;

import javax.swing.*;
import java.awt.*;

public class CalculatorUI extends JFrame {
    private final Calculator calculator;
    private JTextField input1;
    private JTextField input2;
    private JTextField result;

    public CalculatorUI() {
        calculator = new Calculator();
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel label1 = new JLabel("Primer operador:");
        input1 = new JTextField();
        JLabel label2 = new JLabel("Segundo operador:");
        input2 = new JTextField();
        JLabel labelResult = new JLabel("Resultado:");
        result = new JTextField();
        result.setEditable(false);

        JButton addButton = new JButton("Suma");
        JButton subButton = new JButton("Resta");
        JButton multButton = new JButton("Multiplicar");
        JButton divButton = new JButton("Dividir");

        add(label1);
        add(input1);
        add(label2);
        add(input2);
        add(labelResult);
        add(result);
        add(addButton);
        add(subButton);
        add(multButton);
        add(divButton);

        addButton.addActionListener(e -> performOperation("add"));

        subButton.addActionListener(e -> performOperation("sub"));

        multButton.addActionListener(e -> performOperation("mult"));

        divButton.addActionListener(e -> performOperation("div"));
    }

    private void performOperation(String operation) {
        try {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            int res = 0;

            switch (operation) {
                case "add":
                    res = calculator.add(num1, num2);
                    break;
                case "sub":
                    res = calculator.sub(num1, num2);
                    break;
                case "mult":
                    res = calculator.mult(num1, num2);
                    break;
                case "div":
                    res = calculator.div(num1, num2);
                    break;
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, inserte números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorUI().setVisible(true));
    }
}
