package MainPackage;
import javax.swing.*;

import java.awt.Image;
import java.awt.event.*;


public class FrameWithButton extends JFrame 
{
	JButton button;
	
	public FrameWithButton()
	{
		//titles window
		setTitle("button example");
		
		//sets an non editable text field
		final JTextField textField = new JTextField();
		textField.setBounds(50,50,160,20);
		
		//create an image icon, resized for button
		ImageIcon helloWorld = new ImageIcon("C:\\Java\\Projects\\GUI Training\\Assets\\Hello World.png");
		Image im = helloWorld.getImage();
		Image newhelloWorldImgImage = im.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
		helloWorld = new ImageIcon(newhelloWorldImgImage);
		
		//creates and ads a button
		button = new JButton(helloWorld);
		button.setBounds(50,100,300,100);
		button.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("Hello, World!");
				
			}
		});
		
		JLabel title = new JLabel("this is a label!");
		title.setBounds(50, 0, 100,30);  
		add(title);
		
		
		add(button);
		add(textField);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

}
