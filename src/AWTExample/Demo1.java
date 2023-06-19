package AWTExample;
import java.awt.*;
import java.awt.event.*;
public class Demo1 extends Frame implements ActionListener{
	Button b1;
	Label l1;
	Demo1()
	{
		 b1=new Button("click here");
		 l1=new Label("hello");
		add(b1);
		add(l1);
		setSize(600,600);
		setVisible(true);
		setLayout(new FlowLayout());
		setTitle("my Frame");
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		l1.setText("welcome");
	}

	public static void main(String[] args) {
	Demo1 obj=new Demo1();

	}

}
