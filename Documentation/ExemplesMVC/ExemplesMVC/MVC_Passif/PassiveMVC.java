import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Model {
    private int value;
    public Model(int value) { this.value = value; }
    public int getValeur() { return value; }
    public void setValeur(int value) { this.value = value; }
}

interface View {
    void update(Model m);
}

class View1 extends JLabel implements View {
    public View1() {
        super("Value=0");
    }

    public void update(Model m) {
        setText("Value=" + m.getValeur());
    }
}

class Controller implements ActionListener {
    private Model model;
    private List<View> views = new ArrayList<>();

    public Controller(Model model) {
        this.model = model;
    }

    public void addView(View v) {
        if (!views.contains(v)) {
            views.add(v);
            v.update(model);
        }
    }

    public void actionPerformed(ActionEvent e) {
        model.setValeur(model.getValeur() + 1);
        for (View v : views) {
            v.update(model);
        }
    }
}

public class PassiveMVC implements Runnable {
    public void run() {
        Model model = new Model(0);
        JFrame frame = new JFrame("MVC Example");
        View1 view1 = new View1();
        View1 view2 = new View1();
        View1 view3 = new View1();
        JButton incrementButton = new JButton("+1");

        Controller controller = new Controller(model);
        controller.addView(view1);
        controller.addView(view2);
        controller.addView(view3);
        incrementButton.addActionListener(controller);

        frame.setLayout(new FlowLayout());
        frame.add(view1);
        frame.add(view2);
        frame.add(view3);
        frame.add(incrementButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new PassiveMVC());
    }
}
