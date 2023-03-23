package bk;

import javax.swing.JFrame;

import bk2.Panel01;

public class BasKetTest extends JFrame {
	public Panel01 panel01 = null;
	public Panel01 Panel01;
	
	public void change(String panelName) {
		if(panelName.equals("panel01")) {
			getContentPane().removeAll();
			getContentPane().add(panel01);
			revalidate();
			repaint();
		}
		
		
		
	}
}
