package tp;

import javax.swing.JFrame;

public class PanelChange extends JFrame{
	
	public FirstMain fm = null;
	public PassPanel pp = null;
	
	public void change(String panelName) {
		if(panelName.equals("fm")) {
			getContentPane().removeAll();
			getContentPane().add(fm);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(pp);
			revalidate();
			repaint();
		}
		
	}

}
