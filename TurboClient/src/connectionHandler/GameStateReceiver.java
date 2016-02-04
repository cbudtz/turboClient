package connectionHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.TimerTask;

import javax.swing.Timer;

public class GameStateReceiver implements Runnable {

	private ObjectInputStream objectInputStream;
	private GameState gameState;

	public GameStateReceiver(InputStream inputStream) throws IOException {
		this.objectInputStream = new ObjectInputStream(inputStream);
	}

	@Override
	public void run() {
		while(true){
			System.out.println("Waiting for Gamestate data");
			try {
				gameState =(GameState) objectInputStream.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(gameState);
		}
		
	}

}
