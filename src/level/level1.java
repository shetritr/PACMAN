package level;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import pacman.Evilplayer;
import pacman.player;

public class level1 extends JPanel implements KeyListener {


    private JFrame window =new JFrame();
    private ImageIcon background = new ImageIcon("imag//Wiki-background.jpg");


    ///////////////////////  the players
    private player player = new player(3,10,10,"imag//right.png",true,getWidth(),getHeight());////////////////////   pacman
    private Evilplayer evilplayer =


    //////////////////     speed of pacman
    private int speed = 10;

    public level1(){
        this.setFocusable(true);////////////// for os
        this.addKeyListener(this);//////////// for key events
        window.setBounds(200, 100, 500, 350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(this);
        window.setResizable(false);

    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(background.getImage(),0,0,getWidth(),getHeight(),null);
        player.setWindowheight(getHeight());
        player.setWindowwidth(getWidth());
        player.draw(g);
        System.out.println("paint level 1 is called");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() ==KeyEvent.VK_RIGHT ){
            player.setX(player.getX()+speed);
            player.setImagepath("imag//right.png");
            this.repaint();
        }else if (e.getKeyCode() ==KeyEvent.VK_LEFT ){
            player.setX(player.getX()-speed);
            player.setImagepath("imag//left.png");
            this.repaint();
        }else if (e.getKeyCode() ==KeyEvent.VK_UP ){
            player.setY(player.getY()-speed);
            player.setImagepath("imag//up.png");
            this.repaint();
        }else if (e.getKeyCode() ==KeyEvent.VK_DOWN ){
            player.setY(player.getY()+speed);
            player.setImagepath("imag//down.png");
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
