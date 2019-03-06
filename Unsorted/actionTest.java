import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class actionTest implements ActionListener{
	static JButton[] Button = new JButton[10];
	static JTextField tf;
	
 	public void actionPerformed(ActionEvent e) {
 		for (int i=0; i<=9; ++i) {
			if(e.getSource() == Button[i]) {
 				System.out.printf("Button %d is pressed!\n", i);
				return;
			}
		}
		if (e.getSource() == tf)
			System.out.println("Text field  contains " +tf.getText());
 	}
public static void main(String[] args) {
		JFrame frm = new JFrame("Flow Layout Test");
		Container contentPane = frm.getContentPane();
		contentPane.setLayout(new FlowLayout());
		ActionListener AL = new actionTest() ;
	 	for (int i=0; i<=9; ++i) {
			Button[i] = new JButton(""+i);
			contentPane.add(Button[i]);
			Button[i].addActionListener(AL);
		}
		tf = new JTextField("", 27);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.addActionListener(AL);
		contentPane.add(tf);
		frm.pack();
		frm.setSize(318,220);
		//frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
