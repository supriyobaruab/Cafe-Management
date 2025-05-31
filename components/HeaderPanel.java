package components;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    public HeaderPanel() {
        setLayout(null);
        setBounds(0, 0, 800, 50);

        JLabel title = new JLabel("Cozy Nest", JLabel.CENTER);
        title.setFont(new Font("Segoe Print", Font.BOLD, 22));
        title.setBackground(new Color(198, 151, 88));
        title.setOpaque(true);
        title.setBounds(0, 0, 800, 50);
        add(title);

        ImageIcon banner = new ImageIcon("images/logo.png");
        JLabel imagLabel = new JLabel(banner, JLabel.LEFT);
        imagLabel.setBounds(220, 0, 800, 50);
        add(imagLabel);
    }
}
