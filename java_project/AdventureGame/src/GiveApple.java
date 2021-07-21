import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiveApple extends Room{

	public GiveApple(GUI gui, Player player) {
		super(gui, player);
		this.textArea.setText(String.format(
			"You give the troll your apple."
			+ "%n %n"
			+ " \" Thank you so much!\", he says before tossing the apple into his mouth, "
			+ "which he then impressively swallows in a single gulp, without even chewing first."
			+ "%n %n"
			+ "He steps aside, giving you access to the bridge, and wishes you a happy journey."
			));
		Choice1Listener c1l = new Choice1Listener();
		choice1.setText("cross the bridge");
		choice1.setForeground(Color.green);
		choice1.addActionListener(c1l);
		
		
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
			CrossBridge cb = new CrossBridge(gui, player);
		}
	}	
}
