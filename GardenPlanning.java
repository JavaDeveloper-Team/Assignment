package assignement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GardenPlanning extends WindowAdapter implements ActionListener {
    Button btn1,btn2;
    JFrame mainFrame;
    GardenPlanning(){//constructor to display the content of main frame
   mainFrame =new JFrame();//creating frame
     Label l1=new Label("Welcome to Green Thumb Garden Planner!");//creating label of welcomimg message
     btn1=new Button("Plan Layout");//creating button of plan layout
     btn2=new Button("Select Plant");//creating button of select plants
      mainFrame.add(l1);//adding welcoming label to frame
      mainFrame.add(btn1);//adding plan layout button to frame
      btn1.setBackground(Color.black);//set background to plan layout button
      btn1.setForeground(Color.WHITE);//set foreground to plan layout button
      btn1.getForeground();//get foreground to plan layout button
      btn1.addActionListener(this);// adding event listener to plan layout button to handle the user action
      btn2.addActionListener(this);// adding event listener to select plant to handle the user action
   btn2.setBackground(Color.black);//set background to select plant button
      btn2.setForeground(Color.WHITE);//set background to select plant button
      btn2.getForeground();//get background to select plant button
      mainFrame.add(btn2);//adding select plant button to frame
      mainFrame.setLocation(280,100);//set location of where frame displayed on the screen 
    mainFrame.setSize(800,600);//set size of frame
    mainFrame.setTitle("Green Thumb Garden Planner");//set title for
   mainFrame.setLayout(new FlowLayout());//set layout for frame 
    mainFrame.setVisible(true);//set  frame visible to true 
   mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set frame to be closed
    }
    public static void main(String[] args){
       new GardenPlanning();
    }
    @Override
    public void actionPerformed(ActionEvent e){//method to perform event handler
       if(e.getSource()==btn1){//condition to see if object is plan layout button
        new GardenLayoutPlanning();//calling the GardenLayoutPlanning constructor from GardenLayoutPlanning class 
        } 
       if(e.getSource()==btn2){//condition to see if object is select plant button
 new PlantSelect().setVisible(true);//calling the PlantSelect constructor from PlantSelect class
    }    

    }
    
}

    