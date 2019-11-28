package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
      
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPOsition(sc);
			
			System.out.println();
		    System.out.println("Target: ");
		    ChessPosition target = UI.readChessPOsition(sc);
		    
		    ChessPiece capturedPiece = chessMatch.perfomChessMove(source, target);
		}

	}

}
