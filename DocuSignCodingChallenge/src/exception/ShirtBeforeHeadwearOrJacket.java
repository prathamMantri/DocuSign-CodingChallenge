package exception;

public class ShirtBeforeHeadwearOrJacket extends Exception{
	private static final long serialVersionUID = 1L;

	public ShirtBeforeHeadwearOrJacket(String s) {
	      super(s);
	   }
	
	class TestCommand {
		   void ShirtBeforeHeadwearOrJacket() throws ShirtBeforeHeadwearOrJacket {
		      throw new ShirtBeforeHeadwearOrJacket("Fail");
		   }
		}
}
