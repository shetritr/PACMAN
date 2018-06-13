package pacman;

import javax.swing.*;
import java.awt.*;

public class player {
    private int lives;
    private int x;
    private int y;
    private String imagepath;
    private boolean isAlive;
    private int windowwidth;
    private int windowheight;

    public player(int lives, int x, int y, String imagepath, boolean isAlive, int windowwidth, int windowheight) {
        this.x = x;
        this.y = y;
        this.imagepath = imagepath;
        this.isAlive = isAlive;
        this.windowwidth = windowwidth;
        this.windowheight = windowheight;
    }

    public int getWindowwidth() {
        return windowwidth;
    }

    public void setWindowwidth(int windowwidth) {
        this.windowwidth = windowwidth;
    }

    public int getWindowheight() {
        return windowheight;
    }

    public void setWindowheight(int windowheight) {
        this.windowheight = windowheight;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setX(int x) {
        if(x <= windowwidth - 20 && x>=10)
            this.x = x;
    }

    public void setY(int y) {
        if (y <=windowheight -20  && y >=10)
                this.y = y;
    }

    public void setImagepath(String imagepath) {//////////////////////////////////////////////need to fix
        if (imagepath != null && imagepath.length() > 0 )
            this.imagepath = imagepath;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getLives() {

        return lives;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImagepath() {
        return imagepath;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void draw (Graphics g){
        ImageIcon player = new ImageIcon(imagepath);
        g.drawImage(player.getImage(),getX(),getY(),getWindowwidth()/25,getWindowheight()/15,null);////////////////////////// check gethigh and getwidh
    }

}
