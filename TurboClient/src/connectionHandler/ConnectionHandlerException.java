package connectionHandler;

@SuppressWarnings("serial")
public class ConnectionHandlerException extends Exception {

	private String string;

	public ConnectionHandlerException(String string) {
		this.string = string;
	}

	public String getText() {
		return string;
	}
}
