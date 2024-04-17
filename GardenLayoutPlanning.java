package assignement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GardenLayoutPlanning {
    JFrame gardenLayoutframe;
JTextField tf1,tf2;
JLabel l1,l2;
JButton bt;
    GardenLayoutPlanning(){
            gardenLayoutframe=new JFrame();//creating frame
          l1=new JLabel("LENGTH");//create label
          l2=new JLabel("WIDTH");//create label
         tf1=new JTextField();//create textfield
         tf2=new JTextField();//create textfield
         bt=new JButton("Draw Layout");//create button
          bt.setBackground(Color.BLUE);//set background to button
      bt.setForeground(Color.WHITE);//set foreground to button
      bt.getForeground();//to get foreground
          l1.setBounds(20, 30, 100, 50);//set bounds to button
         l2.setBounds(20, 60, 100, 50);//set bounds to button
         gardenLayoutframe.add(l1);//adding label to frame
          gardenLayoutframe.add(l2);//adding label to frame
            gardenLayoutframe.add(tf1);//adding textfield to frame
            tf1.setBounds(80, 48, 30, 20);////set bounds to button
            gardenLayoutframe.add(tf2);
            tf2.setBounds(80, 78, 30, 20);
     gardenLayoutframe.add(bt);//adding button to frame
     bt.setBounds(120, 65, 120, 20);//set bounds to button
           bt.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
  if(!"".equals(tf1.getText()) && !"".equals(tf2.getText())){
               int len=Integer.parseInt(tf1.getText());//getting the input from user and store it to len variable
           int wid=Integer.parseInt(tf2.getText());//getting the input from user and store it to wid variable
       tf1.setText(" ");//set textfield 1 to be empty
       tf2.setText(" ");//set textfield 1 to be empty
               }
  else{
  JOptionPane.showMessageDialog(new Frame(), "Fill the length and width field");
  
  }
           }
           });
     gardenLayoutframe.setLayout(null);//set layout for frame
    gardenLayoutframe.setTitle("Plan Layout");//set title to frame
    gardenLayoutframe.setSize(300, 200);//set size to frame
   gardenLayoutframe.setVisible(true);//set frame visiblity to true
  gardenLayoutframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//set frame to be closed
   gardenLayoutframe.setLocation(500,200);//set location of where frame displayed on the screen 
        }
        }
 


