package menu;

import menu.Gimbap;
import menu.Noodle;
import menu.Meal;

import javax.swing.JFrame;

import menu.Drink;
import menu.MenuButton;
import menu.FirstMain;
import menu.NewMenu;

public class MenuTest extends JFrame {

	public FirstMain fmPanel;
	public Gimbap gimbapPanel;
	public Noodle noodlePanel;
	public Meal mealPanel;
	public Drink drinkPanel;
	public MenuButton mbPanel;
	
	public void change(String panelName) {
		if(panelName.equals("here")){
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(gimbapPanel);
			revalidate(); 
			repaint(); 
		} else if(panelName.equals("takeout")) {
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(gimbapPanel);
			revalidate(); 
			repaint(); 
		} else if(panelName.equals("gimbap")) {
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(gimbapPanel);
			revalidate(); 
			repaint(); 
		} else if(panelName.equals("noodle")){
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(noodlePanel);
			revalidate();
			repaint();
		} else if(panelName.equals("meal")){
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(mealPanel);
			revalidate();
			repaint();
		} else if(panelName.equals("drink")){
			getContentPane().removeAll();
			getContentPane().add(mbPanel);
			getContentPane().add(drinkPanel);
			revalidate();
			repaint();
		} else if(panelName.equals("before")) {
			getContentPane().removeAll();
			getContentPane().add(fmPanel);
			revalidate(); 
			repaint(); 	
		} else if(panelName.equals("pay")) {
			getContentPane().removeAll();
			getContentPane().add(fmPanel);
			revalidate(); 
			repaint();
		}
		
	}
	
}
