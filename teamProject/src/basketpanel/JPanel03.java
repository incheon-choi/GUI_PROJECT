package basketpanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import basket.BasKetFrame;
import basket.BasKetPanel;

public class JPanel03 extends JPanel{
	private JButton Jbutton1;
	private BasKetFrame bkf;
	
	public JPanel03(BasKetFrame bkf) {
		this.bkf = bkf;
		setLayout(null);
		
		Jbutton1 = new JButton("∞·¡¶");
		Jbutton1.setBounds(70, 100, 50, 50);
		add(Jbutton1);
		
		Jbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bkf.change("cash");
				
			}
		});
	}

}
