package tp;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class Reset extends JPanel{
	
	

	public Reset() {
		PanelChange pch = new PanelChange();
		// TODO Auto-generated constructor stub
		Timer rt = new Timer();
		
		TimerTask tt = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				//fm으로 넘어가는 코드 작성.
				pch.change("fm");
				
			}
		
		
		};
	
		rt.schedule(tt, 30000);
	
	}
	
	
}
