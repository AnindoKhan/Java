import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	// attributes
	
	public JFrame window;
	public Container container;
	
	// constructor
	
	public GUI() {
		window = new JFrame();
			window.setTitle("Adventure Game");
			window.setResizable(false);
			window.setSize(1000, 600);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.getContentPane().setBackground(Color.darkGray);
			window.setLayout(null);
			window.setVisible(true);
		container = window.getContentPane();
	}
	
	// methods
	
	public void updateContainer(JPanel panel) {
		container.removeAll();
		container.revalidate();
		container.add(panel);
		window.repaint();
	}
	
	public void updateContainer(ArrayList<JPanel> panels) {
		container.removeAll();
		container.revalidate();
		for (JPanel panel : panels) {
			container.add(panel);
		}
		window.repaint();
	}
}
