package tp;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bk.BasKetTest;
import bk.PanelSwitch;

public class PanelChange extends JFrame{
	
	public FirstMain fm = null;
	public JPanel bk = null;
	
	public void change(String panelName) {
		if(panelName.equals("fm")) {
			getContentPane().removeAll();
			getContentPane().add(fm);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(bk);
			revalidate();
			repaint();
		}
		
	}

}
