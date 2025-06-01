import javax.swing.*;

public class JButtonExemple implements  Runnable {
    public void run() {
	JFrame maJFrame = new JFrame("Me voici!");
	JButton monBouton = new JButton("Cliquez-moi!");
	maJFrame.getContentPane().add(monBouton);
	maJFrame.pack();
	maJFrame.setVisible(true);
    }
    public static void main(String []argv) {
	SwingUtilities.invokeLater(new JButtonExemple());	
    }
}