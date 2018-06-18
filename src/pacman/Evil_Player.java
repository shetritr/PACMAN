package pacman;

import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import level.level;

public class Evil_Player extends player implements ActionListener {

    private int speed;

    public void STimer() {
        timer.start();
    }

    private Timer timer ;
    private player pacman;


    public Evil_Player(int lives, int x, int y, String Image_Path, boolean isAlive, int windowwidth, int windowheight, level level, int speed, player pacman) {
        super(lives, x, y, Image_Path, isAlive, windowwidth, windowheight,level);
        this.speed =speed;
        this.timer = new Timer(speed,  this);
        this.pacman = pacman;
        timer.start();
    }


    @Override
    public void kill() {
        Rectangle pacRec = new Rectangle(pacman.getX(),pacman.getY(),20,20);
        Rectangle evilRec = new Rectangle(getX(),getY(),20,20);
        if(pacRec.intersects(evilRec)) {
            timer.stop();
            pacman.kill();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Math.random() >=0.5){
            if (Math.random() >=0.5 && CheckIfICan(getX()+20,getY())) {
                setImage_Path("imag//red_r.png");
                setX(getX() + 20);
            }
            else{
                setImage_Path("imag//red_l.png");
                setX(getX() - 20);
            }
        }else {
            if (Math.random() >= 0.5 && CheckIfICan(getX(),getY()+20)) {
                setImage_Path("imag//red_d.png");
                setY(getY() + 20);


            } else {
                setImage_Path("imag//red_up.png");
                setY(getY() - 20);
            }
        }
        level.repaint();
    }
}
