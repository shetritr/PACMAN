package menus;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import level.level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecondMenu extends JFrame implements ActionListener{

	JButton back;
	JButton level1;


	public SecondMenu (){
		setBounds(200, 100, 500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		level1 = new JButton("level 1");
		back=new JButton("Main Menu");
		level1.setBounds(130, 270, 100, 20);
		back.setBounds(20, 270, 100, 20);
		getContentPane().add(back);
		getContentPane().add(level1);
		level1.addActionListener(this);
		back.addActionListener(this);
		back.setFocusable(false);
		level1.setFocusable(false);
		JLabel label = new JLabel("PACMAN");
		label.setFont(new Font("Chiller", Font.BOLD ,44));
		label.setBounds(170, 10, 200, 80);
		getContentPane().add(label);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(back)){//return to the main menu when button back is pressed.
			new MainWindow();
			dispose();
		}
		if (e.getSource().equals(level1)){//return to the main menu when button back is pressed.
			new level1();

		}
	}

}
