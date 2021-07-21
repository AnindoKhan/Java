import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Room {
	GUI gui;
	Player player;
	Font font;
	JPanel textPanel;
	JTextArea textArea;
	JPanel buttonsPanel;
	JButton choice1;
	JButton choice2;
	JButton choice3;
	JButton choice4;
	ArrayList<JPanel> panels;
	
	public Room(GUI gui, Player player) {
		this.gui = gui;
		this.player = player;
		this.panels = new ArrayList<JPanel>();
		
		font = new Font("Papyrus", Font.PLAIN, 20);
		
		textPanel = new JPanel();
			textPanel.setBounds(100, 50, 800, 350);
			textPanel.setBackground(Color.DARK_GRAY);
		textArea = new JTextArea("", 30, 50);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setBackground(Color.DARK_GRAY);
			textArea.setFont(font);
			textArea.setForeground(Color.white);
			textArea.setEditable(false);
			// text area textstring to be assigned in subclass constructor
		
		textPanel.add(textArea);
		
		buttonsPanel = new JPanel();
			buttonsPanel.setBounds(100, 400, 800, 100);
			buttonsPanel.setBackground(Color.DARK_GRAY);
		
		choice1 = new JButton();
			choice1.setFont(font);
			choice1.setBackground(Color.gray);
			choice1.setForeground(Color.black);
			// choice1.setText(text); to be assigned in subclass constructor
		
		buttonsPanel.add(choice1);
		
		choice2 = new JButton();
			choice2.setFont(font);
			choice2.setBackground(Color.gray);
			choice2.setForeground(Color.black);
			// ditto choice1
		
		buttonsPanel.add(choice2);
		
		choice3 = new JButton();
			choice3.setFont(font);
			choice3.setBackground(Color.gray);
			choice3.setForeground(Color.black);
			// ditto choice1
		
		buttonsPanel.add(choice3);
		
		choice4 = new JButton();
			choice4.setFont(font);
			choice4.setBackground(Color.gray);
			choice4.setForeground(Color.black);
			// ditto choice1
		
		buttonsPanel.add(choice4);
		
		panels.add(textPanel);
		panels.add(buttonsPanel);
	}
	
	public void pushPanelsToGUI() {
		gui.updateContainer(panels);
	}
}
