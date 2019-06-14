import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Ex1Main extends JFrame implements ActionListener {
	
	JButton jbn;
	JButton jbn2;
	JTextField jtf;
	
	public Ex1Main() {
		super("약수 구하기");
		setLayout(new FlowLayout());
		
		jbn=new JButton("약수 구하기");
		jbn.addActionListener(this);
		jbn2=new JButton("소수 구하기");
		jbn2.addActionListener(this);
		jtf=new JTextField(20);
		
		add(jbn);
		add(jbn2);
		add(jtf);
		
		setVisible(true);
		setSize(300, 120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex1Main();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbn) {
			int num=Integer.parseInt(JOptionPane.showInputDialog(this, "약수를 구할 정수를 입력하세요."));
			Ex1 ex1 = new Ex1();
			String str = ex1.divisor(num);
			jtf.setText(str);
	}
		
		if(e.getSource()==jbn2) {
			int num1=Integer.parseInt(JOptionPane.showInputDialog(this, "소수를 구할 정수를 입력하세요."));
			Ex2 ex2 = new Ex2();
			String str = ex2.prime_number(num1);
			jtf.setText(str);
	}
}
}