
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private Model model;

    public Controller(Model m) {
        this.model = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setValeur(model.getValeur() + 1);
    }
}
