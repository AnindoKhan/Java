import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	public static void main(String[] args) {
		//new Game();
		GUI gui = new GUI();
		TitleScreen ts = new TitleScreen(gui);
	}
}
