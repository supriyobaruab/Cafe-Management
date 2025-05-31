package components;

import javax.swing.*;
import java.awt.*;

public class SnackPanel extends JPanel {
    public static JCheckBox cookie, muffin, croissant;

    public SnackPanel() {
        setLayout(null);
        setBounds(530, 50, 150, 160);
        setOpaque(false);

        JLabel mnacks = new JLabel("Snacks");
        mnacks.setFont(new Font("Segoe Print", Font.BOLD, 16));
        mnacks.setBounds(0, 0, 150, 50);
        add(mnacks);

        cookie = new JCheckBox("Cookie");
        cookie.setBounds(0, 50, 150, 25);
        cookie.setBackground(new Color(255,240,219));
        cookie.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(cookie);

        muffin = new JCheckBox("Muffin");
        muffin.setBounds(0, 80, 150, 25);
        muffin.setBackground(new Color(255,240,219));
        muffin.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(muffin);

        croissant = new JCheckBox("Croissant");
        croissant.setBounds(0, 110, 150, 25);
        croissant.setBackground(new Color(255,240,219));
        croissant.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(croissant);
    }
}
