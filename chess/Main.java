package chess;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setMinimumSize(new Dimension(1000,1000));
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());
		
		Board board = new Board();
		frame.add(board);
		frame.setVisible(true);
	}

}
