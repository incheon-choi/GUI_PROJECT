package basket;

import javax.swing.JFrame;
import javax.swing.JPanel;

import basketpanel.JPanel01;
import basketpanel.JPanel02;
import basketpanel.JPanel03;

public class BasKetFrame extends JFrame {
	public JPanel01 jpanel01 = null;
	public JPanel02 jpanel02 = null;
	public JPanel03 jpanel03 = null;
	
	public void change(String panelName) {
		if(panelName.equals("panel01")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel01);
			revalidate();
			repaint();
		}else{
			getContentPane().removeAll();
			getContentPane().add(jpanel02);
			getContentPane().add(jpanel03);
			revalidate();
			repaint();
//		}if{
//			getContentPane().removeAll();
//			getContentPane().add(jpanel03);
//			revalidate();
//			repaint();
		}
	}
//		 (panelName.contentEquals("panel02")
        

}
