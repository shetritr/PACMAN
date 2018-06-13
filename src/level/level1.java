package level;

import javax.swing.*;
import java.awt.*;

public class level1 extends JPanel{
    private JFrame window =new JFrame();
    private ImageIcon background = new ImageIcon("imag//Wiki-background.jpg");
    public level1(){
        window.setBounds(200, 100, 500, 350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(this);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(background.getImage(),0,0,getWidth(),getHeight(),null);
        System.out.println("paint level 1 is called");
    }
}
