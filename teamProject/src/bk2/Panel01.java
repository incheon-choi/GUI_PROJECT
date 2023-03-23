package bk2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import bk.BasKetTest;

public class Panel01 extends JPanel{
	private JButton Jbutton1;
	private JButton Jbutton2;
	private JButton Jbutton3;
	private JScrollPane jscrollPane1;
	private JScrollPane jscrollPane2;
	private JTextArea jTextArea;
	private BasKetTest bk;
	
	public Panel01(BasKetTest bk) {
		this.bk = bk;
		setLayout(null);
		
		Jbutton1 = new JButton("이전화면");
		Jbutton1.setBounds(20, 5, 100, 30);
		add(Jbutton1);
		
		Jbutton2 = new JButton("취소");
		Jbutton2.setBounds(20, 600, 100, 30);
		add(Jbutton2);
		
		Jbutton3 = new JButton("결제하기");
		Jbutton3.setBounds(360, 600, 100, 30);
		add(Jbutton3);
		
		jTextArea = new JTextArea();
		jscrollPane1 = new JScrollPane(jTextArea);
		jscrollPane1.setBounds(18, 40, 450, 450);
		add(jscrollPane1);
		
		jTextArea = new JTextArea();
		jscrollPane2 = new JScrollPane(jTextArea);
		jscrollPane2.setBounds(360, 500, 100, 50);
		add(jscrollPane2);
		
		
		
		Jbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bk.change(null);
				
			}
		});
		
		Jbutton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bk.change("FirstMain");
				
			}
		});
		
		Jbutton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bk.change(null);
				
			}
		});
		
		
	}
	
	
}
