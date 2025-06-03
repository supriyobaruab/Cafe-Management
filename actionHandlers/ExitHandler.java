package actionHandlers;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class ExitHandler {
    private JButton exit;

    public ExitHandler(JButton exit){
        this.exit = exit;
    }
    public void handle(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }
    }
}
