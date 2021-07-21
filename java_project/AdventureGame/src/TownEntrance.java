import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TownEntrance extends Room {

	public TownEntrance(GUI gui, Player player) {
		super(gui, player);
		this.textArea.setText(String.format(
			"You head on towards the settlement and it becomes clearer in your view as you approach. "
			+ "Towney Town is a small village surrounded by a stone wall.  A human guard armed with a lance"
			+ " is posted by the main gate. She juts out her arm, palm outward, and addresses you, "
			+ "%n %n"
			+ "\"Halt, traveler.  You are not known to us and we do not allow strangers to enter.\" "
			+ "%n %n"
			+ "Behind her you can see the town square, hustling and bustling with denizens buying and selling goods."
			));
		Choice1Listener c1l = new Choice1Listener();
		this.choice1.setText("ask permission to enter");
		this.choice1.addActionListener(c1l);
		Choice2Listener c2l = new Choice2Listener();
		this.choice2.setText("try to shove past her");
		this.choice2.addActionListener(c2l);
		Choice3Listener c3l = new Choice3Listener();
		this.choice3.setText("give apple");
		this.choice3.addActionListener(c3l);	
		this.choice3.setForeground(Color.green); // optional button text color change
		Choice4Listener c4l = new Choice4Listener();
		this.choice4.setText("fight the guard");
		this.choice4.addActionListener(c4l);
		this.choice4.setForeground(Color.red); // optional button text color change
		
		// logic
		if (!player.inventory.contains("apple")) {
			choice2.setVisible(false);
		}
		// update GUI		
		this.pushPanelsToGUI();
	}
	
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {	
			TowneyTownEntranceAskPermission ask = new TowneyTownEntranceAskPermission(gui, player);
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			player.damagePlayer(3, gui);
			if (player.health <= 0) {
				PlayerDeath pd = new PlayerDeath(gui, player);
			} else {
				TowneyTownEntranceShovePast shove = new TowneyTownEntranceShovePast(gui, player);
			}
		}
	}	
	
	public class Choice3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}	
	
	public class Choice4Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}	

}
