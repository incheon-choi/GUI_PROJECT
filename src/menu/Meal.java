package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Meal extends JPanel {
	//mbtn = 식사버튼
	//jl1 = 식사이름
	//jl1_1 = 식사가격
	//mmpsp = 식사메뉴스크롤
	//mmp = 김밥메뉴패널

	//메뉴스크롤
	private JScrollPane mmpsp;

	//메뉴페널
	private JPanel mmp = new JPanel();

	//김치볶음밥버튼 생성
	private JButton mbtn1;
	private JLabel jl1;
	private JLabel jl1_1;

	//토마토달걀덮밥버튼 생성
	private JButton mbtn2;
	private JLabel jl2;
	private JLabel jl2_1;

	//오므라이스버튼 생성
	private JButton mbtn3;
	private JLabel jl3;
	private JLabel jl3_1;

	//제육덮밥버튼 생성
	private JButton mbtn4;
	private JLabel jl4;
	private JLabel jl4_1;

	//불고기덮밥버튼 생성
	private JButton mbtn5;
	private JLabel jl5;
	private JLabel jl5_1;

	//돌솥비빔밥버튼 생성
	private JButton mbtn6;
	private JLabel jl6;
	private JLabel jl6_1;

	//뚝배기불고기버튼 생성
	private JButton mbtn7;
	private JLabel jl7;
	private JLabel jl7_1;

	//해물순두부찌개버튼 생성
	private JButton mbtn8;
	private JLabel jl8;
	private JLabel jl8_1;

	//부대찌개버튼 생성
	private JButton mbtn9;
	private JLabel jl9;
	private JLabel jl9_1;

	//김밥버튼이미지
	ImageIcon icon1 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal1.PNG");
	ImageIcon icon2 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal2.PNG");
	ImageIcon icon3 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal3.PNG");
	ImageIcon icon4 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal4.PNG");
	ImageIcon icon5 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal5.PNG");
	ImageIcon icon6 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal6.PNG");
	ImageIcon icon7 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal7.PNG");
	ImageIcon icon8 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal8.PNG");
	ImageIcon icon9 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal9.PNG");

	public Meal() {
		//패널레이아웃
		setLayout(null);
		//Penel색 WHITE로 지정
		setBackground(Color.WHITE);

		//식사메뉴패널사이즈
		mmp.setLayout(null);
		mmp.setPreferredSize(new Dimension(0,500));

		//김치볶음밥버튼
		mbtn1 = new JButton(icon1);
		mbtn1.setBorderPainted(true);
		mbtn1.setBounds(35, 20, 100, 100);

		jl1 = new JLabel("김치볶음밥");
		jl1_1 = new JLabel("6000원");
		jl1.setBounds(56, 120, 100, 30);
		jl1_1.setBounds(67, 140, 100, 30);

		//토마토달걀덮밥버튼 
		mbtn2 = new JButton(icon2);
		mbtn2.setBorderPainted(true);
		mbtn2.setBounds(185, 20, 100, 100); 

		jl2 = new JLabel("토마토달걀덮밥");
		jl2_1 = new JLabel("7000원");
		jl2.setBounds(192, 120, 100, 30);
		jl2_1.setBounds(215, 140, 100, 30);

		//오므라이스버튼
		mbtn3 = new JButton(icon3);
		mbtn3.setBorderPainted(true);
		mbtn3.setBounds(335, 20, 100, 100);

		jl3 = new JLabel("오므라이스");
		jl3_1 = new JLabel("6000원");
		jl3.setBounds(355, 120, 100, 30);
		jl3_1.setBounds(364, 140, 100, 30);

		//제육덮밥버튼
		mbtn4 = new JButton(icon4);
		mbtn4.setBorderPainted(true);
		mbtn4.setBounds(35, 180, 100, 100);

		jl4 = new JLabel("제육덮밥");
		jl4_1 = new JLabel("6000원");
		jl4.setBounds(62, 280, 100, 30);
		jl4_1.setBounds(67, 300, 100, 30);

		//불고기덮밥버튼
		mbtn5 = new JButton(icon5);
		mbtn5.setBorderPainted(true);
		mbtn5.setBounds(185, 180, 100, 100);

		jl5 = new JLabel("불고기덮밥");
		jl5_1 = new JLabel("6000원");
		jl5.setBounds(205, 280, 100, 30);
		jl5_1.setBounds(217, 300, 100, 30);

		//돌솥비빔밥버튼
		mbtn6 = new JButton(icon6);
		mbtn6.setBorderPainted(true);
		mbtn6.setBounds(335, 180, 100, 100);

		jl6 = new JLabel("돌솥비빔밥");
		jl6_1 = new JLabel("6500원");
		jl6.setBounds(357, 280, 100, 30);
		jl6_1.setBounds(366, 300, 100, 30);

		//뚝배기불고기버튼
		mbtn7 = new JButton(icon7);
		mbtn7.setBorderPainted(true);
		mbtn7.setBounds(35, 340, 100, 100);

		jl7 = new JLabel("뚝배기불고기");
		jl7_1 = new JLabel("6500원");
		jl7.setBounds(50, 440, 100, 30);
		jl7_1.setBounds(67, 460, 100, 30);

		//해물순두부찌개버튼
		mbtn8 = new JButton(icon8);
		mbtn8.setBorderPainted(true);
		mbtn8.setBounds(185, 340, 100, 100);

		jl8 = new JLabel("해물순두부찌개");
		jl8_1 = new JLabel("7000원");
		jl8.setBounds(193, 440, 100, 30);
		jl8_1.setBounds(217, 460, 100, 30);

		//부대찌개버튼
		mbtn9 = new JButton(icon9);
		mbtn9.setBorderPainted(true);
		mbtn9.setBounds(335, 340, 100, 100);

		jl9 = new JLabel("부대찌개");
		jl9_1 = new JLabel("7000원");
		jl9.setBounds(363, 440, 100, 30);
		jl9_1.setBounds(367, 460, 100, 30);

		//식사메뉴패널에 버튼추가
		mmp.add(mbtn1);
		mmp.add(jl1);
		mmp.add(jl1_1);

		mmp.add(mbtn2);
		mmp.add(jl2);
		mmp.add(jl2_1);

		mmp.add(mbtn3);
		mmp.add(jl3);
		mmp.add(jl3_1);

		mmp.add(mbtn4);
		mmp.add(jl4);
		mmp.add(jl4_1);

		mmp.add(mbtn5);
		mmp.add(jl5);
		mmp.add(jl5_1); 

		mmp.add(mbtn6);
		mmp.add(jl6);
		mmp.add(jl6_1);

		mmp.add(mbtn7);
		mmp.add(jl7);
		mmp.add(jl7_1);

		mmp.add(mbtn8);
		mmp.add(jl8);
		mmp.add(jl8_1);

		mmp.add(mbtn9);
		mmp.add(jl9);
		mmp.add(jl9_1);

		//스크롤에 김밥메뉴패널 추가
		mmpsp = new JScrollPane(mmp);
		//스크롤의 사이즈를 지정
		mmpsp.setBounds(0, 100, 485, 350);

		//김밥전체패널에 스크롤 추가
		add(mmpsp);
	}
}