package MainPackage;
import javax.swing.*;


public class Window1 extends JFrame
  {
	JFrame window;
	JButton button; 
	
	public Window1()
	{
		button = new JButton("click me!");
		window = new JFrame();
		button.setBounds(130,100,100,40);
		window.add(button);
		window.setSize(400,400);
		window.setLayout(null);
		window.setVisible(true);
		
	}

  }