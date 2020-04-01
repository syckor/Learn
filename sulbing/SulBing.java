package sulbing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class SulBing extends JFrame implements ActionListener{
	BestAdmin best;
	BingsuAdmin bingsu;
	DesertAdmin desert;
	BeverageAdmin beverage;
	JTextArea tf, tf2;
	JButton order, cancel, add;
	
	
	

	SulBing() {
		best = new BestAdmin();
		bingsu = new BingsuAdmin();
		desert = new DesertAdmin();
		beverage = new BeverageAdmin();
		
		tf = new JTextArea(22,20);
		tf2 = new JTextArea(22,20);
		
		add = new JButton("추가");
		order = new JButton("주문");
		cancel = new JButton("취소");
		
		
	}
	
	void display() {
		setLayout(new BorderLayout());
		
		JTabbedPane pane = new JTabbedPane();
		
		pane.add("베스트메뉴", best);
		pane.add("빙수메뉴", bingsu);
		pane.add("디저트메뉴", desert);
		pane.add("음료메뉴", beverage);
		add(pane, BorderLayout.CENTER);
		
		// 텍스트필드
		/* JPanel p = new JPanel(new FlowLayout());
			p.setLayout(new BorderLayout());
			p.add(tf, BorderLayout.CENTER);

			p.add(tf2, BorderLayout.NORTH);
		
		// 주문/취소 버튼
		JPanel p2 = new JPanel(new GridLayout(1, 3));
			p2.add(add);
			p2.add(order);
			p2.add(cancel); */
		
		//텍스트 상
		JPanel p = new JPanel();
			p.setLayout(new BorderLayout());
			p.add(tf, BorderLayout.NORTH);
		JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout());
			p2.add(add);
			p2.add(cancel);
			
			p.add(p2, BorderLayout.SOUTH);
		
		//텍스트 하	
		JPanel p3 = new JPanel();
			p3.setLayout(new BorderLayout());
			p3.add(tf2, BorderLayout.NORTH);
			p3.add(order, BorderLayout.SOUTH);
		
		//텍스트 상,하	
		JPanel p4 = new JPanel();
		 	p4.setLayout(new BorderLayout());
		 	p4.add(p, BorderLayout.NORTH);
		 	p4.add(p3, BorderLayout.SOUTH);
		 
		 	
		add(p4, BorderLayout.EAST);
			
			


	
	// 주문/취소 버튼
		
		
		
		setSize(1200, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton)e.getSource();
		if (evt == add) {
		String msg = add.getText();
		JOptionPane.showMessageDialog(null, "추가하시겠습니까?");
		}else if (evt == cancel){
			String msg = add.getText();
			JOptionPane.showMessageDialog(null, "취소하시겠습니까?");
			tf.setText(null);
		}else if (evt == order) {
			int i = JOptionPane.showConfirmDialog(null, "주문하시겠습니까?");
			if(i == 0) {
				JOptionPane.showConfirmDialog(null, "주문 완료");
	
			}
			
		}
		
	}
	public void eventProc() {
		add.addActionListener(this);
		cancel.addActionListener(this);
		order.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		SulBing s = new SulBing();
		
		s.display();
		s.eventProc();
	}


}