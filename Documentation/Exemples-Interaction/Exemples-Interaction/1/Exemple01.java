import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Exemple01 {
private int count = 0;
private JLabel label;
public Exemple01() {
	JFrame frame = new JFrame("exemple");
	JButton button = new JButton("clic clic");
	button.addActionListener(new MyActionListener());
	label = new JLabel("0");
	/*
	
	//  Lambda à la place de la classe interne
        button.addActionListener(e -> {
            count++;
            label.setText(Integer.toString(count));
        });
	*/
	JPanel pane = new JPanel();
	pane.add(button);
	pane.add(label);
	frame.getContentPane().add(pane, BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,200);
	frame.setVisible(true);
}
/* classe qui accède à count; count appartient à la classe englobante */
private class MyActionListener implements ActionListener {
public void actionPerformed(ActionEvent event) {
	count++;
	label.setText(Integer.toString(count));
}


}
public static void main(String[] args) {
	new Exemple01();
	}
}