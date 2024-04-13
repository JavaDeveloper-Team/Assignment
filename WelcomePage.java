package assignement;
import java.awt.*;
import java.awt.event.*;
 public class WelcomePage extends WindowAdapter implements ActionListener {
    WelcomePage(){
    Frame fr=new Frame();
    fr.setSize(600,400);
    fr.setTitle("QuickFood Order Management");
    fr.setLayout(new FlowLayout());
    fr.setVisible(true);
    }
    public static void main(String[] args){
       new WelcomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

