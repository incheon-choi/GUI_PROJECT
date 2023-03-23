package tp;

import java.awt.Font;

import tp.FirstMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class PassPanel extends JPanel {

	private PanelChange pch;

	public PassPanel(PanelChange pch) {

		// TODO Auto-generated constructor stub

		this.pch = pch;

		setLayout(null);

		JButton cancle = new JButton("취소 하기");
		JLabel jlb = new JLabel();

		cancle.setFont(new Font("취소 하기", Font.BOLD, 11));
		cancle.setFont(jlb.getFont().deriveFont(25.0f));
		cancle.setBounds(10, 10, 150, 50);
		cancle.setVisible(true);

		cancle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				pch.change("fm");
				// new FirstMain();
				// setVisible(false);

			}
		});

		add(cancle);

		setBounds(150, 150, 500, 700);

		setVisible(true);

	}
}
