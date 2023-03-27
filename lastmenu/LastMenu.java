package lastmenu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LastMenu {
	
	int count = 0;
    String show = "";

	public LastMenu() {
		
		// 프레임 설정
		JFrame frame = new JFrame("분식집");
		frame.setBounds(0, 0, 625, 1000);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		// 메뉴 패널
		JPanel jPanel1 = new JPanel();
		jPanel1.setBackground(new Color(255, 255, 215));
		jPanel1.setLayout(null);
		jPanel1.setBounds(0,0,625,600);
		
		// 김밥 배열 설정
		String[] menu = {"야채김밥","참치김밥","치즈김밥","김치김밥","우동","국수","냉모밀","냉면","오므라이스","제육덮밥","부대찌개","순두부찌개"};
		int[] price = {2000,3000,3000,3000,5000,5000,7000,6000,6000,6000,7000,7000};
		JButton bt[] = new JButton[menu.length];
        JTextField suja[] = new JTextField[menu.length];
        JButton minus[] = new JButton[menu.length];
        JButton plus[] = new JButton[menu.length];
        JButton ok[] = new JButton[menu.length];
        JLabel l[] = new JLabel[menu.length];
        ImageIcon icon[] = new ImageIcon[menu.length];
		
     // 버튼 설정 부분
        for (int i = 0; i < menu.length; i++) {
 
            // 메뉴 버튼
            bt[i] = new JButton(menu[i]);
            if (i < 4) {
                bt[i].setBounds(25 + i * 150, 10, 100, 100);
            } else if(i >= 4 && i < 8){
                bt[i].setBounds(25 + (i - 4) * 150, 200, 100, 100);
            } else if(i >= 8 && i < 13){
                bt[i].setBounds(25 + (i - 8) * 150, 400, 100, 100);
            }
            icon[i] = new ImageIcon("/Users/dayeon/Desktop/"+i + ".png");
            bt[i].setIcon(icon[i]);
 
            // 숫자 txt 버튼
            suja[i] = new JTextField("0");
            suja[i].setBackground(Color.white);
            suja[i].setEditable(false);
            suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 130, 40, 20);
 
            // "-" 버튼
            minus[i] = new JButton("-");
            minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
            minus[i].setEnabled(false);
 
            // "+" 버튼
            plus[i] = new JButton("+");
            plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
            plus[i].setEnabled(false);
 
            // 가격
            l[i] = new JLabel(price[i] + "원");
            l[i].setBounds(bt[i].getX() + 20, suja[i].getY() - 25, 100, 20);
 
            // 확인 버튼
            ok[i] = new JButton("확인");
            ok[i].setBounds(bt[i].getX(), suja[i].getY() + 30, 100, 20);
            ok[i].setEnabled(false);
 
            jPanel1.add(bt[i]);
            jPanel1.add(suja[i]);
            jPanel1.add(minus[i]);
            jPanel1.add(plus[i]);
            jPanel1.add(l[i]);
            jPanel1.add(ok[i]);
        }
        
        // 중앙
        JTextArea ta = new JTextArea();
        ta.setText("    상품명         단가         수량         합계\n\n");
        ta.setBackground(Color.white);
        ta.setEditable(false);
        //ta.setBounds(0, 600, 625, 140);
        
        JScrollPane sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setBounds(0, 600, 625, 140);
        
        // 남쪽
        JPanel jPanel2 = new JPanel();
        jPanel2.setBounds(0, 740, 625, 40);
        jPanel2.setBackground(new Color(255, 255, 215));
 
        JButton bt1 = new JButton("이전");
        JButton bt2 = new JButton("초기화");
        JButton bt3 = new JButton("주문");
        jPanel2.add(bt1);
        jPanel2.add(bt2);
        jPanel2.add(bt3);
        
         //주문버튼
        bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 
			}
		});
        
        bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menu.length; i++) {
                    bt[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    suja[i].setText("0");
                    ta.setText("   상품명        단가        수량        합계\n\n");
 
                }
				
			}
		});
        
        bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다. \n이용해주셔서 감사합니다.");
	                for (int i = 0; i < menu.length; i++) {
	                    bt[i].setEnabled(true);
	                    minus[i].setEnabled(false);
	                    plus[i].setEnabled(false);
	                    suja[i].setText("0");
	                    ta.setText("   상품명        단가        수량        합계\n\n");
	 
	                }
			}
		});
        
        // 컴포넌트
        frame.add(jPanel1);
        frame.add(sp);
        frame.add(jPanel2);
        frame.setVisible(true);
        
        //이벤트
        for (int i = 0; i < menu.length; i++) {
            int j = i;
 
            // 햄버그 버튼 이벤트
            bt[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    minus[j].setEnabled(true);
                    plus[j].setEnabled(true);
                    bt[j].setEnabled(false);
                    ok[j].setEnabled(true);
 
                    count = 0;
                }
            });
 
            // "-" 버튼 이벤트
            minus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count > 0) {
                        count = count - 1;
                        suja[j].setText(count + "");
                        ok[j].setEnabled(true);
                    } else {
                        minus[j].setEnabled(false);
                    }
                }
            });
            
            // "+" 버튼 이벤트
            plus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    count = count + 1;
                    suja[j].setText(count + "");
                    ok[j].setEnabled(true);
                    if (count > 0) {
                        minus[j].setEnabled(true);
                    }
                }
            });
            
            //확인 버튼 이벤트
            ok[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    show = bt[j].getActionCommand();
                    ta.append("   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
                            + "원" + "\n");
                    ok[j].setEnabled(false);
                }
            });
 
        }
    }
	
	 // 메인
    public static void main(String[] args) {
        new LastMenu();
    }
}


