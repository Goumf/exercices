import javax.swing.*;  // Pour JFrame, JButton, JTextField
import java.awt.*;     // Pour Container, Layouts

// La classe implémente Runnable pour être exécutée dans le thread de l'interface graphique
public class SpringLayoutExemple implements Runnable {

  // Méthode principale exécutée via invokeLater
  public void run() {
    // Création de la fenêtre avec le nom de la classe comme titre
    JFrame fenetre = new JFrame(this.getClass().toString());
    
    // Récupération du conteneur principal (zone où les composants seront placés)
    Container c = fenetre.getContentPane();
    
    // Définition du gestionnaire de mise en page : SpringLayout
    SpringLayout springLayout = new SpringLayout();
    c.setLayout(springLayout);

    // Création des composants : deux boutons et un champ texte
    JButton b0 = new JButton("ok");
    c.add(b0);
    
    JButton b1 = new JButton("l'ombre de ta main");
    c.add(b1);
    
    JTextField b2 = new JTextField("You jumped in front of my car when you");
    c.add(b2);

    // Définition d'une contrainte constante de 100 pixels
    Spring sp = Spring.constant(100);

    // ---------- Contraintes horizontales ----------
    // Placer le bord gauche (WEST) de b0 à 5 pixels du bord gauche du conteneur
    springLayout.putConstraint(SpringLayout.WEST, b0, 5, SpringLayout.WEST, c);

    // Placer le bord gauche de b1 à 100 pixels du bord droit (EAST) de b0
    springLayout.putConstraint(SpringLayout.WEST, b1, sp, SpringLayout.EAST, b0);

    // Placer le bord gauche de b2 à 15 pixels du bord droit de b1
    springLayout.putConstraint(SpringLayout.WEST, b2, 15, SpringLayout.EAST, b1);

    // Ajuster la largeur totale du conteneur pour qu'il s'arrête 15 pixels après le bord droit de b2
    springLayout.putConstraint(SpringLayout.EAST, c, 15, SpringLayout.EAST, b2);

    // ---------- Contraintes verticales ----------
    // Aligner tous les composants horizontalement à 5 pixels du haut du conteneur
    springLayout.putConstraint(SpringLayout.NORTH, b0, 5, SpringLayout.NORTH, c);
    springLayout.putConstraint(SpringLayout.NORTH, b1, 5, SpringLayout.NORTH, c);
    springLayout.putConstraint(SpringLayout.NORTH, b2, 5, SpringLayout.NORTH, c);

    // Ajuster la hauteur de la fenêtre pour qu'elle se termine 50 pixels sous le composant le plus bas (b2)
    springLayout.putConstraint(SpringLayout.SOUTH, c, 50, SpringLayout.SOUTH, b2);

    // Ajuste automatiquement la taille de la fenêtre selon les composants et les contraintes
    fenetre.pack();

    // Rendre la fenêtre visible
    fenetre.setVisible(true);
  }

  // Méthode main : exécute le code dans le thread de l'interface graphique (bonnes pratiques Swing)
  public static void main(String[] argv) {
    SwingUtilities.invokeLater(new SpringLayoutExemple());
  }
}
