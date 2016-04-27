package exception;

public class NoJacketWhenHot extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NoJacketWhenHot(String s) {
	      super(s);
	   }
	
	class TestCommand {
		   void noJacketWhenHot() throws NoJacketWhenHot {
		      throw new NoJacketWhenHot("Fail");
		   }
		}

}
