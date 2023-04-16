package application;

import chess.ChessMatch;

//import boardgame.Board;

//import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Position pos = new Position(3, 5); implantação do position aula 182
		//System.out.println(pos);
		
		//Board board = new Board(8, 8);  implantacao piece e board aula 183
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
