package exceptions;

public class InvalidKeyException extends Exception{
	private static final long serialVersionUID = 682267963980463371L;

	public InvalidKeyException()
	{
		super();
	}

	/**
	 * @param message error message specific to cause of error.
	 */
	public InvalidKeyException( String message )
	{
		super( message );
	}
}


