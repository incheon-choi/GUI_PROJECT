package menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuButton extends JPanel {

	private JButton gimbapBtn;
	private JButton noodleBtn;
	private JButton mealBtn;
	private JButton drinkBtn;
	private MenuTest mt;
	
	public MenuButton(MenuTest mt) {
		this.mt = mt;
		
		setLayout(null);
		setBounds(0, 60, 500, 40);
		//setBackground(Color.YELLOW);
		
		gimbapBtn = new JButton("김    밥");
		noodleBtn = new JButton("면    류");
		mealBtn = new JButton("식    사");
		drinkBtn = new JButton("음    료");
		
		gimbapBtn.setBounds(10,0,100,40);
		noodleBtn.setBounds(130,0,100,40);
		mealBtn.setBounds(250,0,100,40);
		drinkBtn.setBounds(370,0,100,40);
		
		add(gimbapBtn);
		add(noodleBtn);
		add(mealBtn);
		add(drinkBtn);
		
		gimbapBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mt.change("gimbap");
			}
		});
		
		noodleBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mt.change("noodle");
			}
		});
		
		mealBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mt.change("meal");
			}
		});
		
		drinkBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mt.change("drink");
			}
		});
		
		
	}
}
