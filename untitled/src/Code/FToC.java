package Code;

import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FToC {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature conversion");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(3);
        frame.setLayout((LayoutManager)null);
        frame.setVisible(true);
        JTextField tField1 = new JTextField();
        tField1.setBounds(20, 20, 150, 40);
        JTextField tField2 = new JTextField("Result will appear here");
        tField2.setBounds(200, 20, 150, 40);
        PlaceholderHandler.apply(tField1, "Enter temp in °F");
        PlaceholderHandler.apply(tField2, "Result in °C");
        JButton button = new JButton("CONVERT");
        button.setBounds(120, 100, 150, 25);
        frame.add(tField1);
        frame.add(tField2);
        frame.add(button);
        button.addActionListener((e) -> {
            try {
                double tempInF = Double.parseDouble(tField1.getText());
                double tempInC = (tempInF - (double)32.0F) * 0.5555555555555556;
                tField2.setText(String.format("%.2f °C", tempInC));
            } catch (NumberFormatException var7) {
                tField2.setText("Invalid Input!");
            }

        });
    }
}
