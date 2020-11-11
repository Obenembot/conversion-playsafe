package za.co.playsafe.exceptions;

public class InvalidFigureException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String MESSAGE = "INVALID  VALUE ";

	public InvalidFigureException() {
		super(MESSAGE);
	}

	public InvalidFigureException(Double value) {
		super(MESSAGE +" "+ value);

	}

}
