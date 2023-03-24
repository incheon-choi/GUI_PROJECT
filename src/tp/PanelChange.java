package tp;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bk.BasKetTest;
import bk.PanelSwitch;
import bk2.Panel01;

public class PanelChange extends JFrame {

	public FirstMain fm = null;
	public Panel01 bk = null;

	public void change(String panelName) {
		if (panelName.equals("fm")) {
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
