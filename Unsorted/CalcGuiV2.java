//Daniel Shevchyk
//Lab 08 CSC 28
import javax.swing.*;
import java.awt.*;
public class CalcGuiV2{
   public static void main (String[] args){
      JFrame frm = new JFrame("Calculator");
      Container contentPane = frm.getContentPane();
      contentPane.setLayout(new GridLayout(0,1,2,2));
      
      JLabel Title = new JLabel("csc 20 Lab 8", JLabel.CENTER);
      JTextField textField = new JTextField("0", JTextField.RIGHT);
      textField.setHorizontalAlignment(JTextField.TRAILING);
      contentPane.add(Title);
      contentPane.add(textField);
      
      JButton c = new JButton("C");
		JButton divide = new JButton("/");
		JButton multiply = new JButton("*");
		JButton equal = new JButton("=");
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
      
		JPanel pnl1 = new JPanel( new GridLayout (1,4,2,2));
		pnl1.add(seven);
		pnl1.add(eight);
		pnl1.add(nine);
      pnl1.add(divide);
      contentPane.add(pnl1);
      JPanel pnl2 = new JPanel( new GridLayout (1,4,2,2));
      pnl2.add(four);
		pnl2.add(five);
		pnl2.add(six);
		pnl2.add(multiply);
      contentPane.add(pnl2);
      JPanel pnl3 = new JPanel( new GridLayout (1,4,2,2));
		pnl3.add(one);
		pnl3.add(two);
		pnl3.add(three);
		pnl3.add(minus);
      contentPane.add(pnl3);
      JPanel pnl4 = new JPanel( new GridLayout (1,2,2,2));
      JPanel pnl5 = new JPanel( new GridLayout (1,2,2,2));
      pnl4.add(zero);
      pnl5.add(decimal);
      pnl5.add(plus);
      pnl4.add(pnl5);
      contentPane.add(pnl4);
      JPanel pnl6 = new JPanel( new GridLayout (0,2,2,2));
      pnl6.add(equal);
      pnl6.add(c);
      contentPane.add(pnl6);

      frm.setSize(500,300);
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.setVisible(true);   
}
}