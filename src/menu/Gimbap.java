package menu;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Gimbap extends JPanel {
	//gbtn = 김밥버튼
	//jl1 = 김밥이름
	//jl1_1 = 김밥가격
	//gmpsp = 김밥메뉴스크롤
	//gmp = 김밥메뉴패널
	
	//메뉴패널스크롤 생성
	private JScrollPane gmpsp;
	 
	//메뉴패널 생성
	private JPanel gmp = new JPanel();
	
	//야채김밥버튼 생성
	private JButton gbtn1;
	private JLabel jl1;
	private JLabel jl1_1;
	
	//참치김밥버튼 생성
	private JButton gbtn2;
	private JLabel jl2;
	private JLabel jl2_1;
	
	//치즈김밥버튼 생성
	private JButton gbtn3;
	private JLabel jl3;
	private JLabel jl3_1;
	
	//김치김밥버튼 생성
	private JButton gbtn4;
	private JLabel jl4;
	private JLabel jl4_1;
	
	//불고기김밥버튼 생성
	private JButton gbtn5;
	private JLabel jl5;
	private JLabel jl5_1;
	
	//왕새우튀김김밥버튼 생성
	private JButton gbtn6;
	private JLabel jl6;
	private JLabel jl6_1;
	
	//김밥버튼이미지
	ImageIcon icon1 = new ImageIcon("D:\\web_cdy\\java_project\\java\\work\\Java_Project\\src\\image\\gimbap1.PNG");
	ImageIcon icon2 = new ImageIcon("D:\\web_cdy\\java_project\\java\\work\\Java_Project\\src\\image\\gimbap2.PNG");
	ImageIcon icon3 = new ImageIcon("D:\\web_cdy\\java_project\\java\\work\\Java_Project\\src\\image\\gimbap3.PNG");
	ImageIcon icon4 = new ImageIcon("D:\\web_cdy\\java_project\\java\\work\\Java_Project\\src\\image\\gimbap4.PNG");
	ImageIcon icon5 = new ImageIcon("D:\\web_cdy\\java_project\\java\\work\\Java_Project\\src\\image\\gimbap5.PNG");
	ImageIcon icon6 = new ImageIcon("D:\\web_cdy\\java_project\\java\\work\\Java_Project\\src\\image\\gimbap6.PNG");
	
		
	public Gimbap() {
		
		//패널레이아웃
		setLayout(null);
		//Penel색 WHITE로 지정
		//setBackground(Color.black);
		
		
		//김밥메뉴패널사이즈
		//gmp.setLayout(null)로 했기 때문에 패널에 스크롤 적용이 안되는 현상이 발생한다.
		//그래서 gmp의 사이즈를 gmp.setPreferredSize(new Dimension())를 사용해서 지정해야 스크롤이 화면에 보인다.
		gmp.setLayout(null);
		gmp.setPreferredSize(new Dimension(0,370));
		
		//야채김밥버튼
		gbtn1 = new JButton(icon1);
		gbtn1.setBorderPainted(true);
		gbtn1.setBounds(35, 20, 100, 100);
		
		jl1 = new JLabel("야채김밥");
		jl1_1 = new JLabel("2000원");
		jl1.setBounds(62, 120, 100, 30);
		jl1_1.setBounds(67, 140, 100, 30);
		
		//참치김밥버튼 
		gbtn2 = new JButton(icon2);
		gbtn2.setBorderPainted(true);
		gbtn2.setBounds(185, 20, 100, 100); 
		
		jl2 = new JLabel("참치김밥");
		jl2_1 = new JLabel("3000원");
		jl2.setBounds(213, 120, 100, 30);
		jl2_1.setBounds(217, 140, 100, 30);
		
		//치즈김밥버튼
		gbtn3 = new JButton(icon3);
		gbtn3.setBorderPainted(true);
		gbtn3.setBounds(335, 20, 100, 100);
		
		jl3 = new JLabel("치즈김밥");
		jl3_1 = new JLabel("3000원");
		jl3.setBounds(360, 120, 100, 30);
		jl3_1.setBounds(364, 140, 100, 30);
		
		//김치김밥버튼
		gbtn4 = new JButton(icon4);
		gbtn4.setBorderPainted(true);
		gbtn4.setBounds(35, 180, 100, 100);
		
		jl4 = new JLabel("김치김밥");
		jl4_1 = new JLabel("3000원");
		jl4.setBounds(62, 280, 100, 30);
		jl4_1.setBounds(66, 300, 100, 30);
		
		//불고기김밥버튼
		gbtn5 = new JButton(icon5);
		gbtn5.setBorderPainted(true);
		gbtn5.setBounds(185, 180, 100, 100);
		
		jl5 = new JLabel("불고기김밥");
		jl5_1 = new JLabel("4000원");
		jl5.setBounds(207, 280, 100, 30);
		jl5_1.setBounds(217, 300, 100, 30);
		
		//왕새우튀김김밥버튼
		gbtn6 = new JButton(icon6);
		gbtn6.setBorderPainted(true);
		gbtn6.setBounds(335, 180, 100, 100);
		
		jl6 = new JLabel("왕새우튀김김밥");
		jl6_1 = new JLabel("5000원");
		jl6.setBounds(343, 280, 100, 30);
		jl6_1.setBounds(363, 300, 100, 30);
		
		//김밥메뉴패널에 버튼추가
		gmp.add(gbtn1);
		gmp.add(jl1);
		gmp.add(jl1_1);
		
		gmp.add(gbtn2);
		gmp.add(jl2);
		gmp.add(jl2_1);
		
		gmp.add(gbtn3);
		gmp.add(jl3);
		gmp.add(jl3_1);
		
		gmp.add(gbtn4);
		gmp.add(jl4);
		gmp.add(jl4_1);
		
		gmp.add(gbtn5);
		gmp.add(jl5);
		gmp.add(jl5_1); 
		
		gmp.add(gbtn6);
		gmp.add(jl6);
		gmp.add(jl6_1);
		
		//스크롤에 김밥메뉴패널 추가
		gmpsp = new JScrollPane(gmp);
		//스크롤의 사이즈를 지정
		gmpsp.setBounds(0, 100, 485, 350);
		
		
		//김밥전체패널에 스크롤 추가
		add(gmpsp);
	}	
}
