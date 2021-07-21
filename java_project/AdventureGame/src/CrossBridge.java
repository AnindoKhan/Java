import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CrossBridge extends Room {

	public CrossBridge(GUI gui, Player player) {
		super(gui, player);
		this.textArea.setText(String.format(
			"You cross the bridge and follow the road until you find yourself on top of a grassy hill overlooking "
			+ "the area. A small dirt path shoots off from the main road and leads to a small farmhouse. "
			+ "The main road continues towards the settlement of Towney Town."
			));
		Choice1Listener c1l = new Choice1Listener();
		this.choice1.setText("check out the farmhouse");
		this.choice1.addActionListener(c1l);
		Choice2Listener c2l = new Choice2Listener();
		this.choice2.setText("head on to Towney Town");
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
		choice3.setVisible(false);
		choice4.setVisible(false);
		// update GUI
		
		this.pushPanelsToGUI();
	}
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {	
			
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			TownEntrance te = new TownEntrance(gui,player);
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
