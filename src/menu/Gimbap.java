package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Gimbap extends JPanel {
	//gbtn = ����ư
	//jl1 = ����̸�
	//jl1_1 = ��䰡��
	//gmpsp = ���޴���ũ��
	//gmp = ���޴��г�

	//�޴���ũ��
	private JScrollPane gmpsp;

	//�޴����
	private JPanel gmp = new JPanel();

	//��ä����ư ����
	private JButton gbtn1;
	private JLabel jl1;
	private JLabel jl1_1;

	//��ġ����ư ����
	private JButton gbtn2;
	private JLabel jl2;
	private JLabel jl2_1;

	//ġ�����ư ����
	private JButton gbtn3;
	private JLabel jl3;
	private JLabel jl3_1;

	//��ġ����ư ����
	private JButton gbtn4;
	private JLabel jl4;
	private JLabel jl4_1;

	//�Ұ�����ư ����
	private JButton gbtn5;
	private JLabel jl5;
	private JLabel jl5_1;

	//�ջ���Ƣ�����ư ����
	private JButton gbtn6;
	private JLabel jl6;
	private JLabel jl6_1;

	//����ư�̹���
	ImageIcon icon1 = new ImageIcon("D:\\web_cdy\\java_project\\java\\gimbap1.PNG");
	ImageIcon icon2 = new ImageIcon("D:\\web_cdy\\java_project\\java\\gimbap2.PNG");
	ImageIcon icon3 = new ImageIcon("D:\\web_cdy\\java_project\\java\\gimbap3.PNG");
	ImageIcon icon4 = new ImageIcon("D:\\web_cdy\\java_project\\java\\gimbap4.PNG");
	ImageIcon icon5 = new ImageIcon("D:\\web_cdy\\java_project\\java\\gimbap5.PNG");
	ImageIcon icon6 = new ImageIcon("D:\\web_cdy\\java_project\\java\\gimbap6.PNG");

	public Gimbap() {
		//�гη��̾ƿ�
		setLayout(null);
		//Penel�� WHITE�� ����
		setBackground(Color.WHITE);

		//���޴��гλ�����
		//gmp.setLayout(null)�� �߱� ������ �гο� ��ũ�� ������ �ȵǴ� ������ �߻��Ѵ�.
		//�׷��� gmp�� ����� gmp.setPreferredSize(new Dimension())�� ����ؼ� �����ؾ� ��ũ���� ȭ�鿡 ���δ�.
		gmp.setLayout(null);
		gmp.setPreferredSize(new Dimension(0,370));

		//��ä����ư
		gbtn1 = new JButton(icon1);
		gbtn1.setBorderPainted(true);
		gbtn1.setBounds(35, 20, 100, 100);

		jl1 = new JLabel("��ä���");
		jl1_1 = new JLabel("2000��");
		jl1.setBounds(62, 120, 100, 30);
		jl1_1.setBounds(67, 140, 100, 30);

		//��ġ����ư 
		gbtn2 = new JButton(icon2);
		gbtn2.setBorderPainted(true);
		gbtn2.setBounds(185, 20, 100, 100); 

		jl2 = new JLabel("��ġ���");
		jl2_1 = new JLabel("3000��");
		jl2.setBounds(213, 120, 100, 30);
		jl2_1.setBounds(217, 140, 100, 30);

		//ġ�����ư
		gbtn3 = new JButton(icon3);
		gbtn3.setBorderPainted(true);
		gbtn3.setBounds(335, 20, 100, 100);

		jl3 = new JLabel("ġ����");
		jl3_1 = new JLabel("3000��");
		jl3.setBounds(360, 120, 100, 30);
		jl3_1.setBounds(364, 140, 100, 30);

		//��ġ����ư
		gbtn4 = new JButton(icon4);
		gbtn4.setBorderPainted(true);
		gbtn4.setBounds(35, 180, 100, 100);

		jl4 = new JLabel("��ġ���");
		jl4_1 = new JLabel("3000��");
		jl4.setBounds(62, 280, 100, 30);
		jl4_1.setBounds(66, 300, 100, 30);

		//�Ұ�����ư
		gbtn5 = new JButton(icon5);
		gbtn5.setBorderPainted(true);
		gbtn5.setBounds(185, 180, 100, 100);

		jl5 = new JLabel("�Ұ����");
		jl5_1 = new JLabel("4000��");
		jl5.setBounds(207, 280, 100, 30);
		jl5_1.setBounds(217, 300, 100, 30);

		//�ջ���Ƣ�����ư
		gbtn6 = new JButton(icon6);
		gbtn6.setBorderPainted(true);
		gbtn6.setBounds(335, 180, 100, 100);

		jl6 = new JLabel("�ջ���Ƣ����");
		jl6_1 = new JLabel("5000��");
		jl6.setBounds(343, 280, 100, 30);
		jl6_1.setBounds(363, 300, 100, 30);

		//���޴��гο� ��ư�߰�
		gmp.add(gbtn1);
		gmp.add(jl1);
		gmp.add(jl1_1);

		gmp.add(gbtn2);
		gmp.add(jl2);
		gmp.add(jl2_1);

		gmp.add(gbtn3);
		gmp.add(jl3);
		gmp.add(jl3_1);

		gmp.add(gbtn4);
		gmp.add(jl4);
		gmp.add(jl4_1);

		gmp.add(gbtn5);
		gmp.add(jl5);
		gmp.add(jl5_1); 

		gmp.add(gbtn6);
		gmp.add(jl6);
		gmp.add(jl6_1);

		//��ũ�ѿ� ���޴��г� �߰�
		gmpsp = new JScrollPane(gmp);
		//��ũ���� ����� ����
		gmpsp.setBounds(0, 100, 485, 350);

		//�����ü�гο� ��ũ�� �߰�
		add(gmpsp);
	}	
}