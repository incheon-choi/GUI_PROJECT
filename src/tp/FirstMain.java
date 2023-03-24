package tp;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstMain extends JPanel {
	private PanelChange pch;
	private JButton order1;
	private JButton order2;

	public FirstMain(PanelChange pch) {
		// TODO Auto-generated constructor stub
		this.pch = pch;
		setLayout(null);

		order1 = new JButton("���� �ֹ�");
		order2 = new JButton("���� �ֹ�");
		JLabel jlb = new JLabel();

		order1.setFont(new Font("���� �ֹ�", Font.BOLD, 11));
		order1.setFont(jlb.getFont().deriveFont(25.0f));
		order1.setBounds(60, 490, 150, 90);
		order1.setVisible(true);
		add(order1);

		order2.setFont(new Font("���� �ֹ�", Font.BOLD, 11));
		order2.setFont(jlb.getFont().deriveFont(25.0f));
		order2.setBounds(280, 490, 150, 90);
		order2.setVisible(true);
		add(order2);

		// �� ��ư�� ������ �г��� �Ѿ����
		// ���� �� Ŭ���� ������ ��� �߰��� �ٸ� Ŭ������ �Ѿ���� �ϸ� ��.
		// �������� �ʵ��� �ۼ��Ұ�.

		order1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ->jb1�� ������ passPanel�� �Ѿ���� �ڵ� �ۼ�.

				pch.change("pp");
				// new passPanel();
				// f.setVisible(false);
			}
		});

		order2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ->jb1�� ������ passPanel�� �Ѿ���� �ڵ� �ۼ�.

				pch.change("bk");
				// new passPanel();
				// f.setVisible(false);

			}
		});

	}

}