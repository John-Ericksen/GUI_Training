package MainPackage;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;



public class GridBagFrame extends JFrame
{
	public GridBagFrame()
	{
		JPanel panel = new JPanel();
		JButton button1 = new JButton("One");
		JButton button2 = new JButton("Two");
		JButton button3 = new JButton("Three");
		
		panel.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(5, 5, 30, 5);
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		panel.add(button1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		panel.add(button2, constraints);
		
		constraints.gridwidth = 2;
		constraints.gridheight = 5;
		constraints.gridx = 0;
		constraints.gridy = 4;
		panel.add(button3, constraints);
		
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		
	}

}
