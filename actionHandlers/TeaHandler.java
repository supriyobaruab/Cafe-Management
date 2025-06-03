package actionHandlers;

import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class TeaHandler {
    private JRadioButton[] buttons;
    private ButtonGroup teaGroup;
    private String names[];
    private int quantity[];

    public TeaHandler(JRadioButton greentea, JRadioButton blacktea, JRadioButton herbaltea, JRadioButton matcha,
            JRadioButton milktea, ButtonGroup teaGroup) {
        buttons = new JRadioButton[] { greentea, blacktea, herbaltea, matcha };
        quantity = new int[4];
        names = new String[] { "GreenTea", "Blacktea", "Herbaltea", "Matcha" };
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
                        quantity[i] = Integer.parseInt(input.trim());
                        valid = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a numeric value");
                    }
                }
            }
        }
    }

    public int getTeaInfo() {
        for (int i = 0; i < buttons.length; i++) {
            if (quantity[i] > 0) {
                return quantity[i];
            }
        }
        return 0;
    }

}
