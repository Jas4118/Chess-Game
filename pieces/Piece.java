package pieces;

import javax.imageio.ImageIO;

import chess.Board;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {
	public int columns, rows;
	public int xPos, yPos;
	public int value;	
	public boolean isWhite;
	public String pieceName;

	BufferedImage sheet;
	
	{
		try {
			sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("Chess.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	protected int sheetScale= sheet.getWidth()/6;
	
	Board board;
	Image sprite;
	
	

	public Piece(Board board) {
		this.board = board;
	}
	
	public void paint(Graphics2D g2d) {
		g2d.drawImage(sprite, xPos, yPos,null);
	}
	
	
}
