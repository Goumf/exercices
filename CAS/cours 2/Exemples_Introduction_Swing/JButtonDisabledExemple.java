import javax.swing.*;

public class JButtonDisabledExemple implements  Runnable {
    public void run() {
	JFrame maJFrame = new JFrame("Me voici!");
	JButton monBouton = new JButton("Cliquez-moi!");
	monBouton.setEnabled(false);
	maJFrame.getContentPane().add(monBouton);
	maJFrame.pack();
	maJFrame.setVisible(true);
    }
    public static void main(String []argv) {
	SwingUtilities.invokeLater(new JButtonDisabledExemple());	
    }
}