package connectionHandler;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

public class GameState implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4380710172237756601L;
	private ArrayList<PlayerData> playerData = new ArrayList<>();
	
	public ArrayList<PlayerData> getShips() {
		return playerData;
	}

	public void setShips(ArrayList<PlayerData> ships) {
		this.playerData = ships;
	}
	
	public class PlayerData implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = -8566225108680632406L;
		Point position = new Point(0, 0);
		Point velocity = new Point(0, 0);
		String name = "";
		int lives = 5;
		int health = 100;
		
		
	}

}
