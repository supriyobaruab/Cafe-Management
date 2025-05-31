import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CafeManagement extends JFrame{
    private JPanel panel;
    private JLabel title,customer,customerN,customerNo,customerA,menu,mnacks,tea,information,imagLabel;
    private Color pbackground;
    private JTextField name,no,address;
    private JRadioButton coffee,espresso,latte,cappuccino,greentea,blacktea,herbaltea;
    private JCheckBox cookie,muffin,croissant;
    private ButtonGroup coffeeGroup,teaGroup;
    private JTextArea info;
    private ImageIcon banner;
    private JButton exit,order;
    ImageIcon icon  = new ImageIcon("images/icon.png");
    public CafeManagement(){
        // CAFE MANAGEMENT SYSTEM 
        super("Cafe Management System");
        super.setBounds(500,100,670,480);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(icon.getImage());
        //panel
        panel = new JPanel();
        panel.setLayout(null);
        pbackground = new Color(255,240,219);
        panel.setBackground(pbackground);
        //label
        title = new JLabel("Cozy Nest                ",JLabel.CENTER);
        title.setBounds(0,0,800,50);
        title.setFont(new Font("Segoe Print", Font.BOLD, 22));
        title.setBackground(new Color(198,151,88));
        title.setOpaque(true);
        //image
        banner = new ImageIcon("images/logo.png");
        imagLabel = new JLabel(banner, JLabel.LEFT);
        imagLabel.setBounds(220,0,800,50);
        panel.add(imagLabel);
        panel.add(title);
        
        //Customer section
        customer = new JLabel("Customer Details");
        customer.setBounds(30,50,150,50);
        customer.setFont(new Font("Segoe Print",Font.BOLD,14));
        panel.add(customer);
        customerN = new JLabel("Customer Name :");
        customerN.setFont(new Font("Segoe Print",Font.PLAIN,12));
        customerN.setBounds(30,100,150,20);
        panel.add(customerN);
        //
        name = new JTextField();
        name.setBounds(150,100,100,20);
        name.setBackground(pbackground);
        name.setOpaque(true);
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(name);
        //
        customerNo = new JLabel("Customer No :");
        customerNo.setFont(new Font("Segoe Print",Font.PLAIN,12));
        customerNo.setBounds(30,130,150,20);
        panel.add(customerNo);
        no = new JTextField();
        no.setBackground(pbackground);
        no.setOpaque(true);
        no.setBounds(150,130,100,20);
        no.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(no);
        //
        customerA = new JLabel("Customer Address :");
        customerA.setBounds(30,160,150,20);
        customerA.setFont(new Font("Segoe Print",Font.PLAIN,12));
        panel.add(customerA);
        address = new JTextField();
        address.setBackground(pbackground);
        address.setOpaque(true);
        address.setBounds(150,160,100,20);
        address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(address);
        //Information 
        information = new JLabel("Show Information");
        information.setBounds(30,200,150,50);
        information.setFont(new Font("Segoe Print",Font.BOLD,14));
        panel.add(information);
        info = new JTextArea();
        panel.add(info);
        info.setBounds(30,250,300,150);
        info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        info.setBackground(pbackground);
        //Menu
        menu = new JLabel("Menu");
        menu.setBounds(350,50,150,50);
        menu.setFont(new Font("Segoe Print", Font.BOLD, 16));
        //Coffee
        coffee = new JRadioButton("Coffee");
        coffee.setBounds(350, 100, 150, 25);
        coffee.setOpaque(true);
        coffee.setBackground(pbackground);
        coffee.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(coffee);
        //Expresso
        espresso = new JRadioButton("Espresso");
        espresso.setBounds(350, 130, 150, 25);
        espresso.setOpaque(true);
        espresso.setBackground(pbackground);
        espresso.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(espresso);
        //Latte 
        latte = new JRadioButton("Latte");
        latte.setBounds(350, 160, 150, 25);
        latte.setOpaque(true);
        latte.setBackground(pbackground);
        latte.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(latte);
        //Capauccino
        cappuccino = new JRadioButton("Cappuccino");
        cappuccino.setBounds(350, 190, 150, 25);
        cappuccino.setOpaque(true);
        cappuccino.setBackground(pbackground);
        cappuccino.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(cappuccino);
        panel.add(menu);

        //group
        coffeeGroup = new ButtonGroup();
        coffeeGroup.add(coffee);
        coffeeGroup.add(espresso);
        coffeeGroup.add(latte);
        coffeeGroup.add(cappuccino);

        //mnacks
        mnacks = new JLabel("Snacks");
        mnacks.setBounds(530,50,150,50);
        mnacks.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(mnacks);
        //Cookie
        cookie = new JCheckBox("Cookie");
        cookie.setBounds(530, 100, 150, 25);
        cookie.setOpaque(true);
        cookie.setBackground(pbackground);
        cookie.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(cookie);
        //Muffin
        muffin = new JCheckBox("Muffin");
        muffin.setBounds(530, 130, 150, 25);
        muffin.setOpaque(true);
        muffin.setBackground(pbackground);
        muffin.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(muffin);
        //Croissant
        croissant = new JCheckBox("Croissant");
        croissant.setBounds(530, 160, 150, 25);
        croissant.setOpaque(true);
        croissant.setBackground(pbackground);
        croissant.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(croissant);
        // Tea
        tea = new JLabel("Tea");
        tea.setBounds(350,220,150,50);
        tea.setFont(new Font("Segoe Print", Font.BOLD, 16));
        panel.add(tea);
        //Grean Tea
        greentea = new JRadioButton("Green Tea");
        greentea.setBounds(350, 270, 150, 25);
        greentea.setOpaque(true);
        greentea.setBackground(pbackground);
        greentea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(greentea);
        //Black tea
        blacktea = new JRadioButton("Black Tea");
        blacktea.setBounds(350, 300, 150, 25);
        blacktea.setOpaque(true);
        blacktea.setBackground(pbackground);
        blacktea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(blacktea);
        //Harbal tea
        herbaltea = new JRadioButton("Herbal Tea");
        herbaltea.setBounds(350, 330, 150, 25);
        herbaltea.setOpaque(true);
        herbaltea.setBackground(pbackground);
        herbaltea.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        panel.add(herbaltea);
        //Tea group
        teaGroup = new ButtonGroup();
        teaGroup.add(greentea);
        teaGroup.add(blacktea);
        teaGroup.add(herbaltea);
        // button(order)
        order = new JButton("Order");
        order.setBounds(350, 370, 130, 35);
        order.setBackground(new Color(198,151,88));
        // order.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(order);
        exit = new JButton("Exit");
        exit.setBounds(510, 370, 130, 35);
        // exit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(exit);
        super.add(panel);


    }
}