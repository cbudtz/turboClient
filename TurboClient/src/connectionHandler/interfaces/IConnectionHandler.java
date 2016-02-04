package connectionHandler.interfaces;

import connectionHandler.KeyPressData;

public interface IConnectionHandler {
	void establishConnecton(String host);
	void registerGameStateListener(IConnectionListener listener);
	void sendKeyPress(KeyPressData kpd);

}
