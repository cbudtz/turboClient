
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import connectionHandler.KeyPressData;

public class TestSendData {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("localhost", 5151);
			OutputStream os = s.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			KeyPressData kpd = new KeyPressData();
			kpd.keys.add('e');
			oos.writeObject(kpd);
			Thread.sleep(1000);
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			System.out.println(ois.readObject());

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if (s!= null) s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
