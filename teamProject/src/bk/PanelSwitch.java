package bk;

import javax.swing.JFrame;

import bk2.Panel01;
import tp.FirstMain;
import shoping.Payment;

public class PanelSwitch extends FirstMain {
public static void main(String[] args) {
	BasKetTest bk = new BasKetTest();
	
	bk.setTitle("장바구니");
	bk.Panel01 = new Panel01(bk);
	
	
	bk.add(bk.Panel01);
	
	bk.setBounds(100, 100, 500, 700);
	bk.setVisible(true);
	bk.setDefaultCloseOperation(bk.EXIT_ON_CLOSE);
}

}
