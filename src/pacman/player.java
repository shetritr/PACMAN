package pacman;

import level.level;

import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;


public class player {
    private int lives;
    private int x;
    private int y;
    private String Image_Path;
    private boolean isAlive;
    private int windowwidth;
    private int windowheight;
    protected level level ;


    public player(int lives, int x, int y, String Image_Path, boolean isAlive, int windowwidth, int windowheight, level level) {
        this.x = x;
        this.y = y;
        this.lives =lives;
        this.Image_Path = Image_Path;
        this.isAlive = isAlive;
        this.windowwidth = windowwidth;
        this.windowheight = windowheight;
        this.level = level;
    }
    public void kill(){
        if(lives > 0){
            lives--;
            level.pacdead();
        }
        else {
            level.setPackilltimer();
            JOptionPane.showMessageDialog(null, "Game Over");
            level.restart();
        }
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
        if(CheckIfICan(x,getY()))
            this.x = x;
    }

    public void setY(int y) {
        if (CheckIfICan(getX(),y))
                this.y = y;
    }

    public void setImage_Path(String image_Path) {//////////////////////////////////////////////need to fix
        if (image_Path != null && image_Path.length() > 0 )
            this.Image_Path = image_Path;
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

    public String getImage_Path() {
        return Image_Path;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void draw (Graphics g){
        ImageIcon player = new ImageIcon(Image_Path);
        g.drawImage(player.getImage(),getX(),getY(),20,20,null);////////////////////////// check gethigh and getwidh
    }

    public Boolean CheckIfICan(int addX , int addY){
        return (getX()+addX > 10) && (getX() + addX <= windowwidth - 20)
                && (getY()+addY > 10) && (getY() + addY <= windowheight - 20)
                &&(level.getBoard().getBoardArray()[(getX()+addX)/20][(getY() + addY)/20] != 1);
    }

}
