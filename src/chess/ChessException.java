package chess;

import boardgame.BoardExepcion;

public class ChessException extends BoardExepcion{
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
	
}
