package AWTExample;
import java.awt.*;

public class ButtonExample extends Frame {
	Button b;
	public ButtonExample() 
	{
		 b=new Button("OK");
		b.setBounds(30,60,70,80);
		setSize(600,600);
		setTitle("this is my Frame");
		setLayout(null);
		setVisible(true);
		add(b);
		
		
		
	}
	
	public static void main(String args[])
	{
		ButtonExample obj=new ButtonExample();
		
	}

}
