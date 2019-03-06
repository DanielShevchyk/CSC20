public class card implements ActionListener {
	static CardLayout contentPaneLayout;
	static JButton B1 = new JButton("To Card 2");
	static JButton B2 = new JButton("To Card 1");
	static JPanel contentPane;
		
 	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source==B1) contentPaneLayout.show(contentPane, "Card 2");
		if (source==B2) contentPaneLayout.show(contentPane, "Card 1");
}
	public static void main(String[] args) {
		JFrame frm = new JFrame("Card Layout Test");
		contentPane = (JPanel) frm.getContentPane();
		contentPane.setLayout(contentPaneLayout=new CardLayout());
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		card1.add(new Label("This is card 1"));
		card2.add(new JTextField("This is Crad 2", 20));
		card1.add(B1); card2.add(B2);
		contentPane.add("Card 1", card1);
		contentPane.add("Card 2", card2) ;
		contentPaneLayout. show(contentPane, "Card 1");
		ActionListener AL = new card() ;
		B1.addActionListener(AL); B2.addActionListener(AL);
		frm.pack();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
