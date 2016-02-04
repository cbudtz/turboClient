package connectionHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectionHandler{
	private Socket s = null;
	private KeyPressTransmitter kpt;
	private GameStateReceiver gsr;
	private String host;

	public ConnectionHandler() throws UnknownHostException, IOException{
		init();
	}


	private void init() throws UnknownHostException, IOException {
		s = new Socket("localhost", 5151);
		s.set
		kpt = new KeyPressTransmitter(new ObjectOutputStream(s.getOutputStream()));
		gsr = new GameStateReceiver(s.getInputStream());
		new Thread(gsr).start();

		while(true){
			kpt.sendData(new KeyPressData());
			System.out.println("Sending data");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		ConnectionHandler conHan = null;
		try {
			conHan = new ConnectionHandler();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
