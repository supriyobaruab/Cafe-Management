package actionHandlers;

import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class TeaHandler {
    private JRadioButton[] buttons;
    private ButtonGroup teaGroup;
    private String[] names;
    private int[] quantities;
    private int[] prices;

    public TeaHandler(JRadioButton greentea, JRadioButton blacktea, JRadioButton herbaltea, JRadioButton matcha,
            JRadioButton milktea, ButtonGroup teaGroup) {
        buttons = new JRadioButton[] { greentea, blacktea, herbaltea, matcha, milktea };
        quantities = new int[5];
        names = new String[] { "GreenTea", "Blacktea", "Herbaltea", "Matcha", "MilkTea" };
        prices = new int[] { 150, 130, 170, 200, 200 };
        this.teaGroup = teaGroup;
    }

    public void handle(ActionEvent ae) {
        for (int i = 0; i < buttons.length; i++) {
            boolean valid = false;
            if (buttons[i].isSelected()) {
                while (!valid) {
                    String input = JOptionPane.showInputDialog("Enter quantity for " + names[i]);
                    if (input == null) {
                        teaGroup.clearSelection();
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

    public String getTeaInfo() {
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > 0) {
                int totalPrice = quantities[i] * prices[i];
                return names[i] + ": Quantity = " + quantities[i] + ", Price = " + totalPrice;
            }
        }
        return "";
    }
}