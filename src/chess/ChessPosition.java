package chess;

import boardgame.Position;

public class ChessPosition {
	private int row;
	private char column;

	public ChessPosition(int row, char column) {
		if (column<'a' || column>'h' || row <0 || row>8) {
			throw new ChessException("Posição não existente");
		}
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public char getColumn() {
		return column;
	}
	
	protected Position toPosition() {
		return new Position(column-'a', 8-row);
	}
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition(position.getRow()-8, (char)('a'-position.getColumn()));
	}

	@Override
	public String toString() {
		return "" + column + row;
	}
	

}
