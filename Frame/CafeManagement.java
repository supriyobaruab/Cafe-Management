package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import actionHandlers.*;
import entity.*;

public class CafeManagement extends JFrame implements MouseListener, ActionListener {

    private JPanel panel;
    private JLabel title, customer, customerN, customerNo, customerA, menu, snacks, tea, information, imagLabel,
            meow1Img, meow2Img;
    private Color pbackground;
    private JTextField name, no, address;
    private JCheckBox americano, espresso, latte, cappuccino, greentea, blacktea, herbaltea, matcha, milktea;
    private JCheckBox cheese, pastry, croissant;
    private JTextArea info;
    private ImageIcon banner, meow1, meow2;
    private JButton exit, order;
    private MenuHandler[] handlers;

    ImageIcon icon = new ImageIcon("images/icon.png");

    public CafeManagement() {
        // CAFE MANAGEMENT SYSTEM
        super("Cafe Management System");
        super.setBounds(500, 100, 690, 480);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(icon.getImage());

        // Panel
        panel = new JPanel();
        panel.setLayout(null);
        pbackground = new Color(255, 240, 219);
        panel.setBackground(pbackground);

        // Title Label
        title = new JLabel("Cozy Nest                ", JLabel.CENTER);
        title.setBounds(0, 0, 800, 50);
        title.setFont(new Font("Segoe Print", Font.BOLD, 22));
        title.setBackground(new Color(198, 151, 88));
        title.setOpaque(true);

        // Image
        banner = new ImageIcon("images/logo.png");
        imagLabel = new JLabel(banner, JLabel.LEFT);
        imagLabel.setBounds(220, 0, 800, 50);
        panel.add(imagLabel);
        panel.add(title);

        // Customer Details
        customer = new JLabel("Customer Details");
        customer.setBounds(30, 50, 150, 50);
        customer.setFont(new Font("Segoe Print", Font.BOLD, 14));
        panel.add(customer);

        customerN = new JLabel("Customer Name :");
        customerN.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        customerN.setBounds(30, 100, 150, 20);
        panel.add(customerN);

        name = new JTextField();
        name.setBounds(150, 100, 150, 20);
        name.setBackground(pbackground);
        name.setOpaque(true);
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(name);

        customerNo = new JLabel("Customer No :");
        customerNo.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        customerNo.setBounds(30, 130, 150, 20);
        panel.add(customerNo);

        no = new JTextField();
        no.setBackground(pbackground);
        no.setOpaque(true);
        no.setBounds(150, 130, 150, 20);
        no.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(no);

        customerA = new JLabel("Customer Address :");
        customerA.setBounds(30, 160, 150, 20);
        customerA.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(customerA);

        address = new JTextField();
        address.setBackground(pbackground);
        address.setOpaque(true);
        address.setBounds(150, 160, 150, 20);
        address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(address);

        // Information
        information = new JLabel("Show Information");
        information.setBounds(30, 200, 150, 50);
        information.setFont(new Font("Segoe Print", Font.BOLD, 14));
        panel.add(information);

        // Info panel
        info = new JTextArea();
        info.setBounds(30, 250, 300, 150);
        info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        info.setBackground(pbackground);
        info.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(info);
        scrollPane.setBounds(30, 250, 300, 150);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scrollPane);

        // Menu Section
        menu = new JLabel("Menu");
        menu.setBounds(350, 50, 150, 50);
        menu.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(menu);

        americano = new JCheckBox("Americano");
        americano.setBounds(350, 100, 150, 25);
        americano.setOpaque(true);
        americano.setBackground(pbackground);
        americano.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        MenuHandler americanoHandler = new MenuHandler(americano, 145, "Americano");
        americano.addActionListener(americanoHandler);
        panel.add(americano);

        espresso = new JCheckBox("Espresso");
        espresso.setBounds(350, 130, 150, 25);
        espresso.setOpaque(true);
        espresso.setBackground(pbackground);
        espresso.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        MenuHandler espressoHandler = new MenuHandler(espresso, 250, "Espresso");
        espresso.addActionListener(espressoHandler);
        panel.add(espresso);

        latte = new JCheckBox("Latte");
        latte.setBounds(350, 160, 150, 25);
        latte.setOpaque(true);
        latte.setBackground(pbackground);
        MenuHandler latteHandler = new MenuHandler(latte, 280, "Latte");
        latte.addActionListener(latteHandler);
        latte.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(latte);

        cappuccino = new JCheckBox("Cappuccino");
        cappuccino.setBounds(350, 190, 150, 25);
        cappuccino.setOpaque(true);
        cappuccino.setBackground(pbackground);
        MenuHandler cappuccinoHandler = new MenuHandler(cappuccino, 300, "Cappuccino");
        cappuccino.addActionListener(cappuccinoHandler);
        cappuccino.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(cappuccino);

        // meow1
        meow1 = new ImageIcon("images/meow1.png");
        meow1Img = new JLabel(meow1, JLabel.LEFT);
        meow1Img.setBounds(550, 315, 800, 100); // 305
        meow1Img.addMouseListener(this);
        // meow1
        meow2 = new ImageIcon("images/meow2.png");
        meow2Img = new JLabel(meow2, JLabel.LEFT);
        meow2Img.setBounds(230, 180, 800, 100);
        panel.add(meow2Img);

        // Snacks Section
        snacks = new JLabel("Snacks");
        snacks.setBounds(530, 50, 150, 50);
        snacks.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(snacks);

        cheese = new JCheckBox("Cheese Paprika");
        cheese.setBounds(530, 100, 150, 25);
        cheese.setOpaque(true);
        cheese.setBackground(pbackground);
        MenuHandler cheeseHandler = new MenuHandler(cheese, 220, "Cheese");
        cheese.addActionListener(cheeseHandler);
        cheese.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(cheese);

        pastry = new JCheckBox("Pastry");
        pastry.setBounds(530, 130, 150, 25);
        pastry.setOpaque(true);
        pastry.setBackground(pbackground);
        MenuHandler pastyHandler = new MenuHandler(pastry, 150, "Pastry");
        pastry.addActionListener(pastyHandler);
        pastry.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(pastry);

        croissant = new JCheckBox("Croissant");
        croissant.setBounds(530, 160, 150, 25);
        croissant.setOpaque(true);
        croissant.setBackground(pbackground);
        MenuHandler croissantHandler = new MenuHandler(croissant, 310, "Croissant");
        croissant.addActionListener(croissantHandler);
        croissant.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(croissant);

        // Tea Secton Right
        tea = new JLabel("Tea");
        tea.setBounds(530, 220, 150, 50);
        tea.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(tea);

        matcha = new JCheckBox("Matcha Tea");
        matcha.setBounds(530, 270, 120, 25);
        matcha.setOpaque(true);
        matcha.setBackground(pbackground);
        MenuHandler matchaHandler = new MenuHandler(matcha, 230, "Matcha");
        matcha.addActionListener(matchaHandler);
        matcha.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(matcha);

        milktea = new JCheckBox("Milk Tea");
        milktea.setBounds(530, 300, 120, 25);
        milktea.setOpaque(true);
        milktea.setBackground(pbackground);
        milktea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        MenuHandler milkteaHandler = new MenuHandler(milktea, 165, "milktea");
        milktea.addActionListener(milkteaHandler);
        panel.add(milktea);
        // Tea Section left
        tea = new JLabel("Tea");
        tea.setBounds(350, 220, 150, 50);
        tea.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(tea);

        greentea = new JCheckBox("Green Tea");
        greentea.setBounds(350, 270, 120, 25);
        greentea.setOpaque(true);
        greentea.setBackground(pbackground);
        MenuHandler greanTeaHandler = new MenuHandler(greentea, 160, "Green tea");
        greentea.addActionListener(greanTeaHandler);
        greentea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(greentea);

        blacktea = new JCheckBox("Black Tea");
        blacktea.setBounds(350, 300, 120, 25);
        blacktea.setOpaque(true);
        blacktea.setBackground(pbackground);
        MenuHandler blackteaHandler = new MenuHandler(blacktea, 120, "Black tea");
        blacktea.addActionListener(blackteaHandler);
        blacktea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(blacktea);

        herbaltea = new JCheckBox("Herbal Tea");
        herbaltea.setBounds(350, 330, 120, 25);
        herbaltea.setOpaque(true);
        herbaltea.setBackground(pbackground);
        MenuHandler herbalteaHandler = new MenuHandler(herbaltea, 250, "Herbal tea");
        herbaltea.addActionListener(herbalteaHandler);
        herbaltea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(herbaltea);

        // Order Button
        order = new JButton("Order");
        order.setBounds(350, 370, 130, 35);
        order.setBackground(new Color(198, 151, 88));
        order.addActionListener(this);
        panel.add(order);

        // Exit Button
        exit = new JButton("Exit");
        exit.setBounds(510, 370, 130, 35);
        exit.setBackground(new Color(198, 151, 88));
        exit.addActionListener(this);
        exit.addMouseListener(this);
        panel.add(exit);
        panel.add(meow1Img);

        super.add(panel);
        handlers = new MenuHandler[] { americanoHandler, espressoHandler, latteHandler, cappuccinoHandler,
                cheeseHandler, pastyHandler, croissantHandler, matchaHandler, milkteaHandler, greanTeaHandler,
                blackteaHandler, herbalteaHandler };

    }

    // Back end logics
    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == exit) {
            for (int i = 315; i > 305; i--) {
                meow1Img.setBounds(550, i, 800, 100);
            }
        }
    }

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == exit) {
            for (int i = 305; i < 315; i++) {
                meow1Img.setBounds(550, i, 800, 100);
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        new ExitHandler(exit).handle(ae);

        if (ae.getSource() == order) {
            String customerName = name.getText().trim();
            String customerNumber = no.getText().trim();
            String customerAddress = address.getText().trim();

            boolean atLeastOneSelected = false;
            for (int i = 0; i < handlers.length; i++) {
                if (handlers[i].getCheckBox().isSelected()) {
                    atLeastOneSelected = true;
                    break;
                }
            }

            if (customerName.isEmpty() || customerNumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter customer name and contact to place an order.");
                return;
            }

            if (!atLeastOneSelected) {
                JOptionPane.showMessageDialog(null, "Please select at least one item to place an order.");
                return;
            }

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to place the order?", "Confirm Order",
                    JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                OrderProcessor processor = new OrderProcessor();
                processor.saveOrder(customerName, customerNumber, customerAddress, handlers);
                String orderSummary = processor.readOrder();
                info.setText(orderSummary);
                info.setCaretPosition(info.getDocument().getLength());

                for (int i = 0; i < handlers.length; i++) {
                    handlers[i].getCheckBox().setSelected(false);
                    handlers[i].reset();
                }

                name.setText("");
                no.setText("");
                address.setText("");
            }

        }
    }
}