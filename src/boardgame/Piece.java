package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;//Inicialmente ao criar a peça temos que informar o tabuleiro mas a posição fica nula de inicio
	}
	
	protected Board getBoard() {
		return board;
	}
}
