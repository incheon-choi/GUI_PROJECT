package menu;

import javax.swing.JFrame;
import menu.Gimbap;

public class MenuMain {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		//Gimbap gimbap = new Gimbap();
		Meal meal = new Meal();

		//f.add(gimbap);
		f.add(meal);









		f.setBounds(150, 150, 500, 700);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}
}