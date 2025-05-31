package components;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    public HeaderPanel() {
        super.setLayout(null);
        super.setBounds(0, 0, 800, 50);

        JLabel title = new JLabel("Cozy Nest", JLabel.CENTER);
        title.setFont(new Font("Segoe Print", Font.BOLD, 22));
        title.setBackground(new Color(198, 151, 88));
        title.setOpaque(true);
        title.setBounds(0, 0, 800, 50);
        

        ImageIcon logo = new ImageIcon(getClass().getResource("/images/logo.png"));
        JLabel imagLabel = new JLabel(logo, JLabel.LEFT);
        imagLabel.setBounds(0, 0, 800, 50);
        super.add(imagLabel);
        super.add(title);

    }
}
