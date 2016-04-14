package exception;

public class NoShooesBeforePants extends Exception {
	

	 public NoShooesBeforePants(String s) {
	      super(s);
	   }
	
	class TestCommand {
		   void noShooesBeforePants() throws NoShooesBeforePants {
		      throw new NoShooesBeforePants("Fail");
		   }
		}

}
