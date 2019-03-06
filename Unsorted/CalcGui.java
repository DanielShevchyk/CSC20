import javax.swing.*;
import java.awt.*;
public class CalcGui{
   public static void main (String[] args){
      JFrame frm = new JFrame("Calculator");
      Container contentPane = frm.getContentPane();
      contentPane.setLayout(new GridLayout(0,1,2,2));
      
      JLabel Title = new JLabel("csc 20 Lab 8", JLabel.CENTER);
      JTextField textField = new JTextField("0", JTextField.TRAILING);
      textField.setHorizontalAlignment(JTextField.TRAILING);
      JPanel pnl1 = new JPanel();
      JPanel pnl2 = new JPanel(new BorderLayout());
      JPanel pnl3 = new JPanel();
      JPanel pnl4 = new JPanel();
      //JPanel pnl5 = new JPanel(new GridLayout(1,0));
      //JPanel pnl6 = new JPanel(new GridLayout(1,0));
      
      
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


      
		pnl1.setLayout(new GridLayout(3,4));
		
		
		pnl1.add(seven);
		pnl1.add(eight);
		pnl1.add(nine);
      pnl1.add(divide);
      pnl1.add(four);
		pnl1.add(five);
		pnl1.add(six);
		pnl1.add(multiply);
		pnl1.add(one);
		pnl1.add(two);
		pnl1.add(three);
		pnl1.add(minus);
      //pnl1.add(zero);
      //pnl1.add(decimal);
      //pnl1.add(equal); 
		//pnl1.add(plus);
      
      
      pnl2.add(Title, BorderLayout.NORTH);
		pnl2.add(textField, BorderLayout.SOUTH);
      
      pnl3.setLayout(new GridLayout(1,4));
      pnl4.setLayout(new GridLayout(1,4));
		
      pnl2.add(zero);
		pnl3.add(pnl4);
		pnl4.add(decimal);
		pnl4.add(plus);
		//pnl3.add(zero);
		//pnl3.add(pnl4);
      
      //pnl5.add(c);
      //pnl6.add(equal);
      //pnl6.add(pnl5);
     
      
		
		
		contentPane.add(pnl2, BorderLayout.NORTH);
		contentPane.add(pnl1, BorderLayout.CENTER);
      contentPane.add(pnl3, BorderLayout.SOUTH);
      //contentPane.add(pnl5, BorderLayout.SOUTH);
      //contentPane.add(pnl6, BorderLayout.SOUTH);

    
      frm.setSize(500,300);
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.setVisible(true);   
}
}      