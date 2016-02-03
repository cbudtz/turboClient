package connectionHandler;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class KeyPressTransmitter {
	private ObjectOutputStream objectOutputStream;
	public KeyPressData kpd = new KeyPressData();
	
	public KeyPressTransmitter(ObjectOutputStream outputStream) throws IOException{
		this.objectOutputStream = outputStream;
	}
	
	public void sendData(KeyPressData kpd) throws IOException{
		objectOutputStream.writeObject(kpd);
		//objectOutputStream.flush();
	}

}
