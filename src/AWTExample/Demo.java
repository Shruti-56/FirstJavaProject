package AWTExample;
import java.awt.*;
public class Demo extends Frame{
	Demo()
	{
		Label l1=new Label("Hello!.. Welcome");
		Label l2=new Label("Employee name");
		TextField t1=new TextField();
		Checkbox c1=new Checkbox("Temporary employee");
		Checkbox c2=new Checkbox("Permanent employee");
		Choice c=new Choice();
		c.add("java");
		c.add("python");
		c.add("C++");
		c.add("php");
		c.add("web development");
		l1.setBounds(80,30,70,70);
		l2.setBounds(80,60,70,70);
		t1.setBounds(100,60,70,70);
		c1.setBounds(80,100,70,70);
		c2.setBounds(80,120,70,70);
		c.setBounds(80,140,70,70);
		setSize(1000,800);
		setTitle("this is my form");
		setLayout(null);
		setVisible(true);
		add(l1);
		add(l2);
		add(c1);
		add(c2);
		add(t1);
		add(c);
		
	}

	public static void main(String[] args) {
		Demo d=new Demo();

	}

}
