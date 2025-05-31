package components;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    public static JRadioButton coffee, espresso, latte, cappuccino;
    public static ButtonGroup coffeeGroup;

    public MenuPanel() {
        setLayout(null);
        setBounds(350, 50, 150, 200);
        setOpaque(false);

        JLabel menu = new JLabel("Menu");
        menu.setFont(new Font("Segoe Print", Font.BOLD, 16));
        menu.setBounds(0, 0, 150, 50);
        add(menu);

        coffee = new JRadioButton("Coffee");
        coffee.setBounds(0, 50, 150, 25);
        coffee.setBackground(new Color(255,240,219));
        coffee.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(coffee);

        espresso = new JRadioButton("Espresso");
        espresso.setBounds(0, 80, 150, 25);
        espresso.setBackground(new Color(255,240,219));
        espresso.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(espresso);

        latte = new JRadioButton("Latte");
        latte.setBounds(0, 110, 150, 25);
        latte.setBackground(new Color(255,240,219));
        latte.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(latte);

        cappuccino = new JRadioButton("Cappuccino");
        cappuccino.setBounds(0, 140, 150, 25);
        cappuccino.setBackground(new Color(255,240,219));
        cappuccino.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(cappuccino);

        coffeeGroup = new ButtonGroup();
        coffeeGroup.add(coffee);
        coffeeGroup.add(espresso);
        coffeeGroup.add(latte);
        coffeeGroup.add(cappuccino);
    }
}
