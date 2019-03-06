import javax.swing.*;
import java.awt.*;
public class CalculatorTerminal{
	public static void main(String[] args){
		JFrame frame = new JFrame("Calculator");
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(new BorderLayout());
		JPanel panel3 = new JPanel(new GridLayout(1,0));
		JPanel panel4 = new JPanel(new GridLayout(1,0));
		JTextField text = new JTextField("0");
		text.setHorizontalAlignment(JTextField.TRAILING);
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
		
		panel1.setLayout(new GridLayout(4,4));
		panel1.add(c);
		panel1.add(ce);
      panel1.add(plusminus);
		panel1.add(divide);
		panel1.add(seven);
		panel1.add(eight);
		panel1.add(nine);
		panel1.add(times);
		panel1.add(four);
		panel1.add(five);
		panel1.add(six);
		panel1.add(minus);
		panel1.add(one);
		panel1.add(two);
		panel1.add(three);
		panel1.add(plus);
		
		panel2.add(label, BorderLayout.NORTH);
		panel2.add(text, BorderLayout.SOUTH);
		
		panel4.add(decimal);
		panel4.add(equals);
		panel3.add(zero);
		panel3.add(panel4);
		
		contentPane.add(panel3, BorderLayout.SOUTH);
		contentPane.add(panel2, BorderLayout.NORTH);
		contentPane.add(panel1, BorderLayout.CENTER);
		frame.setSize(400,200);
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}