package bk2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import bk.BasKetTest;
import shoping.Payment;
import tp.Main;
import tp.PanelChange;

public class Panel01 extends JPanel {
	private JButton Jbutton1;
	private JButton Jbutton2;
	private JButton Jbutton3;
	private JScrollPane jscrollPane1;
	private JScrollPane jscrollPane2;
	private JTextArea jTextArea;
	private PanelChange pch;

	public Panel01(PanelChange pch) {
		this.pch = pch;
		setLayout(null);

		Jbutton1 = new JButton("이전화면");
		Jbutton1.setBounds(20, 5, 100, 30);
		Jbutton1.setVisible(true);
		add(Jbutton1);

		Jbutton2 = new JButton("취소");
		Jbutton2.setBounds(20, 600, 100, 30);
		Jbutton2.setVisible(true);
		add(Jbutton2);

		Jbutton3 = new JButton("결제하기");
		Jbutton3.setBounds(360, 600, 100, 30);
		Jbutton3.setVisible(true);
		add(Jbutton3);

		jTextArea = new JTextArea();
		jscrollPane1 = new JScrollPane(jTextArea);
		jscrollPane1.setBounds(18, 40, 450, 450);
		add(jscrollPane1);

		jTextArea = new JTextArea();
		jscrollPane2 = new JScrollPane(jTextArea);
		jscrollPane2.setBounds(360, 500, 100, 50);
		add(jscrollPane2);

		// 메뉴화면 전환 함수
		Jbutton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pch.change("fm");

			}
		});

		// 초기화면 전환 함수
		Jbutton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pch.change("fm");

			}
		});

		// 결제 창함수
		Jbutton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random rnd = new Random();
				int ro = rnd.nextInt(3) + 1;
				if (ro == 2) {
					JOptionPane.showMessageDialog(null, " 잔액이 부족합니다. \n카드의 잔액을 확인해 주세요");
				} else {
					JOptionPane.showMessageDialog(null, "결제가 완료되었습니다. \n이용해주셔서 감사합니다.");
					// 초기화면 이동

					pch.change("fm");
				}
			}
		});// 결제

//		Jbutton3.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				bk.change("Payment");
//				
//				
//				
//				
//			}
//		});

	}

}
