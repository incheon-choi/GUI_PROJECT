package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import menu.MenuTest;

public class FirstMain extends JPanel {

	private JButton order1;
	private JButton order2;
	private MenuTest mt;
	
	public FirstMain(MenuTest mt) {
		this.mt = mt;
		
		setLayout(null);
		setBounds(0, 0, 500, 700);
		
		order1 = new JButton("매장 주문");
		order2 = new JButton("포장 주문");
		
		order1.setBounds(60, 490 ,150 ,90);
		order2.setBounds(280, 490 ,150 ,90);
		
		add(order1);
		add(order2);
		
		//기능구현
		order1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mt.change("here");
				
			}
		});
		
		
		order2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				mt.change("takeout");
			}
		});
	}
	
}
