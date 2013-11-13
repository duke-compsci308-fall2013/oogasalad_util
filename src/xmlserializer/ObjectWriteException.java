package xmlserializer;

public class ObjectWriteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectWriteException(){
		super();
	}
	
	public ObjectWriteException(Exception e){
		super(e);
	}
	
	public ObjectWriteException(String message){
		super(message);
	}
	
	
}
