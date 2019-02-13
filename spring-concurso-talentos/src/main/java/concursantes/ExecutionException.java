package concursantes;

public class ExecutionException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExecutionException() {
		
	}
	public ExecutionException (String msg) {
		super(msg);
	}
}
