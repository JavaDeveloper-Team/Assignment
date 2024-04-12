package awt_practice;
import java.awt.*;
import java.awt.event.*;
import  java.awt.FlowLayout.*;
import javax.swing.*;
import javax.swing.JOptionPane;

class MenWindow{
    
    JFrame frame;// this frame is capable of display different componets
    Label labe,label1,label2,label3;// this component will be added to the frame as words
    MenWindow(){ // this is the constructor method to display menu items 
            frame=new JFrame();
          labe=new Label("LIST OF FOOD ITEMS");// this component wil be added to this frame as Title of menu items
          label1=new Label("Pizza");//this component will be added to this frame as list of food items
          label2=new Label("Burger");//this component will be added to this frame as list of food items
         label3=new Label("Sushi");//this component will be added to this frame as list of food items
         frame.add(labe);
         // setting bounds of components
         labe.setBounds(100, 20, 150, 30);
         labe.setForeground(Color.BLUE);
         label1.setBounds(150, 42, 50, 30);
         label2.setBounds(150, 62, 100, 30);
         label3.setBounds(150, 85, 100, 30);
         //add component to this frame
         frame.add(label1);
         frame.add(label2);
         frame.add(label3);
    
         frame.setSize(350,210);// set size of the frame
    frame.setTitle("Menu");//set title of the frame
    frame.setLayout(null);// set layout of this frame as null to allow setting our prefered bounds
    frame.setVisible(true);
   frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// default closing this frame window without closing the app
    frame.setLocation(500,300);// where it will be located
        }
        }
   class PlaceOrder{
       // global variable of this class
            JFrame fra;
            Label labels1;
            TextField tf1;
            Button btn3;
             String gety;
        PlaceOrder(){// this is the constructor method to display where orders will be submitted
        fra=new JFrame();
         labels1=new Label("Enter Your Name");
          tf1=new TextField();// this component allow user to enter his/her name
         fra.add(labels1);
         labels1.setBounds(20, 50, 150, 30);
         labels1.setForeground(Color.DARK_GRAY);
         tf1.setBounds(20, 85, 100, 30);
        btn3=new Button("Submit Order");// this button component will help us know whether the order sent is well submitted
   btn3.setBounds(20, 120, 100, 30);
   btn3.setBackground(Color.GREEN);
//                  label3.setBounds(120, 135, 100, 30);
         fra.add(tf1);
 fra.add(btn3);
 btn3.addActionListener(new ActionListener(){// perform action event will happen on this event
            @Override
            public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn3){
        gety=tf1.getText();
    if(!"".equals(tf1.getText())){
    tf1.setText(" ");
    JOptionPane.showMessageDialog(fra, "Order is Submitted");// to display message in the dialog 
   }
    }    
            }
 });
//            fra.add(label3);
         fra.setSize(350,210);
    fra.setTitle("Place Your Order");
    fra.setLayout(null);
    fra.setVisible(true);
    fra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// default closing this frame window without closing the app

      
    
     
    fra.setLocation(500,300);
        }
        }
 class WelcomePage extends WindowAdapter implements ActionListener {
    Button btn1,btn2;//this buttons will help us to view menu items and place order
    Frame fr;
    WelcomePage(){
    fr=new Frame();
     Label l1=new Label("Welcome to QuickFood!");
     btn1=new Button("View Menu");
     btn2=new Button("Place Order");
      fr.add(l1);
      fr.add(btn1);
      btn1.setBackground(Color.LIGHT_GRAY);
      btn1.addActionListener(this);//here adding action listener to this to view and open menu food items
      btn2.addActionListener(this);//here adding action listener to his button to open new window to place order
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
        new MenWindow();//we're invoking the constructor that holds the event performed after click on button of view menu
        }
    if(e.getSource()==btn2){
      new PlaceOrder();//we're invoking the constructor that holds the event performed after click on button of place order
    }    
    }
    @Override
    public void windowClosing(WindowEvent ex){// here we're perform window event to close the main window
          if(ex.getWindow()==fr){
    System.exit(0);
        }
}
}
