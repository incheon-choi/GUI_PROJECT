package menu;

import javax.swing.JFrame;

import menu.Gimbap;
import menu.Noodle;
import menu.Meal;
import menu.Drink;
import menu.MenuButton;

public class MenuMain {
	public static void main(String[] args) {
		MenuTest mt = new MenuTest();
		mt.setLayout(null);
		
		mt.setTitle("분식집");
		
		mt.mbPanel = new MenuButton(mt);
		mt.gimbapPanel = new Gimbap(mt);
		mt.noodlePanel = new Noodle(mt);
		mt.mealPanel = new Meal(mt);
		mt.dirnkPanel = new Drink(mt);
		
		mt.gimbapPanel.setBounds(0, 0, 500, 700);
		mt.noodlePanel.setBounds(0, 0, 500, 700);
		mt.mealPanel.setBounds(0, 0, 500, 700);
		mt.dirnkPanel.setBounds(0, 0, 500, 700);
		//gimbapPanel.setBackground(Color.black);
		
		mt.add(mt.mbPanel);
		mt.add(mt.gimbapPanel);
		mt.add(mt.noodlePanel);
		mt.add(mt.mealPanel);
		mt.add(mt.dirnkPanel);
		
		
		
		mt.setBounds(0, 0, 500, 700);
		mt.setVisible(true);
		mt.setDefaultCloseOperation(mt.EXIT_ON_CLOSE);
	}

}
