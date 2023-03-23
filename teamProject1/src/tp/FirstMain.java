package tp;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FirstMain extends JPanel{
		private PanelChange pch;
		private JButton order1;
				private JButton order2;
		

		public FirstMain(PanelChange pch) {
			// TODO Auto-generated constructor stub
		this.pch = pch;
		setLayout(null);
		
		order1 = new JButton("매장 주문");
		order2 = new JButton("포장 주문");
		JLabel jlb = new JLabel();
		
		order1.setFont(new Font("매장 주문", Font.BOLD, 11));
		order1.setFont(jlb.getFont().deriveFont(25.0f));
		order1.setBounds(60, 490 ,150 ,90);
		order1.setVisible(true);
		add(order1);
		
		
		order2.setFont(new Font("매장 주문", Font.BOLD, 11));
		order2.setFont(jlb.getFont().deriveFont(25.0f));
		order2.setBounds(280, 490 ,150 ,90);
		order2.setVisible(true);
		add(order2);
		
		//위 버튼을 누르면 패널이 넘어가야함
		//따라서 이 클래스 내에서 기능 추가후 다른 클래스로 넘어가도록 하면 됨.
		//종료하지 않도록 작성할것.
		
		
		order1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//->jb1을 누르면 passPanel로 넘어가도록 코드 작성.
				
				pch.change("pp");
				//new passPanel();
				//f.setVisible(false);
			}
		});
		
		
		order2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//->jb1을 누르면 passPanel로 넘어가도록 코드 작성.
				
				pch.change("pp");
				//new passPanel();
				//f.setVisible(false);
				
			}
		});
		
		
	
		


		
		
		
		

		
		
		
	}
	

}
	







