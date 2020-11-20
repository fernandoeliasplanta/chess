package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Pawn;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
		
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows();i++) {
			for (int j=0; j<board.getColumns();j++) {
				mat[i][j]= (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(int row, char column, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(row, column).toPosition());
	}
	
	private void initialSetup() {

		placeNewPiece(1, 'a', new Rook(board, Color.WHITE));
        placeNewPiece(1, 'e', new King(board, Color.WHITE));
        placeNewPiece(1, 'h', new Rook(board, Color.WHITE));
        placeNewPiece(2, 'a', new Pawn(board, Color.WHITE));
        placeNewPiece(2, 'b', new Pawn(board, Color.WHITE));
        placeNewPiece(2, 'c', new Pawn(board, Color.WHITE));
        placeNewPiece(2, 'd', new Pawn(board, Color.WHITE));
        placeNewPiece(2, 'e', new Pawn(board, Color.WHITE));
        placeNewPiece(2, 'f', new Pawn(board, Color.WHITE));
        placeNewPiece(2, 'g', new Pawn(board, Color.WHITE));
        placeNewPiece(2, 'h', new Pawn(board, Color.WHITE));

        placeNewPiece(8, 'a', new Rook(board, Color.BLACK));
        placeNewPiece(8, 'e', new King(board, Color.BLACK));

        placeNewPiece(8, 'h', new Rook(board, Color.BLACK));
        placeNewPiece(7, 'a', new Pawn(board, Color.BLACK));
        placeNewPiece(7, 'b', new Pawn(board, Color.BLACK));
        placeNewPiece(7, 'c', new Pawn(board, Color.BLACK));
        placeNewPiece(7, 'd', new Pawn(board, Color.BLACK));
        placeNewPiece(7, 'e', new Pawn(board, Color.BLACK));
        placeNewPiece(7, 'f', new Pawn(board, Color.BLACK));
        placeNewPiece(7, 'g', new Pawn(board, Color.BLACK));
        placeNewPiece(7, 'h', new Pawn(board, Color.BLACK));
	}

}
