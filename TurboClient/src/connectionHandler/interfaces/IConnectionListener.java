package connectionHandler.interfaces;

import connectionHandler.GameState;

public interface IConnectionListener {
	public enum ConnectionStatus {Connecting, Established, InvalidHost, ReEstablishing, Lost, WrongClientVersion

	}
	void receiveConnectionSatus(ConnectionStatus status);
	void receiveNewGameState(GameState gameState);

}
