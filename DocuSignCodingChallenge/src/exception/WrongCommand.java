package exception;
public class WrongCommand extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongCommand(String s) {
		super(s);
	}
}
