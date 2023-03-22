package panel2;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import panel1.JPanelTest;

public class JPanel02 extends JPanel{
	
	
	
	private JTextField tf;
	private JPasswordField jpf;
	private JPanelTest win;

	
	public JPanel02(JPanelTest win) {

	this.win = win;
	setLayout(null);
	
	JLabel idLabel = new JLabel("아이디:");
	idLabel.setBounds(31, 40, 67, 15);
	add(idLabel);
	
	
	tf = new JTextField();
	
	tf.setBounds(123, 40, 116, 21);
	add(tf);
	
	JLabel pwJL = new JLabel("암호:");
	pwJL.setBounds(31, 84, 67, 15);
	add(pwJL);
	
	jpf = new JPasswordField();
	jpf.setBounds(123, 84, 116, 21);
	add(jpf);
	
	
	JButton btn = new JButton("버튼");
	btn.setBounds(10, 10, 70, 20);
	add(btn);
	
	btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			win.change("JPanel01");
			
		}
	});
	
	
	
	
	
	}
	
	
}



