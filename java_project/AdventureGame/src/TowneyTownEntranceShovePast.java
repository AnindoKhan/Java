import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TowneyTownEntranceShovePast extends Room {

	public TowneyTownEntranceShovePast(GUI gui, Player player) {
		super(gui, player);
		this.textArea.setText(String.format(
			" \"Hey!,\" she shouts as you shove her aside and run through the gate. "
			+ "Four human guards burst out of the barracks and surround you, weapons drawn. "
			+ "They rough you up for 3 damage and throw you back on the other side of the gate."
			+ "%n %n"
			+ "Health: " + player.health
			));
		Choice1Listener c1l = new Choice1Listener();
		this.choice1.setText("next");
		this.choice1.addActionListener(c1l);
		Choice2Listener c2l = new Choice2Listener();
		this.choice2.setText("");
		this.choice2.addActionListener(c2l);
		Choice3Listener c3l = new Choice3Listener();
		this.choice3.setText("");
		this.choice3.addActionListener(c3l);	
		this.choice3.setForeground(Color.green); // optional button text color change
		Choice4Listener c4l = new Choice4Listener();
		this.choice4.setText("");
		this.choice4.addActionListener(c4l);
		this.choice4.setForeground(Color.red); // optional button text color change
		
		// logic
		
		this.choice2.setVisible(false);
		this.choice3.setVisible(false);
		this.choice4.setVisible(false);
		
		// update GUI
		
		this.pushPanelsToGUI();
	}
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {	
			TownEntrance te = new TownEntrance(gui, player);
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
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
