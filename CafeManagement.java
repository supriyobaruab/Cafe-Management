import javax.swing.*;
import java.awt.*;
import components.*;

public class CafeManagement extends JFrame {
    public CafeManagement() {
        super("Cafe Management System");
        setBounds(500, 100, 670, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setIconImage(new ImageIcon("images/icon.png").getImage());
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255,240,219));
        panel.setBounds(0, 0, 670, 480);

        panel.add(new HeaderPanel());
        panel.add(new CustomerFormPanel());
        panel.add(new InfoPanel());
        panel.add(new MenuPanel());
        panel.add(new SnackPanel());
        panel.add(new TeaPanel());
        panel.add(new ActionPanel());

        add(panel);
    }
}
