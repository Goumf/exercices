import javax.swing.*;
import java.awt.*;

public class BorderLayoutExemple implements  Runnable {
    public void run() {
	JFrame maJFrame = new JFrame("Me voici!");                            //j'ai pas de bouton, que des labels
	JLabel nord = new JLabel("Nord",SwingConstants.CENTER);
	JLabel sud = new JLabel("Sud",SwingConstants.CENTER);
	JLabel est = new JLabel("Est");
	JLabel ouest = new JLabel("Ouest");
	JLabel centre = new JLabel("Centre",SwingConstants.CENTER);
        centre.setOpaque(true);
        centre.setBackground(Color.WHITE);
	maJFrame.getContentPane().add(nord,BorderLayout.NORTH);                      //j'ajoute l'emplacement du nord que je défini
	maJFrame.getContentPane().add(sud,BorderLayout.SOUTH);
	maJFrame.getContentPane().add(est,BorderLayout.EAST);
	maJFrame.getContentPane().add(ouest,BorderLayout.WEST);
	maJFrame.getContentPane().add(centre,BorderLayout.CENTER);
	maJFrame.pack(); // rangement «optimal»
	maJFrame.setVisible(true);
    }
    public static void main(String []argv) {
	SwingUtilities.invokeLater(new BorderLayoutExemple());	
    }
}
