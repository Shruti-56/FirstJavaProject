package AWTExample;
import java.awt.*;    
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;    

public class WindowExample2 extends Frame implements WindowListener {    

 WindowExample2() {    

     addWindowListener(this);    
  

     setSize(400,400);    
     setLayout(null);    
     setVisible(true);    
 }    
     
//main method  
public static void main(String[] args) {    
 new WindowExample2();    
}    
public void windowActivated(WindowEvent e) {}    
public void windowClosed(WindowEvent e) {}    
public void windowClosing(WindowEvent e) {    
 dispose();    
}    
public void windowDeactivated(WindowEvent e) {}    
public void windowDeiconified(WindowEvent e) {}    
public void windowIconified(WindowEvent e) {}    
public void windowOpened(WindowEvent arg0) {}    
}    