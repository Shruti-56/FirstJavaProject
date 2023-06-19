package AWTExample;
import java.awt.*;
import java.awt.event.*;
public class Demo2 extends Frame implements ActionListener{
	TextField t1,t2;
	Button b1;
	Label l1;
	Demo2()
	{
		t1=new TextField();
		t2=new TextField();
		b1=new Button("Add");
		l1=new Label("Addition is:");
		add(b1);
		add(t1);
		add(t2);
		add(l1);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600,600);
		setTitle("this is my Frame");
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a+b;
		l1.setText("addition is"+c);
	}
	public static void main(String[] args) {
		Demo2 obj=new Demo2();

	}

}
