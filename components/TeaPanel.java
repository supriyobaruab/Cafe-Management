package components;

import javax.swing.*;
import java.awt.*;

public class TeaPanel extends JPanel {
    public static JRadioButton greentea, blacktea, herbaltea;
    public static ButtonGroup teaGroup;

    public TeaPanel() {
        setLayout(null);
        setBounds(350, 220, 150, 150);
        setOpaque(false);

        JLabel tea = new JLabel("Tea");
        tea.setFont(new Font("Segoe Print", Font.BOLD, 16));
        tea.setBounds(0, 0, 150, 50);
        add(tea);

        greentea = new JRadioButton("Green Tea");
        greentea.setBounds(0, 50, 150, 25);
        greentea.setBackground(new Color(255,240,219));
        greentea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(greentea);

        blacktea = new JRadioButton("Black Tea");
        blacktea.setBounds(0, 80, 150, 25);
        blacktea.setBackground(new Color(255,240,219));
        blacktea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(blacktea);

        herbaltea = new JRadioButton("Herbal Tea");
        herbaltea.setBounds(0, 110, 150, 25);
        herbaltea.setBackground(new Color(255,240,219));
        herbaltea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        add(herbaltea);

        teaGroup = new ButtonGroup();
        teaGroup.add(greentea);
        teaGroup.add(blacktea);
        teaGroup.add(herbaltea);
    }
}
