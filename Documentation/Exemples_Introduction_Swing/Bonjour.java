import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bonjour {
	private static void creeInterface() {
		JFrame frame = new JFrame("Application Bonjour");    //ça pourrait être le nom de l'application 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Bonjour!");                //label c'est un texte
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		frame.getContentPane().setLayout(new FlowLayout());         // flowlayout = règle d'affichage. elles existent. on ne doit pas les inventer
		frame.getContentPane().add(label);								//il va l'additionner selon la règle donnée
		frame.getContentPane().add(button);
		frame.pack();
		frame.setVisible(true);                                   
}

    public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {     //on doit l'invoquer, comme une tâche en font, qui va attendre que tout soit prêt pour l'afficher.
		 public void run() {                                        //il va attendre jusqu'à ce que create finisse
				   creeInterface();                                 //multitread, il se peut que des lignes soient passées avant que tout se prêt
		 }
		});
  }
 
 
}