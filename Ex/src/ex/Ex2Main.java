package ex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Ex2Main extends JFrame implements ActionListener {
		
	JLabel jl1,jl2;
	JTextField jt1,jt2;
	JButton jb1,jb2;
	JTextArea ja;
	
	ex2 ex2 = new ex2();
	
	public Ex2Main() {
		setLayout(new FlowLayout());
		
		jl1 = new JLabel("�� �� : ");
		jt1 = new JTextField(20);
		jl2 = new JLabel("��ȭ��ȣ : ");
		jt2 = new JTextField(20);
		jb1 = new JButton("��ȭ��ȣ �߰�");
		jb1.addActionListener(this);
		jb2 = new JButton("��ȭ��ȣ ����");
		jb2.addActionListener(this);
		ja = new JTextArea(10,20);
		
		add(jl1);
		add(jt1);
		add(jl2);
		add(jt2);
		add(jb1);
		add(jb2);
		add(ja);
		
		setSize(320,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex2Main();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb1) {
			ex2.insertPhoneNumber(jt1.getText(), jt2.getText());

		} else if(e.getSource()==jb2) {
			ArrayList<PhoneValue> e1 = ex2.getPhoneNumberList();
			String str = "�̸�\t ��ȭ��ȣ\n";
			for(int i = 0; i < e1.size(); i++) {
	            str+=e1.get(i).getName()+"\t"+e1.get(i).getPhoneNumber()+"\n";
	        }
			ja.setText(str);
	}
}
}