package components;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    public static JTextArea info;

    public InfoPanel() {
        setLayout(null);
        setBounds(30, 200, 300, 200);
        setOpaque(false);

        JLabel information = new JLabel("Show Information");
        information.setFont(new Font("Segoe Print", Font.BOLD, 14));
        information.setBounds(0, 0, 150, 50);
        add(information);

        info = new JTextArea();
        info.setBounds(0, 50, 300, 150);
        info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        info.setBackground(new Color(255,240,219));
        add(info);
    }
}
