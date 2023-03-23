package shoping;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tp.FirstMain;
import bk.PanelSwitch;

public class Payment extends JFrame {

	public Payment() {

		JPanel pl = new JPanel();

		JButton btn_pm = new JButton("결제");
		JButton btn_cc = new JButton("취소");

		add(pl);

		pl.add(btn_pm);
		pl.add(btn_cc);

		pl.setLayout(null);
		btn_pm.setBounds(320, 550, 100, 50); // 결제버튼 위치
		btn_cc.setBounds(80, 550, 100, 50); // 취소버튼 위치
		setBounds(300, 300, 500, 700); // 프레임 크기
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 화면전환 함수

		// 최소버튼 이벤트(초기화면 이동)
		btn_cc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pl.setVisible(false);
				FirstMain f = new FirstMain(null);

			}

		});// 취소

		// 결제버튼 이벤트
		btn_pm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random rnd = new Random();
				int ro = rnd.nextInt(3) + 1;
				if (ro == 2) {
					JOptionPane.showMessageDialog(null, " 잔액이 부족합니다. \n카드의 잔액을 확인해 주세요");
				} else {
					JOptionPane.showMessageDialog(null, "결제가 완료되었습니다. \n이용해주셔서 감사합니다.");
					// 초기화면 이동
					pl.setVisible(false);
				}
			}
		});// 결제

	}

	public static void main(String[] args) {
		Payment pm = new Payment();
		pm.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}