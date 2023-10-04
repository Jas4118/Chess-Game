package chess;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
	
	public int tileSize = 100;
	int column=8,rows=8;
	
	public Board() {
		this.setPreferredSize(new Dimension(column * tileSize, rows * tileSize));
		this.setBackground(Color.blue);
	}

}
