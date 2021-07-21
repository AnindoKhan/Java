import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StabTroll extends Room{

	public StabTroll(GUI gui, Player player) {
		super(gui, player);
		this.textArea.setText(String.format(
			" \" Ouch,\" the troll exclaims, as he keels over and begins to bleed profusely onto the grass."
			+ "%n %n"
			+ "As the light fades from his eyes, you feel a twinge of guilt... "
			+ "%n %n"
			+ "You are now free to cross the bridge."
			));
		Choice1Listener c1l = new Choice1Listener();
		this.choice1.setText("cross the bridge");
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
			CrossBridge cb = new CrossBridge(gui, player);
		}
	}	
}
