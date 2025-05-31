package components;

import javax.swing.*;
import java.awt.*;

public class CustomerFormPanel extends JPanel {
    public static JTextField name, no, address;

    public CustomerFormPanel() {
        setLayout(null);
        setBounds(30, 50, 270, 130);
        setOpaque(false);

        JLabel customer = new JLabel("Customer Details");
        customer.setFont(new Font("Segoe Print", Font.BOLD, 14));
        customer.setBounds(0, 0, 150, 50);
        add(customer);

        JLabel customerN = new JLabel("Customer Name :");
        customerN.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        customerN.setBounds(0, 50, 150, 20);
        add(customerN);

        name = new JTextField();
        name.setBounds(120, 50, 100, 20);
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        name.setBackground(new Color(255,240,219));
        name.setOpaque(true);
        add(name);

        JLabel customerNo = new JLabel("Customer No :");
        customerNo.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        customerNo.setBounds(0, 80, 150, 20);
        add(customerNo);

        no = new JTextField();
        no.setBounds(120, 80, 100, 20);
        no.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        no.setBackground(new Color(255,240,219));
        no.setOpaque(true);
        add(no);

        JLabel customerA = new JLabel("Customer Address :");
        customerA.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        customerA.setBounds(0, 110, 150, 20);
        add(customerA);

        address = new JTextField();
        address.setBounds(120, 110, 100, 20);
        address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        address.setBackground(new Color(255,240,219));
        address.setOpaque(true);
        add(address);
    }
}
