package level;

import java.awt.*;

public class food {

    private level level;

    public food(level level) {
        this.level = level;
    }

    public void draw (Graphics g){
        int [][] foodArray = level.getBoard().getBoardArray();
        for (int i = 0; i <foodArray[0].length ; i++) {
            for (int j = 0; j < foodArray.length; j++) {
                if (foodArray[j][i] == 4) {
                    g.setColor(Color.WHITE);
                    g.drawRect(i*20 +10 , j*20 +10 , 2, 2);
                    g.fillRect(i*20 +10 , j*20 +10  , 2, 2);
                }
                if (foodArray[j][i] == 1){
                    g.setColor(Color.black);
                    g.drawRect(i*20 , j*20, 20, 20);
                    g.fillRect(i*20, j*20, 20, 20);
                }
            }
        }
    }

}
