package menu;

import java.awt.Color;

import javax.swing.JFrame;

public class MenuMain {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("떡볶이 가게");
		f.setLayout(null);
		
		MenuButton mb = new MenuButton();
		f.add(mb);
		
		Gimbap gimbapPanel = new Gimbap();
		Noodle noodlePanle = new Noodle();
		Meal mealPanle = new Meal();
		Drink drinkPanle = new Drink();
		
		gimbapPanel.setBounds(0, 0, 500, 700);
		//noodlePanle.setBounds(0, 0, 500, 700);
		//mealPanle.setBounds(0, 0, 500, 700);
		//drinkPanle.setBounds(0, 0, 500, 700);
		//gimbapPanel.setBackground(Color.black);
		
	
		f.add(gimbapPanel);
		f.add(noodlePanle);
		f.add(mealPanle);
		f.add(drinkPanle);
		
		
		
		f.setBounds(0, 0, 500, 700);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
