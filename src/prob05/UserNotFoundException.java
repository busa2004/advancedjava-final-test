package prob05;

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super("사용자를 찾을 수 없습니다." );
	}
	
	public UserNotFoundException( String message ) {
		super( message );
	}
	
}
