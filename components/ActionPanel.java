package components;

import javax.swing.*;
import java.awt.*;

public class ActionPanel extends JPanel {
    public JButton order, exit;

    public ActionPanel() {
        setLayout(null);
        setBounds(350, 370, 300, 50);
        setOpaque(false);

        order = new JButton("Order");
        order.setBounds(0, 0, 130, 35);
        order.setBackground(new Color(198,151,88));
        add(order);

        exit = new JButton("Exit");
        exit.setBounds(160, 0, 130, 35);
        exit.setBackground(new Color(198,151,88));
        exit.addActionListener(e -> System.exit(0));
        add(exit);
    }
}
