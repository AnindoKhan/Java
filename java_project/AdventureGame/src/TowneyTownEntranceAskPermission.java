import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TowneyTownEntranceAskPermission extends Room {

	public TowneyTownEntranceAskPermission(GUI gui, Player player) {
		super(gui, player);
		this.textArea.setText(String.format(
			" \"No.\" "
			));
		Choice1Listener c1l = new Choice1Listener();
		this.choice1.setText("next");
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
			TownEntrance te = new TownEntrance(gui, player);
		}
	}	
}
