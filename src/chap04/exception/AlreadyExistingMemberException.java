package chap04.exception;

public class AlreadyExistingMemberException extends RuntimeException {

	public AlreadyExistingMemberException(String message) {
		super(message);
	}

}
