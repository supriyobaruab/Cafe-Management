package actionHandlers;

import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CoffeeHandler {
    private int aq, eq, lq, cq;
    private int americanoPrice = 350;
    private int lattePrice = 310;
    private int espressoPrice = 260;
    private int cappuccinoPrice = 300;
    private JRadioButton americano, espresso, latte, cappuccino;
    private ButtonGroup coffeeGroup;

    public CoffeeHandler(JRadioButton americano, JRadioButton espresso, JRadioButton latte, JRadioButton cappuccino,
            ButtonGroup coffeGroup) {
        this.americano = americano;
        this.espresso = espresso;
        this.latte = latte;
        this.cappuccino = cappuccino;
        this.coffeeGroup = coffeGroup;
        aq = 0;
        eq = 0;
        lq = 0;
        cq = 0;
    }

    public void handle(ActionEvent ae) {
        String aqs, eqs, lqs, cqs;
        boolean avalid = false;
        boolean evalid = false;
        boolean lvalid = false;
        boolean cvalid = false;
        if (americano.isSelected()) {
            while (!avalid) {
                aqs = JOptionPane.showInputDialog("Enter the quantity");

                if (aqs == null) {
                    americano.setSelected(false);
                    coffeeGroup.clearSelection();
                    break;
                } else if (aqs.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number");
                    continue;
                }
                try {
                    int quantity = Integer.parseInt(aqs.trim());
                    if (quantity > 0) {
                        avalid = true;
                        aq = quantity;
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a numeric value");
                }
            }
        }
        // Espresso
        else if (espresso.isSelected()) {
            while (!evalid) {
                eqs = JOptionPane.showInputDialog("Enter the quantity");

                if (eqs == null) {
                    coffeeGroup.clearSelection();
                    break;
                } else if (eqs.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number");
                    continue;
                }
                try {
                    int quantity = Integer.parseInt(eqs.trim());
                    if (quantity > 0) {
                        evalid = true;
                        eq = quantity;
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a numeric value");
                }
            }
        }
        // Latte
        else if (latte.isSelected()) {
            while (!lvalid) {
                lqs = JOptionPane.showInputDialog("Enter the quantity");

                if (lqs == null) {
                    coffeeGroup.clearSelection();
                    break;
                } else if (lqs.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number");
                    continue;
                }
                try {
                    int quantity = Integer.parseInt(lqs.trim());
                    if (quantity > 0) {
                        lvalid = true;
                        eq = quantity;
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a numeric value");
                }
            }
        }
        // Cappucino
        else if (cappuccino.isSelected()) {
            while (!cvalid) {
                cqs = JOptionPane.showInputDialog("Enter the quantity");

                if (cqs == null) {
                    coffeeGroup.clearSelection();
                    break;
                } else if (cqs.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number");
                    continue;
                }
                try {
                    int quantity = Integer.parseInt(cqs.trim());
                    if (quantity > 0) {
                        cvalid = true;
                        cq = quantity;

                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a numeric value");
                }
            }
        }
    }

    public int getAmericanoQunatity() {
        return aq * americanoPrice;
    }

    public int getEspressoQunatity() {
        return eq * espressoPrice;
    }

    public int getLatteQunatity() {
        return lq * lattePrice;
    }

    public int getCappuchinoQunatity() {
        return cq * cappuccinoPrice;
    }
}