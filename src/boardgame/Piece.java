package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;//Inicialmente ao criar a peça temos que informar o tabuleiro mas a posição fica nula de inicio
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;//se achar alguma posicao que é possivel mover retorna true
				}
			}
		}
		return false;//se nao achar nenhuma retorna falso avisando que nao ée possivel mover a peça
	}
}
