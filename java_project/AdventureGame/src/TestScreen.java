import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestScreen implements ActionListener {

	GUI gui;
	Player player;
	public TestScreen(GUI gui) {
		this.gui = gui;
		
		ArrayList<JPanel> panels = new ArrayList<JPanel>();
		
		Font font = new Font("Papyrus", Font.PLAIN, 16);
		
		JPanel panel1 = new JPanel();
			panel1.setBounds(100,100,500,100);
			panel1.setBackground(Color.pink);
			JLabel label1 = new JLabel("Enter quest");
				label1.setFont(font);
				label1.setForeground(Color.black);
			panel1.add(label1);
				
		JPanel buttonPanel = new JPanel();
			buttonPanel.setBounds(100, 300, 500, 100);
			buttonPanel.setBackground(Color.yellow);
			JButton button = new JButton("enter");
			button.setFont(font);
			button.setForeground(Color.white);
			button.setBackground(Color.black);	
				button.addActionListener(this);
			buttonPanel.add(button);
		
		panels.add(panel1);	
		panels.add(buttonPanel);
		gui.updateContainer(panels);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Home home = new Home(gui, player);
		
	}
}
