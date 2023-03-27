package menu;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NewMenu extends JPanel {
	
	private JPanel jpanel1 = new JPanel();
	private JButton gimbapBtn;
	private JButton noodleBtn;
	private JButton mealBtn;
	private JButton drinkBtn;
	private MenuTest mt;
	
	public NewMenu(MenuTest mt) {
		this.mt = mt;
		
		setLayout(null);
		setBounds(0,0,500,700);
		setBackground(new Color(255,255,215));
		
		jpanel1.setLayout(null);
		jpanel1.setBounds(0, 60, 500, 40);
		jpanel1.setBackground(Color.WHITE);
		
		gimbapBtn.setBounds(10,0,100,40);
		noodleBtn.setBounds(130,0,100,40);
		mealBtn.setBounds(250,0,100,40);
		drinkBtn.setBounds(370,0,100,40);
		
		jpanel1.add(gimbapBtn);
		jpanel1.add(noodleBtn);
		jpanel1.add(mealBtn);
		jpanel1.add(drinkBtn);
		
		add(jpanel1);
		
	}
}
