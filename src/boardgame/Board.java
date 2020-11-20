package boardgame;

public class Board {
	private int columns;
	private int rows;
	private Piece[][] pieces;

	public Board(int columns, int rows) {
		if (columns < 1 || rows < 1) {
			throw new BoardException("Board tem que ter ao menos uma lina e uma coluna");
		}
		this.columns = columns;
		this.rows = rows;
		pieces = new Piece[rows][columns];
	}

	public int getColumns() {
		return columns;
	}

	public int getRows() {
		return rows;
	}

	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posição inexistente no tabuleiro");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição inexistente no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça nessa posição.");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição inexistente no tabuleiro");
		}
		return piece(position) != null;
	}

}
