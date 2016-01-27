import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestSendData {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 5151);
			OutputStream os = s.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			KeyPressData kpd = new KeyPressData();
			kpd.keys.add('e');
			oos.writeObject(kpd);
			Thread.sleep(100000);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
