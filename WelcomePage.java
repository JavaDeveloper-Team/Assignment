package assignement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class MenWindow{
    JFrame frame;
    Label labe,label1,label2,label3;
    MenWindow(){
            frame=new JFrame();
          labe=new Label("LIST OF FOOD ITEMS");
          label1=new Label("Pizza");
          label2=new Label("Burger");
         label3=new Label("Sushi");
         frame.add(labe);
         labe.setBounds(100, 20, 150, 30);
         labe.setForeground(Color.BLUE);
         label1.setBounds(150, 42, 50, 30);
         label2.setBounds(150, 62, 100, 30);
                  label3.setBounds(150, 85, 100, 30);
         frame.add(label1);
           frame.add(label2);
            frame.add(label3);
         frame.setSize(350,210);
    frame.setTitle("Menu");
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setLocation(500,300);
        }
        }
public class WelcomePage extends WindowAdapter implements ActionListener {
     Button btn1,btn2;
    Frame fr;
     WelcomePage(){
   fr=new Frame();
    Label l1=new Label("Welcome to QuickFood!");
     btn1=new Button("View Menu");
     btn2=new Button("Place Order");
      fr.add(l1);
      fr.add(btn1);
           fr.add(btn2);
               btn1.setBackground(Color.LIGHT_GRAY);
               btn2.setBackground(Color.LIGHT_GRAY);
            btn1.addActionListener(this);
      btn2.addActionListener(this);
      fr.setLocation(350,200);
    fr.setSize(600,400);
    fr.setTitle("QuickFood Order Management");
    fr.setLayout(new FlowLayout());
    fr.setVisible(true);
     fr.addWindowListener(this);
    }
    public static void main(String[] args){
       new WelcomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
        new MenWindow();
        }
        
    }
     @Override
    public void windowClosing(WindowEvent ex){
          if(ex.getWindow()==fr){
    System.exit(0);
        }
}
}

