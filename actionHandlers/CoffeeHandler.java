package actionHandlers;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CoffeeHandler {
    private int aq, eq, lq, cq;
    private JRadioButton americano, espresso, latte, cappuccino;

    public CoffeeHandler(JRadioButton americano, JRadioButton espresso, JRadioButton latte, JRadioButton cappuccino) {
        this.americano = americano;
        this.espresso = espresso;
        this.latte = latte;
        this.cappuccino = cappuccino;
        aq = 0;
        eq = 0;
        lq = 0;
        cq = 0;
    }

    public void handle(ActionEvent ae) {
        String aqs;
        boolean valid = false;
        if (americano.isSelected()) {
            while (!valid) {
                aqs = JOptionPane.showInputDialog("Enter the quantity");

                if (aqs == null) {
                    americano.setSelected(false);
                    break;
                } else if (aqs.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number");
                    continue;
                }
                try {
                    int quantity = Integer.parseInt(aqs.trim());
                    if (quantity > 0) {
                        valid = true;
                        aq = quantity;
                        System.out.println("Quantity entered: " + quantity);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a numeric value");
                }
            }
        }
    }
}