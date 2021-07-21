import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wizard extends Room {

	public Wizard(GUI gui, Player player) {
		super(gui, player);
		Choice1Listener c1l = new Choice1Listener();
		Choice2Listener c2l = new Choice2Listener();
		Choice3Listener c3l = new Choice3Listener();
		Choice4Listener c4l = new Choice4Listener();
		this.textArea.setText(String.format(
			"You have chosen the path of the wizard.  "
			+ "Wizards should go study magic at the academy."
			));
		this.textArea.setForeground(Color.cyan);
		this.choice1.setText("go to academy");
		this.choice1.addActionListener(c1l);
		this.choice2.setText("go to library");
		this.choice2.addActionListener(c2l);
		this.choice3.setText("find patron");
		this.choice3.addActionListener(c3l);
		this.choice4.setText("go back");
		this.choice4.addActionListener(c4l);
		this.pushPanelsToGUI();
	}
		
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("go to acedemy");
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("go to library");
		}
	}	
	
	public class Choice3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("find patron");
		}
	}	
	
	public class Choice4Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("go back");
			Home home = new Home(gui, player);
		}
	}	
}
