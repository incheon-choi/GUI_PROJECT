package bk;

import javax.swing.JFrame;

import bk2.Panel01;
//import tp.FirstFrame;
import tp.FirstMain;

public class PanelSwitch extends FirstMain {
public static void main(String[] args) {
	BasKetTest bk = new BasKetTest();
	
	bk.setTitle("장바구니");
	bk.Panel01 = new Panel01(bk);
	
	
	bk.add(bk.Panel01);
	
	
}

}
