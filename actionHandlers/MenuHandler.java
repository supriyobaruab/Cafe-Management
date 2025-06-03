package actionHandlers;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class MenuHandler {
    private JCheckBox[] items;
    private String[] itemNames;
    private String[] inputs;
    private int[] itemQuantities;

    public MenuHandler(
            JCheckBox americano,
            JCheckBox espresso,
            JCheckBox latte,
            JCheckBox cappuccino,
            JCheckBox greentea,
            JCheckBox blacktea,
            JCheckBox herbaltea,
            JCheckBox matcha,
            JCheckBox milktea,
            JCheckBox cheese,
            JCheckBox pastry,
            JCheckBox croissant) {

        items = new JCheckBox[] {
                americano, espresso, latte, cappuccino,
                greentea, blacktea, herbaltea, matcha, milktea,
                cheese, pastry, croissant
        };

        itemNames = new String[] {
                "Americano", "Espresso", "Latte", "Cappuccino",
                "Green Tea", "Black Tea", "Herbal Tea", "Matcha", "Milk Tea",
                "Cheese Paprika", "Pastry", "Croissant"
        };

        itemQuantities = new int[items.length];
        inputs = new String[12];
    }

    public void handle(ActionEvent ae) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].isSelected()) {
                inputs[i] = JOptionPane.showInputDialog("Enter the quantity");
            }
        }
    }
}
