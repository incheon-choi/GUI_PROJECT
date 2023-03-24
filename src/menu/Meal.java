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

public class Meal extends JPanel {
	//mbtn = �Ļ��ư
	//jl1 = �Ļ��̸�
	//jl1_1 = �Ļ簡��
	//mmpsp = �Ļ�޴���ũ��
	//mmp = ���޴��г�

	//�޴���ũ��
	private JScrollPane mmpsp;

	//�޴����
	private JPanel mmp = new JPanel();

	//��ġ�������ư ����
	private JButton mbtn1;
	private JLabel jl1;
	private JLabel jl1_1;

	//�丶��ް������ư ����
	private JButton mbtn2;
	private JLabel jl2;
	private JLabel jl2_1;

	//���Ƕ��̽���ư ����
	private JButton mbtn3;
	private JLabel jl3;
	private JLabel jl3_1;

	//���������ư ����
	private JButton mbtn4;
	private JLabel jl4;
	private JLabel jl4_1;

	//�Ұ�ⵤ���ư ����
	private JButton mbtn5;
	private JLabel jl5;
	private JLabel jl5_1;

	//���ܺ�����ư ����
	private JButton mbtn6;
	private JLabel jl6;
	private JLabel jl6_1;

	//�ҹ��Ұ���ư ����
	private JButton mbtn7;
	private JLabel jl7;
	private JLabel jl7_1;

	//�ع����κ����ư ����
	private JButton mbtn8;
	private JLabel jl8;
	private JLabel jl8_1;

	//�δ����ư ����
	private JButton mbtn9;
	private JLabel jl9;
	private JLabel jl9_1;

	//����ư�̹���
	ImageIcon icon1 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal1.PNG");
	ImageIcon icon2 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal2.PNG");
	ImageIcon icon3 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal3.PNG");
	ImageIcon icon4 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal4.PNG");
	ImageIcon icon5 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal5.PNG");
	ImageIcon icon6 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal6.PNG");
	ImageIcon icon7 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal7.PNG");
	ImageIcon icon8 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal8.PNG");
	ImageIcon icon9 = new ImageIcon("D:\\web_cdy\\java_project\\java\\Meal9.PNG");

	public Meal() {
		//�гη��̾ƿ�
		setLayout(null);
		//Penel�� WHITE�� ����
		setBackground(Color.WHITE);

		//�Ļ�޴��гλ�����
		mmp.setLayout(null);
		mmp.setPreferredSize(new Dimension(0,500));

		//��ġ�������ư
		mbtn1 = new JButton(icon1);
		mbtn1.setBorderPainted(true);
		mbtn1.setBounds(35, 20, 100, 100);

		jl1 = new JLabel("��ġ������");
		jl1_1 = new JLabel("6000��");
		jl1.setBounds(56, 120, 100, 30);
		jl1_1.setBounds(67, 140, 100, 30);

		//�丶��ް������ư 
		mbtn2 = new JButton(icon2);
		mbtn2.setBorderPainted(true);
		mbtn2.setBounds(185, 20, 100, 100); 

		jl2 = new JLabel("�丶��ް�����");
		jl2_1 = new JLabel("7000��");
		jl2.setBounds(192, 120, 100, 30);
		jl2_1.setBounds(215, 140, 100, 30);

		//���Ƕ��̽���ư
		mbtn3 = new JButton(icon3);
		mbtn3.setBorderPainted(true);
		mbtn3.setBounds(335, 20, 100, 100);

		jl3 = new JLabel("���Ƕ��̽�");
		jl3_1 = new JLabel("6000��");
		jl3.setBounds(355, 120, 100, 30);
		jl3_1.setBounds(364, 140, 100, 30);

		//���������ư
		mbtn4 = new JButton(icon4);
		mbtn4.setBorderPainted(true);
		mbtn4.setBounds(35, 180, 100, 100);

		jl4 = new JLabel("��������");
		jl4_1 = new JLabel("6000��");
		jl4.setBounds(62, 280, 100, 30);
		jl4_1.setBounds(67, 300, 100, 30);

		//�Ұ�ⵤ���ư
		mbtn5 = new JButton(icon5);
		mbtn5.setBorderPainted(true);
		mbtn5.setBounds(185, 180, 100, 100);

		jl5 = new JLabel("�Ұ�ⵤ��");
		jl5_1 = new JLabel("6000��");
		jl5.setBounds(205, 280, 100, 30);
		jl5_1.setBounds(217, 300, 100, 30);

		//���ܺ�����ư
		mbtn6 = new JButton(icon6);
		mbtn6.setBorderPainted(true);
		mbtn6.setBounds(335, 180, 100, 100);

		jl6 = new JLabel("���ܺ����");
		jl6_1 = new JLabel("6500��");
		jl6.setBounds(357, 280, 100, 30);
		jl6_1.setBounds(366, 300, 100, 30);

		//�ҹ��Ұ���ư
		mbtn7 = new JButton(icon7);
		mbtn7.setBorderPainted(true);
		mbtn7.setBounds(35, 340, 100, 100);

		jl7 = new JLabel("�ҹ��Ұ��");
		jl7_1 = new JLabel("6500��");
		jl7.setBounds(50, 440, 100, 30);
		jl7_1.setBounds(67, 460, 100, 30);

		//�ع����κ����ư
		mbtn8 = new JButton(icon8);
		mbtn8.setBorderPainted(true);
		mbtn8.setBounds(185, 340, 100, 100);

		jl8 = new JLabel("�ع����κ��");
		jl8_1 = new JLabel("7000��");
		jl8.setBounds(193, 440, 100, 30);
		jl8_1.setBounds(217, 460, 100, 30);

		//�δ����ư
		mbtn9 = new JButton(icon9);
		mbtn9.setBorderPainted(true);
		mbtn9.setBounds(335, 340, 100, 100);

		jl9 = new JLabel("�δ��");
		jl9_1 = new JLabel("7000��");
		jl9.setBounds(363, 440, 100, 30);
		jl9_1.setBounds(367, 460, 100, 30);

		//�Ļ�޴��гο� ��ư�߰�
		mmp.add(mbtn1);
		mmp.add(jl1);
		mmp.add(jl1_1);

		mmp.add(mbtn2);
		mmp.add(jl2);
		mmp.add(jl2_1);

		mmp.add(mbtn3);
		mmp.add(jl3);
		mmp.add(jl3_1);

		mmp.add(mbtn4);
		mmp.add(jl4);
		mmp.add(jl4_1);

		mmp.add(mbtn5);
		mmp.add(jl5);
		mmp.add(jl5_1); 

		mmp.add(mbtn6);
		mmp.add(jl6);
		mmp.add(jl6_1);

		mmp.add(mbtn7);
		mmp.add(jl7);
		mmp.add(jl7_1);

		mmp.add(mbtn8);
		mmp.add(jl8);
		mmp.add(jl8_1);

		mmp.add(mbtn9);
		mmp.add(jl9);
		mmp.add(jl9_1);

		//��ũ�ѿ� ���޴��г� �߰�
		mmpsp = new JScrollPane(mmp);
		//��ũ���� ����� ����
		mmpsp.setBounds(0, 100, 485, 350);

		//�����ü�гο� ��ũ�� �߰�
		add(mmpsp);
	}
}