//Daniel Shevchyk
//Lab 09 CSC 28
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calcFinalv2 implements ActionListener{
   static JTextField textField;
   static JButton equal;
   static JButton plus;
   static JButton minus;
   static JButton multiply;
   static JButton divide;

   boolean newNumber = true;
   double res;
   char operator;
   double opnd1 = 0.0;
   double opnd2 = 0.0;
   
   public void actionPerformed(ActionEvent e) {
      char c = e.getActionCommand().charAt(0);
      switch(c) {
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9': 
                  if (newNumber) {textField.setText(""+c); newNumber = false;}
                     else
                     textField.setText(textField.getText()+c);//append c to the end of the textfield;
                  return;
         case '+':
                  opnd1 = Double.parseDouble(textField.getText());
                  newNumber = true;
                  operator = '+';
                  return;
         case '-':
                  opnd1 = Double.parseDouble(textField.getText());
                  newNumber = true;
                  operator = '-';
                  return;
         case '*':
                  opnd1= Double.parseDouble(textField.getText());
                  newNumber = true;
                  operator = '*';
                  return;
         case '/':   
                  opnd1 = Double.parseDouble(textField.getText());
                  newNumber = true;
                  operator = '/';
                  return;
         case '=':opnd2 = Double.parseDouble(textField.getText());
                  switch (operator) {
                        case '/': res = opnd1 / opnd2; break;

                        case '*': res = opnd1 * opnd2; break;

                        case '-': res = opnd1 - opnd2; break;

                        case '+': res = opnd1 + opnd2; break;
                        }
                  textField.setText(""+res);
                  newNumber= true;
                  return;
         case 'C':
                  textField.setText("0");
                  newNumber = true;
                  return;
         case '.':
                  textField.setText(textField.getText() + c);          
}
}

   
   public static void main (String[] args){
      JFrame frm = new JFrame("Calculator");
      ActionListener AL = new calcFinalv2();
      Container contentPane = frm.getContentPane();
      contentPane.setLayout(new GridLayout(0,1,2,2));
      JLabel Title = new JLabel("csc 20 Lab 8", JLabel.CENTER);
      textField = new JTextField("0", JTextField.RIGHT);
      textField.addActionListener(AL);
      textField.setHorizontalAlignment(JTextField.TRAILING);
      contentPane.add(Title);
      contentPane.add(textField);

                JButton c = new JButton("C");
                c.addActionListener(AL);
                JButton divide = new JButton("/");
                divide.addActionListener(AL);
                JButton multiply = new JButton("*");
                multiply.addActionListener(AL);
                JButton equal = new JButton("=");
                equal.addActionListener(AL);
                JButton decimal = new JButton(".");
                decimal.addActionListener(AL);
                JButton plus = new JButton("+");
                plus.addActionListener(AL);
                JButton minus = new JButton("-");
                minus.addActionListener(AL);
                JButton one = new JButton("1");
                one.addActionListener(AL);
                JButton two = new JButton("2");
                two.addActionListener(AL);
                JButton three = new JButton("3");
                three.addActionListener(AL);
                JButton four = new JButton("4");
                four.addActionListener(AL);
                JButton five = new JButton("5");
                five.addActionListener(AL);
                JButton six = new JButton("6");
                six.addActionListener(AL);
                JButton seven = new JButton("7");
                seven.addActionListener(AL);
                JButton eight = new JButton("8");
                eight.addActionListener(AL);
                JButton nine = new JButton("9");
                nine.addActionListener(AL);
                JButton zero = new JButton("0");
                zero.addActionListener(AL);
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

