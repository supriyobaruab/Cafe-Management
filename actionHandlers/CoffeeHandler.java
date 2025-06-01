package actionHandlers;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CoffeeHandler {
    private JRadioButton americano,espresso,latte,cappuccino;
    private int aq,eq,lq,cq;

    public CoffeeHandler(JRadioButton americano,JRadioButton espresso,JRadioButton latte,JRadioButton cappuccino){
        this.americano = americano;
        this.espresso = espresso;
        this.latte = latte;
        this.cappuccino = cappuccino;
        aq=0;
        eq=0;
        lq=0;
        cq=0;
        }
        public void handle(ActionEvent ae){
            if(americano.isSelected()){
                String asq = JOptionPane.showInputDialog("Enter the quantity");
                System.out.print(asq);
                if(asq == null || asq == ""){
                    JOptionPane.showMessageDialog(null,"Enter a valid number");
                    asq = JOptionPane.showInputDialog("Enter the quantity");
                }
                aq = Integer.parseInt(asq);
                System.out.println(asq);
            }
        }
    
}
