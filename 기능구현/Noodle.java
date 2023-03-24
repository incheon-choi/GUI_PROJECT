package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Noodle extends JPanel {
	
	ImageIcon img1 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\noodle1.PNG");
	ImageIcon img2 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\noodle2.PNG");
	ImageIcon img3 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\noodle3.PNG");
	ImageIcon img4 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\noodle4.PNG");
	ImageIcon img5 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\noodle5.PNG");
	ImageIcon img6 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\noodle6.PNG");
	//국수
	private JButton btn1;
	private JLabel jl1;
	private JLabel jl1_1;
	//냉모밀
	private JButton btn2;
	private JLabel jl2;
	private JLabel jl2_1;
	//콩국수
	private JButton btn3;
	private JLabel jl3;
	private JLabel jl3_1;
	//우동
	private JButton btn4;
	private JLabel jl4;
	private JLabel jl4_1;
	//냉면
	private JButton btn5;
	private JLabel jl5;
	private JLabel jl5_1;
	//비빔냉면
	private JButton btn6;
	private JLabel jl6;
	private JLabel jl6_1;
	
	private JScrollPane scroll;
	private JPanel gmp = new JPanel();
	
	//이전,결제버튼 생성
	private JButton before;
	private JButton pay;
	
	public Noodle(MenuTest mt) {
		
		gmp.setLayout(null);
		gmp.setPreferredSize(new Dimension(0,370));
//		gmp.setBackground(Color.blue);
		setLayout(null);

		btn1 = new JButton(img1);
		btn1.setBounds(35, 20, 100, 100);
		jl1 = new JLabel("국수");
		jl1.setBounds(70, 120, 100, 30);
		jl1_1 = new JLabel("5000원");
		jl1_1.setBounds(65, 140, 100, 30);
		
		
		btn2 = new JButton(img2);
		btn2.setBounds(185, 20, 100, 100);
		jl2 = new JLabel("냉모밀");
		jl2.setBounds(217, 120, 100, 30);
		jl2_1 = new JLabel("7000원");
		jl2_1.setBounds(215, 140, 100, 30);
		
		
		btn3 = new JButton(img3);
		btn3.setBounds(335, 20, 100, 100);
		jl3 = new JLabel("콩국수");
		jl3.setBounds(367, 120, 100, 30);
		jl3_1 = new JLabel("7000원");
		jl3_1.setBounds(365, 140, 100, 30);
		
		
		btn4 = new JButton(img4);
		btn4.setBounds(35, 180, 100, 100);
		jl4 = new JLabel("우동");
		jl4.setBounds(70, 280, 100, 30);
		jl4_1 = new JLabel("5000원");
		jl4_1.setBounds(65, 300, 100, 30);
		
		
		btn5 = new JButton(img5);
		btn5.setBounds(185, 180, 100, 100);
		jl5 = new JLabel("냉면");
		jl5.setBounds(220, 280, 100, 30);
		jl5_1 = new JLabel("6000원");
		jl5_1.setBounds(215, 300, 100, 30);
		
		
		btn6 = new JButton(img6);
		btn6.setBounds(335, 180, 100, 100);
		jl6 = new JLabel("비빔냉면");
		jl6.setBounds(360, 280, 100, 30);
		jl6_1 = new JLabel("6000원");
		jl6_1.setBounds(365, 300, 100, 30);
		
		
		//버튼
		gmp.add(btn1);
		gmp.add(btn2);
		gmp.add(btn3);
		gmp.add(btn4);
		gmp.add(btn5);
		gmp.add(btn6);
		//상품이름
		gmp.add(jl1);
		gmp.add(jl2);
		gmp.add(jl3);
		gmp.add(jl4);
		gmp.add(jl5);
		gmp.add(jl6);
		//가격
		gmp.add(jl1_1);
		gmp.add(jl2_1);
		gmp.add(jl3_1);
		gmp.add(jl4_1);
		gmp.add(jl5_1);
		gmp.add(jl6_1);
		
		scroll = new JScrollPane(gmp);
		
		scroll.setBounds(0, 100, 485, 350);
		add(scroll);
		
		//이전,결제버튼 위치,크기 지정
		before = new JButton("이   전");
		pay = new JButton("결   제");
		before.setBounds(100, 610, 100, 40);
		pay.setBounds(300, 610, 100, 40);
		
		//면류전체패널에 이전,결제버튼 추가
		add(before);
		add(pay);
		
	}
}
