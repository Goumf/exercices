import javax.swing.*;

public class JMenuExemple implements  Runnable {
    public void run() {
	JFrame fenetre = new JFrame("Un exemple avec des menus");
	JLabel label = new JLabel("Bla bla bla bla");
	fenetre.getContentPane().add(label);

	// 1 menu 1 (pour la table 12)...
	JMenu menu1 = new JMenu("Fichier");                                           //1er menu fichier on a pris le menu1 et on additionner le Jmenuitem pour faire et défaire 
	JMenuItem quitter = new JMenuItem("Quitter");
	menu1.add(quitter);

	// 1 menu 1 (pour la table 8)...
	JMenu menu2 = new JMenu("Édition");
	JMenuItem undo = new JMenuItem("Défaire");
	JMenuItem redo = new JMenuItem("Refaire");
	menu2.add(undo);
	menu2.add(redo);

	// 1 barre de menu
	JMenuBar barre = new JMenuBar();
	barre.add(menu1);
	barre.add(menu2);

	// on accroche le tout à la fenêtre
	fenetre.setJMenuBar(barre);                                                       //une fois qu'on a la barre, il ne faut pas oublier de l'ajouter sur la fenêtre

	fenetre.pack();
	fenetre.setVisible(true);
    }
    public static void main(String[] args) {
	SwingUtilities.invokeLater(new JMenuExemple());
    }
}