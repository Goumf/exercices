
import javax.swing.*;
import java.awt.*;

public class ActiveMVC implements Runnable {
    public void run() {
        Model model = new Model(0);
        View1 view1 = new View1();
        View1 view2 = new View1();

        model.addPropertyChangeListener(view1);
        model.addPropertyChangeListener(view2);

        Controller controller = new Controller(model);
        JButton button = new JButton("+1");
        button.addActionListener(controller);

        JFrame frame = new JFrame("MVC Actif (moderne)");
        frame.setLayout(new FlowLayout());
        frame.add(view1);
        frame.add(view2);
        frame.add(button);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        new javax.swing.Timer(1000, e -> model.setValeur(model.getValeur() + 1)).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ActiveMVC());
    }
}
