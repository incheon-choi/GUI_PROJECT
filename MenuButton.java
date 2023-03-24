package menu;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuButton extends JPanel {
	
	private JButton gimbapBtn;
	private JButton noodleBtn;
	private JButton mealBtn;
	private JButton drinkBtn;
	
	public MenuButton(MenuTest mt) {
		
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
	}
}
