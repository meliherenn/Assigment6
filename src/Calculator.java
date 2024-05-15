import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textResult;
    private JButton calculateButton;
    private JLabel t;

    public Calculator(){
        add(panel1);
        setSize(400,200);
        setTitle("CALCULATOR");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String opr = textField3.getText();
                    Double num1 = Double.parseDouble(textField1.getText());
                    Double num2 = Double.parseDouble(textField2.getText());

                    if (opr.equals("+")) {
                        Double result = num1 + num2;
                        String str = Double.toString(result);
                        textResult.setText(str);
                    } else if (opr.equals("-")) {
                        Double result = num1 - num2;
                        String str = Double.toString(result);
                        textResult.setText(str);
                    } else if (opr.equals("*")) {
                        Double result = num1 * num2;
                        String str = Double.toString(result);
                        textResult.setText(str);
                    } else if (opr.equals("/")) {
                        if (num2 != 0) {
                            double result = num1 / num2;
                            String str = Double.toString(result);
                            textResult.setText(str);
                        } else {
                            throw new ArithmeticException("Division by zero error.");
                        }
                    } else {
                        System.out.println("Invalid operation.");
                    }

            } catch (ArithmeticException ex)
                {
                    textResult.setText("Division by zero error.");
                }
            }
        });
    }


}
