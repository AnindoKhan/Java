import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends Room {	
	public Home(GUI gui, Player player) {
		super(gui, player);
		this.textArea.setText(String.format(
			"As you walk along the forest road, you come upon a "
			+ "small, wooden bridge spanning a deep ravine. "
			+ "Between you and the bridge is a big ugly troll blocking your way. "
			+ "He says to you, "
			+ "%n %n"
			+ " \"My toll to cross this here bridge is 5 copper pieces. "
			+ "Man, I\'m hungry though.  I would waive my fee if you had something "
			+ "to eat...\" "
			+ "%n %n"
			+ "You have no money, but earlier you remember seeing a grove of apple "
			+ "tress back up the road."
			));
		Choice1Listener c1l = new Choice1Listener();
		this.choice1.setText("go back up the road");
		this.choice1.addActionListener(c1l);
		Choice2Listener c2l = new Choice2Listener();
		this.choice2.setText("try to shove past the troll");
		this.choice2.addActionListener(c2l);
		Choice3Listener c3l = new Choice3Listener();
		this.choice3.setText("give apple");
		this.choice3.addActionListener(c3l);	
		this.choice3.setForeground(Color.green); // optional button text color change
		Choice4Listener c4l = new Choice4Listener();
		this.choice4.setText("stab");
		this.choice4.addActionListener(c4l);
		this.choice4.setForeground(Color.red); // optional button text color change
		
		// logic
		
		if (!player.getInventory().contains("apple")) {
			this.choice3.setVisible(false);
		}
		if (!player.getInventory().contains("sword")) {
			this.choice4.setVisible(false);
		}
		
		// update GUI
		
		this.pushPanelsToGUI();
	}
		
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {	
			SwordRoom sr = new SwordRoom(gui,player);
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			player.damagePlayer(1, gui);
			if (player.health <= 0) {
				PlayerDeath pd = new PlayerDeath(gui, player);
			} else {
				ShovePast sp = new ShovePast(gui, player);
			}
		}
	}	
	
	public class Choice3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			player.removeFromInventory("apple");
			player.addToInventory("goodwill");
			GiveApple giveApple = new GiveApple(gui, player);
		}
	}	
	
	public class Choice4Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			player.removeFromInventory("sword");
			player.addToInventory("bloody sword");
			player.addToInventory("guilt");
			StabTroll st = new StabTroll(gui, player);
		}
	}	
	
	
	
	
	
}
