package level;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


import pacman.Evil_Player;
import pacman.player;

import javax.swing.*;

public class level1 extends level{

    ///////////////////para

    private int pacspeed = 5; //////////////////     speed of pacman
    private int evilX = 200 ; //////////  base of munsters
    private int evilY = 150;//////////  base of munsters
    private int StartPacManX = 40;
    private int StartPacManY = 40;


    ///////////////////////  the players
    private player player = new player(3,StartPacManX,StartPacManY,"imag//right.png",true,getWidth(),getHeight(),this);////////////////////   pacman
    private Evil_Player evil_player1 = new Evil_Player(50,evilX,evilY,"imag//red_r.png",true,getWidth(),getHeight(),this,1000,player);/////// mun 1

    /////////////////// constructor
    public level1(){
        super("imag//Wiki-background.jpg",640, 640,1);
        this.food = new food(this);
    }
    public void paint(Graphics g){
        super.paint(g);


        ////////////////// draw the food
        food.draw(g);



        ////////////////////// draw  pacman and muns
        player.setWindowheight(getHeight());
        player.setWindowwidth(getWidth());
        player.draw(g);
        evil_player1.setWindowheight(getHeight());
        evil_player1.setWindowwidth(getWidth());
        evil_player1.draw(g);
    }

    @Override
    public void pacdead() {
        JOptionPane.showMessageDialog(null, "pac-dead " + player.getLives() +" lives left" );
        player.setY(StartPacManY);
        player.setX(StartPacManX);
        evil_player1.setX(evilX);
        evil_player1.setY(evilY);
        this.repaint();
        evil_player1.STimer();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() ==KeyEvent.VK_RIGHT ){
            player.setX(player.getX()+pacspeed);
            player.setImage_Path("imag//right.png");
            this.repaint();
        }else if (e.getKeyCode() ==KeyEvent.VK_LEFT ){
            player.setX(player.getX()-pacspeed);
            player.setImage_Path("imag//left.png");
            this.repaint();
        }else if (e.getKeyCode() ==KeyEvent.VK_UP ){
            player.setY(player.getY()-pacspeed);
            player.setImage_Path("imag//up.png");
            this.repaint();
        }else if (e.getKeyCode() ==KeyEvent.VK_DOWN ){
            player.setY(player.getY()+pacspeed);
            player.setImage_Path("imag//down.png");
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        evil_player1.kill();
    }
}
