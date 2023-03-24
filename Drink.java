package menu;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Drink extends JPanel{
	ImageIcon img1 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\drink1.PNG");
	ImageIcon img2 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\drink2.PNG");
	ImageIcon img3 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\drink3.PNG");
	ImageIcon img4 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\drink4.PNG");
	ImageIcon img5 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\drink5.PNG");
	ImageIcon img6 = new ImageIcon("D:\\JAVA19_RBW\\eclipse-workspace\\TeamProject\\TeamProject\\src\\image\\drink6.PNG");
	
		//코카콜라
		private JButton btn1;
		private JLabel jl1;
		private JLabel jl1_1;
		//코카콜라제로
		private JButton btn2;
		private JLabel jl2;
		private JLabel jl2_1;
		//스프라이트
		private JButton btn3;
		private JLabel jl3;
		private JLabel jl3_1;
		//환타(오렌지)
		private JButton btn4;
		private JLabel jl4;
		private JLabel jl4_1;
		//환타(포도)
		private JButton btn5;
		private JLabel jl5;
		private JLabel jl5_1;
		//닥터페퍼
		private JButton btn6;
		private JLabel jl6;
		private JLabel jl6_1;
	
	private JScrollPane scroll;
	private JPanel gmp = new JPanel();
	public Drink() {
		gmp.setLayout(null);
		gmp.setPreferredSize(new Dimension(0,500));
		setLayout(null);

		btn1 = new JButton(img1);
		btn1.setBounds(35, 20, 100, 100);
		jl1 = new JLabel("코카콜라");
		jl1.setBounds(60, 120, 100, 30);
		jl1_1 = new JLabel("1500원");
		jl1_1.setBounds(65, 140, 100, 30);
		
		
		btn2 = new JButton(img2);
		btn2.setBounds(185, 20, 100, 100);
		jl2 = new JLabel("코카콜라제로");
		jl2.setBounds(200, 120, 100, 30);
		jl2_1 = new JLabel("1500원");
		jl2_1.setBounds(215, 140, 100, 30);
	
		
		btn3 = new JButton(img3);
		btn3.setBounds(335, 20, 100, 100);
		jl3 = new JLabel("스프라이트");
		jl3.setBounds(355, 120, 100, 30);
		jl3_1 = new JLabel("1500원");
		jl3_1.setBounds(365, 140, 100, 30);
		
		
		btn4 = new JButton(img4);
		btn4.setBounds(35, 180, 100, 100);
		jl4 = new JLabel("환타(오렌지)");
		jl4.setBounds(55, 280, 280, 30);
		jl4_1 = new JLabel("1500원");
		jl4_1.setBounds(65, 300, 100, 30);
		
		
		btn5 = new JButton(img5);
		btn5.setBounds(185, 180, 100, 100);
		jl5 = new JLabel("환타(포도)");
		jl5.setBounds(205, 280, 100, 30);
		jl5_1 = new JLabel("1500원");
		jl5_1.setBounds(215, 300, 100, 30);
		
		
		btn6 = new JButton(img6);
		btn6.setBounds(335, 180, 100, 100);
		jl6 = new JLabel("닥터페퍼");
		jl6.setBounds(357, 280, 100, 30);
		jl6_1 = new JLabel("1500");
		jl6_1.setBounds(365, 300, 100, 30);
	
		scroll = new JScrollPane(gmp);
		
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
		
		
		
		scroll.setBounds(0, 60, 485, 300);
		add(scroll);
	}
}
