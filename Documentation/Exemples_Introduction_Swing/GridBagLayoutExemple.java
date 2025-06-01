import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExemple {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Définir le layout du conteneur principal
        Container c = frame.getContentPane();
        c.setLayout(new GridBagLayout());

        // Objet contenant les contraintes de placement
        GridBagConstraints gbc = new GridBagConstraints();

        // Premier bouton à la position (0, 0)
        gbc.gridx = 0;  // colonne
        gbc.gridy = 0;  // ligne
        c.add(new JButton("Bouton 1"), gbc);

        // Deuxième bouton à la position (1, 0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        c.add(new JButton("Bouton 2"), gbc);

        // Troisième bouton à la position (0, 1) et qui s'étend sur 2 colonnes
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // fusionne deux colonnes
        gbc.fill = GridBagConstraints.HORIZONTAL; // s'étire horizontalement
        c.add(new JButton("Bouton large"), gbc);

        frame.setVisible(true);
    }
}
