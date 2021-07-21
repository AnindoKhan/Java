import java.util.ArrayList;

public class Player {

	// attributes
	
	int health;
	ArrayList<String> inventory;
	
	// constructor
	
	public Player() {
		System.out.println("Player created");
		health = 10;
		System.out.println("Health: " + this.health);
		inventory = new ArrayList<String>();
		System.out.println("Inventory created (empty)");
	}

	public ArrayList<String> getInventory() {
		System.out.println("current inventory: " + inventory.toString());
		return inventory;
	}

	public void addToInventory(String item) {
		inventory.add(item);
		System.out.println(item + " added to player inventory");
	}
	
	public void removeFromInventory(String item) {
		inventory.remove(item);
		System.out.println(item + " removed from player inventory");
	}
	
	public void damagePlayer(int dmg, GUI gui) {
		health = health - dmg;
		System.out.println(health);
		if (health <= 0) {
			System.out.println("player has died");
		}
	}
	
}
