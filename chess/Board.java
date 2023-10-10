package chess;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
	
	public int tileSize = 100;
	int columns=8,rows=8;
	
	public Board() {
		this.setPreferredSize(new Dimension(columns * tileSize, rows * tileSize));
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		for(int r=0; r < rows; r++) {
			for(int c=0; c < columns; c++) {
				g2d.setColor((c+r)%2==0 ? Color.black: Color.white);
				g2d.fillRect(c*tileSize, r*tileSize, tileSize, tileSize);
			}
		}
	}

}
