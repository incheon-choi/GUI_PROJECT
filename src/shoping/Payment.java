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

		JButton btn_pm = new JButton("����");
		JButton btn_cc = new JButton("���");

		add(pl);

		pl.add(btn_pm);
		pl.add(btn_cc);

		pl.setLayout(null);
		btn_pm.setBounds(320, 550, 100, 50); // ������ư ��ġ
		btn_cc.setBounds(80, 550, 100, 50); // ��ҹ�ư ��ġ
		setBounds(300, 300, 500, 700); // ������ ũ��
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// ȭ����ȯ �Լ�

		// �ּҹ�ư �̺�Ʈ(�ʱ�ȭ�� �̵�)
		btn_cc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pl.setVisible(false);
				FirstMain f = new FirstMain(null);

			}

		});// ���

		// ������ư �̺�Ʈ
		btn_pm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random rnd = new Random();
				int ro = rnd.nextInt(3) + 1;
				if (ro == 2) {
					JOptionPane.showMessageDialog(null, " �ܾ��� �����մϴ�. \nī���� �ܾ��� Ȯ���� �ּ���");
				} else {
					JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�. \n�̿����ּż� �����մϴ�.");
					// �ʱ�ȭ�� �̵�
					pl.setVisible(false);
				}
			}
		});// ����

	}

	public static void main(String[] args) {
		Payment pm = new Payment();
		pm.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}