import javax.swing.*;
import java.awt.*;
public class grid {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Grid Layout Test");
		Container contentPane = frm.getContentPane();
		contentPane.setLayout(new GridLayout(3, 4));
		for (int i=0; i<=9; ++i)
			contentPane.add(new JButton(""+i));
		frm.pack();
		frm.setSize(318,220);
		//frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
