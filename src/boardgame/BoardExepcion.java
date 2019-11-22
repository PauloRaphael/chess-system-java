package boardgame;

public class BoardExepcion extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BoardExepcion(String msg) {
		super(msg);
	}
}
