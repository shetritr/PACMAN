package level;


import menus.MainWindow;
import pacman.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public abstract class level extends JPanel implements KeyListener,ActionListener {

    private JFrame window =new JFrame();
    private ImageIcon background ;
    private int width;
    private int height;
    protected Board board;
    protected food food;


    //////////////////////////////   timer
    protected Timer packilltimer = new Timer(100, this);




    public level(String back,int width,int height,int levelnum ){
        board = new Board(levelnum);
        background = new ImageIcon(back);
        this.setFocusable(true);////////////// for os
        this.addKeyListener(this);//////////// for key events
        window.setBounds(200, 100, width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(this);
        window.setResizable(false);
        this.width = width;
        this.height = height;
        packilltimer.start();

    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(background.getImage(),0,0,getWidth(),getHeight(),null);
    }
    public void restart(){
        new MainWindow();
        window.dispose();
    }

    public abstract void pacdead();

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    public void setPackilltimer() {
        this.packilltimer.stop();
    }


    public Board getBoard() {
        return board;
    }

}
