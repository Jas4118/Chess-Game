package chess;

import javax.swing.*;

import pieces.Knight;
import pieces.Piece;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
	
	public int tileSize = 100;
	int columns=8,rows=8;
	
	ArrayList<Piece> pieceList=new ArrayList<>();
	
	public Board() {
		this.setPreferredSize(new Dimension(columns * tileSize, rows * tileSize));
	}
	
	public void addPiece() {
		pieceList.add(new Knight(this,2,0,false));
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		for(int r=0; r < rows; r++) {
			for(int c=0; c < columns; c++) {
				g2d.setColor((c+r)%2==0 ? Color.black: Color.white);
				g2d.fillRect(c*tileSize, r*tileSize, tileSize, tileSize);
			}
			for (Piece piece: pieceList) {
				piece.paint(g2d);
			}
		}
	}

}
