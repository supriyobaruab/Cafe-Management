package actionHandlers;

import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CoffeeHandler {
    private JRadioButton[] buttons;
    private ButtonGroup coffeeGroup;
    private String[] names;
    private int[] quantities;
    private int[] prices;

    public CoffeeHandler(JRadioButton americano, JRadioButton espresso, JRadioButton latte, JRadioButton cappuccino,
            ButtonGroup coffeeGroup) {
        buttons = new JRadioButton[] { americano, espresso, latte, cappuccino };
        names = new String[] { "Americano", "Espresso", "Latte", "Cappuccino" };
        prices = new int[] { 350, 260, 310, 300 };
        quantities = new int[4];
        this.coffeeGroup = coffeeGroup;
    }

    public void handle(ActionEvent ae) {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                boolean valid = false;
                while (!valid) {
                    String input = JOptionPane.showInputDialog("Enter quantity for " + names[i]);
                    if (input == null) {
                        coffeeGroup.clearSelection();
                        break;
                    } else if (input.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Enter a valid number");
                        continue;
                    }
                    try {
                        int quantity = Integer.parseInt(input.trim());
                        if (quantity > 0) {
                            quantities[i] = quantity;
                            valid = true;
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

    public String getCoffeeInfo() {
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > 0) {
                int totalPrice = quantities[i] * prices[i];
                return names[i] + ": Quantity = " + quantities[i] + ", Price = " + totalPrice;
            }
        }
        return "";
    }
}
