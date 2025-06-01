import javax.swing.*;
import java.awt.*;


public class swing1 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        Container c = frame.getContentPane();
        c.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
    
           // Zone haute
        JPanel panneau_haut = new JPanel();
        panneau_haut.setLayout(new GridBagLayout());
        panneau_haut.setPreferredSize(new Dimension(600, 100));
        

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;  // occupe 1 ligne
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 0.2;
        c.add(panneau_haut, gbc);

           // Zone Basse
        JPanel panneau_bas = new JPanel();
        panneau_bas.setLayout(new GridBagLayout());
        panneau_bas.setPreferredSize(new Dimension(600, 300));
        

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;  // occupe 1 ligne
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 0.8;
        c.add(panneau_bas, gbc);

        // Zone bleue
        JPanel panneau_bleu = new JPanel();
        panneau_bleu.setBackground(new Color(64, 224, 208));
        panneau_bleu.setPreferredSize(new Dimension(500, 100));
        

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;  // occupe 1 ligne
        gbc.gridwidth = 1;
        gbc.ipadx = 0; // padding horizontal interne
        gbc.ipady = 0; // padding vertical interne
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.9;
        gbc.weighty = 1.0;
        panneau_haut.add(panneau_bleu, gbc);
        

        JPanel panneau_gris = new JPanel();
        //panneau_gris.setBackground(Color.GRAY);
        panneau_gris.setLayout(new GridBagLayout());
        panneau_gris.setPreferredSize(new Dimension(100,  100));

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;  // occupe 1 ligne
        gbc.ipadx = 0; // padding horizontal interne
        gbc.ipady = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.weightx = 0.1;
        gbc.weighty = 1.0;
        panneau_haut.add(panneau_gris, gbc);


         // Bouton "efface"
        JButton ok = new JButton("OK");
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.ipadx = 1; // padding horizontal interne
        gbc.ipady = 1; // padding vertical interne
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        panneau_gris.add(ok, gbc);

        // Bouton "demarre"
        JButton cancel = new JButton("Cancel");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        panneau_gris.add(cancel, gbc);

        JPanel panneau_gris2 = new JPanel();
        //panneau_gris2.setBackground(Color.GRAY);
        panneau_gris2.setLayout(new GridBagLayout());
        panneau_gris2.setPreferredSize(new Dimension(100,  300));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;  // occupe 1 ligne
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.1;
        gbc.weighty = 1.0;
        panneau_bas.add(panneau_gris2, gbc);

                // Checkbox "relief"
        JCheckBox choix1 = new JCheckBox("choix 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.NONE;
        panneau_gris2.add(choix1, gbc);

        // Checkbox "gras"
        JCheckBox choix2 = new JCheckBox("choix 2");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.NONE;
        panneau_gris2.add(choix2, gbc);

        JPanel panneau_blanc = new JPanel();
        panneau_blanc.setBackground(Color.WHITE);
        panneau_blanc.setLayout(new GridBagLayout());
        panneau_blanc.setPreferredSize(new Dimension(500,  300));

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;  // occupe 1 ligne
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.9;
        gbc.weighty = 1.0;
        panneau_bas.add(panneau_blanc, gbc);

        frame.setVisible(true);
    }

    }

