package basket;

import javax.swing.JFrame;
import javax.swing.JPanel;

import basketpanel.JPanel01;
import basketpanel.JPanel02;
import basketpanel.JPanel03;


public class BasKetPanel {
	public static void main(String[] args) {
		BasKetFrame bkf = new BasKetFrame();
		
		
		
		
		bkf.setTitle("frame Test");
		bkf.jpanel01 = new JPanel01(bkf);
		bkf.jpanel02 = new JPanel02(bkf);
		bkf.jpanel03 = new JPanel03(bkf);
		
//		bkf.add(bkf.jpanel01);
		bkf.add(bkf.jpanel02);
//		bkf.add(bkf.jpanel03);
		
		bkf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bkf.setBounds(100, 100, 500, 700);
		bkf.setVisible(true);
		
	}


}
