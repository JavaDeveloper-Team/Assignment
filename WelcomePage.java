package awt_practice;
import java.awt.*;
import java.awt.event.*;
import  java.awt.FlowLayout.*;
import javax.swing.*;
import javax.swing.JOptionPane;
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
   class PlaceOrder{
            JFrame fra;
            Label labels1;
            TextField tf1;
            Button btn3;
             String gety;
        PlaceOrder(){
        fra=new JFrame();
         labels1=new Label("Enter Your Name");
          tf1=new TextField();
         fra.add(labels1);
         labels1.setBounds(20, 50, 150, 30);
         labels1.setForeground(Color.DARK_GRAY);
         tf1.setBounds(20, 85, 100, 30);
        btn3=new Button("Submit Order");
   btn3.setBounds(20, 120, 100, 30);
   btn3.setBackground(Color.GREEN);
//                  label3.setBounds(120, 135, 100, 30);
         fra.add(tf1);
 fra.add(btn3);
 btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn3){
        gety=tf1.getText();
    if(!"".equals(tf1.getText())){
    tf1.setText(" ");
    JOptionPane.showMessageDialog(fra, "Order is Submitted");
   }
    }    
            }
 });
//            fra.add(label3);
         fra.setSize(350,210);
    fra.setTitle("Place Your Order");
    fra.setLayout(null);
    fra.setVisible(true);
    fra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      
    
     
    fra.setLocation(500,300);
        }
        }
 class WelcomePage extends WindowAdapter implements ActionListener {
    Button btn1,btn2;
    Frame fr;
    WelcomePage(){
    fr=new Frame();
     Label l1=new Label("Welcome to QuickFood!");
     btn1=new Button("View Menu");
     btn2=new Button("Place Order");
      fr.add(l1);
      fr.add(btn1);
      btn1.setBackground(Color.LIGHT_GRAY);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn2.setBackground(Color.LIGHT_GRAY);
      fr.add(btn2);
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
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
        new MenWindow();
        }
    if(e.getSource()==btn2){
      new PlaceOrder();
    }    
    }
    @Override
    public void windowClosing(WindowEvent ex){
          if(ex.getWindow()==fr){
    System.exit(0);
        }
}
}
