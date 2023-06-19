package AWTExample;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Frame;

public class PanelExample extends Frame {  
    PanelExample()  
       {  
           
       Panel panel=new Panel();  
       panel.setBounds(40,80,200,200);    
       panel.setBackground(Color.gray);  
       Button b1=new Button("Button 1");     
       b1.setBounds(50,100,80,30);    
       b1.setBackground(Color.yellow);   
       Button b2=new Button("Button 2");   
       b2.setBounds(100,100,80,30);    
       b2.setBackground(Color.green);   
       panel.add(b1); panel.add(b2);  
       add(panel);  
       setSize(400,400);    
       setLayout(null);    
       setVisible(true);    
       }  
       public static void main(String args[])  
       {  
       new PanelExample();  
       }  
}  