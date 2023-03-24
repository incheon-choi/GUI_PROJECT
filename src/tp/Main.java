package tp;

import bk.BasKetTest;
import bk.PanelSwitch;
import bk2.Panel01;
import menu.Gimbap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PanelChange pch = new PanelChange();

		pch.setTitle("분식집 키오스크");

		pch.fm = new FirstMain(pch);
		pch.bk = new Panel01(pch);
		pch.gmp = new Gimbap(pch);
		
		
		pch.add(pch.fm);

		pch.setBounds(150, 150, 500, 700);
		pch.setVisible(true);
		pch.setDefaultCloseOperation(pch.EXIT_ON_CLOSE);

	}

}
