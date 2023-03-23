package tp;

import bk.PanelSwitch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PanelChange pch = new PanelChange();

		pch.setTitle("분식집 키오스크");

		pch.fm = new FirstMain(pch);
		pch.bk = new PanelSwitch();

		pch.add(pch.fm);

		pch.setBounds(150, 150, 500, 700);
		pch.setVisible(true);
		pch.setDefaultCloseOperation(pch.EXIT_ON_CLOSE);

	}

}
