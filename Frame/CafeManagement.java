package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import actionHandlers.*;

public class CafeManagement extends JFrame implements MouseListener, ActionListener {

    private JPanel panel;
    private JLabel title, customer, customerN, customerNo, customerA, menu, snacks, tea, information, imagLabel,
            meow1Img, meow2Img;
    private Color pbackground;
    private JTextField name, no, address;
    private JRadioButton americano, espresso, latte, cappuccino, greentea, blacktea, herbaltea, matcha, milktea;
    private JCheckBox cheese, pastry, croissant;
    private ButtonGroup coffeeGroup, teaGroup;
    private JTextArea info;
    private ImageIcon banner, meow1, meow2;
    private JButton exit, order;

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

        info = new JTextArea();
        panel.add(info);
        info.setBounds(30, 250, 300, 150);
        info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        info.setBackground(pbackground);
        info.setEditable(false);

        // Menu Section
        menu = new JLabel("Menu");
        menu.setBounds(350, 50, 150, 50);
        menu.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(menu);

        americano = new JRadioButton("Americano");
        americano.setBounds(350, 100, 150, 25);
        americano.setOpaque(true);
        americano.setBackground(pbackground);
        americano.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        americano.addActionListener(this);
        panel.add(americano);

        espresso = new JRadioButton("Espresso");
        espresso.setBounds(350, 130, 150, 25);
        espresso.setOpaque(true);
        espresso.setBackground(pbackground);
        espresso.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        espresso.addActionListener(this);
        panel.add(espresso);

        latte = new JRadioButton("Latte");
        latte.setBounds(350, 160, 150, 25);
        latte.setOpaque(true);
        latte.setBackground(pbackground);
        latte.addActionListener(this);
        latte.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(latte);

        cappuccino = new JRadioButton("Cappuccino");
        cappuccino.setBounds(350, 190, 150, 25);
        cappuccino.setOpaque(true);
        cappuccino.setBackground(pbackground);
        cappuccino.addActionListener(this);
        cappuccino.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(cappuccino);

        // Coffee Group
        coffeeGroup = new ButtonGroup();
        coffeeGroup.add(americano);
        coffeeGroup.add(espresso);
        coffeeGroup.add(latte);
        coffeeGroup.add(cappuccino);
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
        cheese.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(cheese);

        pastry = new JCheckBox("Pastry");
        pastry.setBounds(530, 130, 150, 25);
        pastry.setOpaque(true);
        pastry.setBackground(pbackground);
        pastry.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(pastry);

        croissant = new JCheckBox("Croissant");
        croissant.setBounds(530, 160, 150, 25);
        croissant.setOpaque(true);
        croissant.setBackground(pbackground);
        croissant.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(croissant);

        // Tea Secton Right
        tea = new JLabel("Tea");
        tea.setBounds(530, 220, 150, 50);
        tea.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(tea);

        matcha = new JRadioButton("Matcha Tea");
        matcha.setBounds(530, 270, 120, 25);
        matcha.setOpaque(true);
        matcha.setBackground(pbackground);
        matcha.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        matcha.addActionListener(this);
        panel.add(matcha);

        milktea = new JRadioButton("Milk Tea");
        milktea.setBounds(530, 300, 120, 25);
        milktea.setOpaque(true);
        milktea.setBackground(pbackground);
        milktea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        milktea.addActionListener(this);
        panel.add(milktea);
        // Tea Section left
        tea = new JLabel("Tea");
        tea.setBounds(350, 220, 150, 50);
        tea.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(tea);

        greentea = new JRadioButton("Green Tea");
        greentea.setBounds(350, 270, 120, 25);
        greentea.setOpaque(true);
        greentea.setBackground(pbackground);
        greentea.addActionListener(this);
        greentea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(greentea);

        blacktea = new JRadioButton("Black Tea");
        blacktea.setBounds(350, 300, 120, 25);
        blacktea.setOpaque(true);
        blacktea.setBackground(pbackground);
        blacktea.addActionListener(this);
        blacktea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(blacktea);

        herbaltea = new JRadioButton("Herbal Tea");
        herbaltea.setBounds(350, 330, 120, 25);
        herbaltea.setOpaque(true);
        herbaltea.setBackground(pbackground);
        herbaltea.addActionListener(this);
        herbaltea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(herbaltea);

        // Tea Group
        teaGroup = new ButtonGroup();
        teaGroup.add(greentea);
        teaGroup.add(blacktea);
        teaGroup.add(herbaltea);
        teaGroup.add(matcha);
        teaGroup.add(milktea);

        // Order Button
        order = new JButton("Order");
        order.setBounds(350, 370, 130, 35);
        order.setBackground(new Color(198, 151, 88));
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
        if (ae.getSource() == americano || ae.getSource() == espresso || ae.getSource() == latte || ae
                .getSource() == cappuccino) {
            CoffeeHandler coffeeHandler = new CoffeeHandler(americano, espresso, latte, cappuccino, coffeeGroup);
            coffeeHandler.handle(ae);

            String coffeInfo = coffeeHandler.getCoffeeInfo();
            System.out.println("Coffee Bill: " + coffeInfo);
        }
        if (ae.getSource() == greentea || ae.getSource() == blacktea || ae.getSource() == herbaltea || ae
                .getSource() == matcha || ae.getSource() == milktea) {
            TeaHandler teahandler = new TeaHandler(greentea, blacktea, herbaltea, matcha, milktea, teaGroup);
            teahandler.handle(ae);

            String teaQuantity = teahandler.getTeaInfo();
            System.out.println("Tea quantity: " + teaQuantity);
        }
    }

}
