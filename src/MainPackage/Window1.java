package MainPackage;
import javax.swing.*;


public class Window1 extends JFrame
  {
	
	JButton button; 
	
	public Window1()
	{
		button = new JButton("click me!");
		button.setBounds(130,100,100,40);
		add(button);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}

  }