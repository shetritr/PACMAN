package pacman;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphicsBoard extends JPanel {


	public void paint(Graphics g){
		super.paint(g);
		int [][] a={{1,1,1,},
				{1,2,2,1},
				{1,2,3,1},
				{1,1,1,1}};

		for(int i=0 ; i < a.length ; i++){
			for (int j=0 ; j < a.length ; j++){
				if(a[i][j]==1){
					g.drawRect(i, j, 10, 10);
					g.fillRect(i, j, 10, 10);
					g.setColor(Color.GREEN);
				}
			}
		}
	}
	
}
