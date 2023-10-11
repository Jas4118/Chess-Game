package pieces;

import java.awt.image.BufferedImage;
import chess.Board;

public class Knight extends Piece{
	public Knight(Board board, int columns, int rows, boolean isWhite) {
		super(board);
		this.columns=columns;
		this.rows=rows;
		this.xPos=columns*board.tileSize;
		this.yPos=rows*board.tileSize;
		this.isWhite=isWhite;
		this.pieceName="Knight";
		
		this.sprite=sheet.getSubimage(4*sheetScale,isWhite ? 0 : sheetScale, sheetScale, sheetScale).getScaledInstance(board.tileSize,sheetScale, BufferedImage.SCALE_SMOOTH);
		
	}
}
