package menu;

import menu.Gimbap;
import menu.MenuButton;
import menu.MenuTest;

public class MenuMain {
	public static void main(String[] args) {
		MenuTest mt = new MenuTest();
		mt.setLayout(null);
		
		mt.setTitle("분식집");
		
		mt.fmPanel = new FirstMain(mt);
		mt.mbPanel = new MenuButton(mt);
		mt.gimbapPanel = new Gimbap(mt);
		mt.noodlePanel = new Noodle(mt);
		mt.mealPanel = new Meal(mt);
		mt.drinkPanel = new Drink(mt);
		
		
		mt.add(mt.fmPanel);
		
		mt.add(mt.mbPanel);
		mt.add(mt.gimbapPanel);
		mt.add(mt.noodlePanel);
		mt.add(mt.mealPanel);
		mt.add(mt.drinkPanel);
		
		mt.setBounds(0, 0, 500, 700);
		mt.setVisible(true);
		mt.setDefaultCloseOperation(mt.EXIT_ON_CLOSE);

	}
}
