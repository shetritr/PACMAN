package menus;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame implements ActionListener{

	JButton start, exit;

	public MainWindow(){
		setBounds(200, 100, 500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start= new JButton("New Game");
		start.setBounds(180, 110, 100, 20);
		getContentPane().add(start);
		start.addActionListener(this);
		start.setFocusable(false);
		exit= new JButton("Exit");
		exit.setBounds(180, 150, 100, 20);
		getContentPane().add(exit);
		exit.addActionListener(this);
		exit.setFocusable(false);
		JLabel label = new JLabel("PACMAN");
		label.setFont(new Font("Chiller", Font.BOLD ,44));
		label.setBounds(170, 10, 200, 80);
		getContentPane().add(label);
	}//close constructor

	/**button action listener function.
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(start)){//open the game when the button start is pushed.
			new SecondMenu();
			dispose();
		}
		if (e.getSource().equals(exit)){//close the game when the button exit is pushed.
			dispose();
		}
	}//close actionPerformed. 
	
}
