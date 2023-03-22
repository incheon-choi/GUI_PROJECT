package basketpanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


import basket.BasKetFrame;
import basket.BasKetPanel;

public class JPanel01 extends JPanel{
	private JButton Jbutton1;
	
	private BasKetFrame bkf;
	public JPanel01(BasKetFrame bkf) {
		this.bkf = bkf;
		Jbutton1 = new JButton("이전 화면");
		Jbutton1.setBounds(1, 5, 20, 20);
		add(Jbutton1);
		
		Jbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bkf.change("MENU");
				
			}
		});
	}
	
}
