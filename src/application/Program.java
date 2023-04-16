package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

//import boardgame.Board;

//import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Position pos = new Position(3, 5); implantação do position aula 182
		//System.out.println(pos);
		
		//Board board = new Board(8, 8);  implantacao piece e board aula 183
		
		ChessMatch chessMatch = new ChessMatch();
		//UI.printBoard(chessMatch.getPieces());
		
		while(true) { //aula 189
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
		}
	}

}
