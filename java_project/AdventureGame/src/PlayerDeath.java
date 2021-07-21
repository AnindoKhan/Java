import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerDeath extends Room {

	public PlayerDeath(GUI gui, Player player) {
		super(gui, player);
		this.textArea.setText(String.format(
			"YOU   DIED"
			));
		this.textArea.setForeground(Color.red);
		
		
		
		Choice1Listener c1l = new Choice1Listener();
		this.choice1.setText("play again?");
		this.choice1.addActionListener(c1l);
		
		// logic
		
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
		
		// update GUI
		
		this.pushPanelsToGUI();
	}
	
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {	
			TitleScreen ts = new TitleScreen(gui);
		}
	}	

}
