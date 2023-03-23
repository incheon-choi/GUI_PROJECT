package tp;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		PanelChange pch = new PanelChange();
		
		pch.setTitle("분식집 키오스크");
		
		pch.fm = new FirstMain(pch);
		pch.pp = new PassPanel(pch);
		
		pch.add(pch.fm);
		
		
		
		
		
		pch.setBounds(150, 150, 500, 700);
		pch.setVisible(true);
		pch.setDefaultCloseOperation(pch.EXIT_ON_CLOSE);
		

		
		

	}

}




/*
 * 구현해야 할 내용 : 
 * 
 *  1.초기 화면띄우기. O
 *  
 *  2.초기 화면에 구현해야 하는버튼은 2개(매장주문/포장주문) O
 *  -> 버튼을 누르면 창을 닫지 않고 패널 전환, 2번 화면에서 취소버튼작동 확인. 
 * 	 
 *  3.메인화면에 무작위 이미지가 순차적으로 돌아가게 구현. X
 *  ->음식쪽 이미지 구해지면 그거 받아다가 무작위 이미지를 스트림으로 넘길것.
 *  ->당장 받은거 없으니 테스트로 아무 이미지 넣어다가 메꾸기.
 *  
 *  
 *  4.입력이 없을 시 자동으로 초기화면으로 돌아갈 클래스 작성 X 
 *  ->reset에 작성.
 *  PassPanel에서 대기하고 있을 경우 20~30초? 동안 입력이 없을시 초기화면으로 복귀.
 *  
 *  
 *  
 *  5.초기 사이즈는 500/700
 * 
 * 
 */



