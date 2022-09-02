
public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//constructor
	CustomException(String message){
		//call the parent constructor, here it is Exception
		super(message);
	}
}
