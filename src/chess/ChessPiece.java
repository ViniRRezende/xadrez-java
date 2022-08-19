package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {//Apenas o get para nao permitir que a cor seja alterada
		return color;
	}
}
