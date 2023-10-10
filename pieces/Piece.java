package pieces;

import javax.imageio.ImageIO;

import chess.Board;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {
	public int columns, rows;
	public int xPos, yPos;
	public int value;
	
	public boolean isWhite;
	public String pieceName;
	
	Board board;
	Image sprite;
	
	BufferedImage sheet;
	{
		try {
			sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("Chess.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Piece(Board board) {
		this.board = board;
	}
	
	
}
