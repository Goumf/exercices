import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class  Exemple02{
		
private JTextArea text, area;
public Exemple02() {
	
	JFrame frame = new JFrame("exemple");
	//additionner l'action
	frame.addWindowListener(new MyWindowListener());
	text = new JTextArea();
	text.setEditable(false);
	// 2eme fentere	
	JWindow window = new JWindow(frame);
	JPanel panel = new JPanel(new BorderLayout());
	panel.add(text, BorderLayout.CENTER);
	JScrollPane scroll = new JScrollPane(panel);
	window.getContentPane().add(scroll);
	// text area pour la 1ere fenetre 	
	JPanel panel2 = new JPanel(new BorderLayout());
	area = new JTextArea();
	panel2.add(area, BorderLayout.CENTER);
	//Panel 3 est la partie central de la frame	
	JPanel panel3 = new JPanel(new BorderLayout());
	JButton button = new JButton("Envoyer");
	panel3.add(new JScrollPane(panel2), BorderLayout.CENTER);
	//Bouton au sud	
	panel3.add(button, BorderLayout.SOUTH);
	button.addActionListener(new MyActionListener());
	frame.getContentPane().add(panel3);
	frame.setSize(200, 200);
	window.setSize(200, 200);
	frame.setLocation(400, 400);
	window.setLocation(600, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	window.setVisible(true);

}
// Adapter pour fermer la fenetre
private class MyWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent event) {
		System.exit(0);
	}
}
//delegu  pour  l'objet text et area
private class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		text.append(area.getText() + "\n");
		area.setText("");
	}
}
public static void main(String[] args) {
	new Exemple02();
}
}