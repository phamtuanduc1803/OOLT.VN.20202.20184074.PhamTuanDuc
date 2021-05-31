package hust.soict.hedspi.aims;

public class PlayerException extends Exception {
	/**
	 * From Lab10
	 */
	private static final long serialVersionUID = 1L;

	public PlayerException() {
		super();
	}
	
	public PlayerException(String explaination) {
		System.err.println(explaination);
	}
}
