import javax.swing.*;
import java.awt.*;
public class CalcTest{
	public static void main(String[] args){
		JFrame frame = new JFrame("Calculator");
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JTextField text = new JTextField("0", JTextField.LEADING);
		JLabel label = new JLabel("CSC 20 Lab 08", JLabel.CENTER);
		JButton c = new JButton("C");
		JButton ce = new JButton("CE");
		JButton plusminus = new JButton("+/-");
		JButton divide = new JButton("/");
		JButton times = new JButton("*");
		JButton equals = new JButton("=");
		JButton decimal = new JButton(".");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		
		panel6.setLayout(new GridLayout(1,2));
		panel6.add(decimal);
		panel6.add(equals);
		
		panel5.setLayout(new GridLayout(2,1));
		panel5.add(zero);
		panel5.add(panel6);
		
		panel4.setLayout(new GridLayout(2,1));
		
		
		panel1.setLayout(new GridLayout(3,1));
		panel1.add(one);
		panel1.add(two);
		panel1.add(three);
		
		contentPane.add(panel1, BorderLayout.CENTER);
		frame.setSize(500,300);
		//frm.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}