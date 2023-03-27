package menu;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Noodle extends JPanel {
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int count5;
	private int count6;
	private int count= 0;
	private JButton reset;
	private JButton before;
	private JButton pay;
	private MenuTest mt;
	
public Noodle(MenuTest mt) {
	this.mt = mt;
	
	//패널의 총 위치,크기
	setBounds(0,0,500,700);
	
	//패널의 레이아웃
	setLayout(null);
	
	//패널의 배경색
	setBackground(new Color(255,255,215));
	
	
	//패널 배열 설정 부분
	String[] menu = {"국수","냉모밀","콩국수","우동","냉면","비빔냉면"};
	int[] price = {5000,7000,7000,5000,6000,6000};
	JButton[] bt = new JButton[menu.length];
	JLabel[] namel = new JLabel[menu.length];
	JLabel[] pricel = new JLabel[menu.length];
	ImageIcon[] icon = new ImageIcon[menu.length];
	
	for(int i=0; i<menu.length; i++) {
		
		//면류 버튼
		bt[i] = new JButton(menu[i]);
		if(i<3) {
			bt[i].setBounds(37+i*150, 110, 100, 100);
		}else {
			bt[i].setBounds(37+(i-3)*150, 290, 100, 100);
		}
		//면류버튼에 이미지 삽입
		//icon[i] = new ImageIcon(i+"")
		//bt[i].setIcon(icon[i]);
		
		//이름
		namel[i] = new JLabel(menu[i]);
		if(i==0||i==3||i==4) {
			namel[i].setBounds(bt[i].getX()+37, bt[i].getY()+100, 100, 30);
		} else if(i==1||i==2){
			namel[i].setBounds(bt[i].getX()+32, bt[i].getY()+100, 100, 30);
		} else if(i == 5){
			namel[i].setBounds(bt[i].getX()+27, bt[i].getY()+100, 100, 30);
		} 
		
		//가격
		pricel[i] = new JLabel(price[i] + "원");
		if(i<3) {
			pricel[i].setBounds(bt[i].getX()+30, bt[i].getY()+120, 100, 30);
		}else {
			pricel[i].setBounds(bt[i].getX()+30, bt[i].getY()+120, 100, 30);
		}
		
		//패널에 버튼 추가
		add(bt[i]);
		add(namel[i]);
		add(pricel[i]);	
		
	}//for문	
	
	//메뉴주문리스트
	JTextArea ta = new JTextArea(20,20);
	ta.setBounds(0, 450, 500, 150);
	ta.setText("   상품명     수량     합계\n");
	ta.setBackground(Color.WHITE);
	ta.setEditable(false);
	
	//버튼 누르면 상품명, 단가, 수량 증가
	for(int i=0; i<menu.length; i++) {
		int j = i;
		
		count1=0;
		count2=0;
		count3=0;
		count4=0;
		count5=0;
		count6=0;
		bt[i].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str;
				if(menu[j].equals("국수")) {
					count1 += 1;
					ta.append("  "+menu[j]+"    "+count1+"    "+price[j]*count1+"\n");
				} else if(menu[j].equals("냉모밀")) {
					count2 += 1; 
					ta.append("  "+menu[j]+"    "+count2+"    "+price[j]*count2+"\n");
				} else if(menu[j].equals("콩국수")) {
					count3 += 1;
					ta.append("  "+menu[j]+"    "+count3+"    "+price[j]*count3+"\n");
				} else if(menu[j].equals("우동")) {
					count4 += 1;
					ta.append("  "+menu[j]+"    "+count4+"    "+price[j]*count4+"\n");
				} else if(menu[j].equals("냉면")) {
					count5 += 1;
					ta.append("  "+menu[j]+"    "+count5+"    "+price[j]*count5+"\n");
				} else if(menu[j].equals("비빔냉면")) {
					count6 += 1;
					ta.append("  "+menu[j]+"    "+count6+"    "+price[j]*count6+"\n");
				}
			}
		});
	}
	
	//패널에 메뉴주문리스트 추가
	add(ta);
	
	//이전,결제,초기화버튼 위치,크기 지정
	before = new JButton("이   전");
	pay = new JButton("확   인");
	reset = new JButton("초 기 화");
	reset.setBounds(202, 610, 95, 40);
	before.setBounds(100, 610, 100, 40);
	pay.setBounds(300, 610, 100, 40);
	
	//패널에 이전,결제,초기화버튼 추가
	add(before);
	add(pay);
	add(reset);
	
	//이전버튼 누르면 맨 처음 프레임으로 돌아가는 기능
	before.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			mt.change("before");
		}
	});
	//결제버튼 누르면 결제창으로 넘어가는 기능
	pay.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			mt.change("pay");
		}
	});
	
	//초기화버튼 누르면 주문리스트 리셋
	reset.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ta.setText("   상품명     수량     합계\n");
			
		}
	});
		
	}
	
}
