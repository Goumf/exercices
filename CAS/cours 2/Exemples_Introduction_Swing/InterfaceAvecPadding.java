import javax.swing.*;
import java.awt.*;

public class InterfaceAvecPadding {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple avec GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        Container c = frame.getContentPane();
        c.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Zone bleue
        JPanel panneau = new JPanel();
        panneau.setBackground(Color.BLUE);
        panneau.setPreferredSize(new Dimension(150, 100));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;  // occupe 2 lignes
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        c.add(panneau, gbc);

        // Bouton "efface"
        JButton efface = new JButton("efface");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.ipadx = 10; // padding horizontal interne
        gbc.ipady = 10; // padding vertical interne
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.NONE;
        c.add(efface, gbc);

        // Bouton "demarre"
        JButton demarre = new JButton("demarre");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 10;
        gbc.ipady = 10;
        gbc.anchor = GridBagConstraints.NORTH;
        c.add(demarre, gbc);

        // Checkbox "relief"
        JCheckBox relief = new JCheckBox("relief");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.anchor = GridBagConstraints.WEST;
        c.add(relief, gbc);

        // Checkbox "gras"
        JCheckBox gras = new JCheckBox("gras");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        c.add(gras, gbc);

        frame.setVisible(true);
    }
}
