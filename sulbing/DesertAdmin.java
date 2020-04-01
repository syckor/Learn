package sulbing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DesertAdmin extends JPanel {
	JButton desertMenu1, desertMenu2, desertMenu3;
	DesertAdmin() {
		
		
		setLayout(new GridLayout(1,3));
		add(desertMenu1 = new JButton(new ImageIcon("src/sulbing/img/2-1.PNG")));
		add(desertMenu2 = new JButton(new ImageIcon("src/sulbing/img/2-2.PNG")));
		add(desertMenu3 = new JButton(new ImageIcon("src/sulbing/img/2-3.PNG")));
		desertMenu1.setBackground(Color.WHITE);
		desertMenu2.setBackground(Color.WHITE);
		desertMenu3.setBackground(Color.WHITE);
	}
}
