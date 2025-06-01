
import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class View1 extends JLabel implements PropertyChangeListener {
    public View1() {
        super("Value=0");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int newValue = (int) evt.getNewValue();
        setText("Value=" + newValue);
    }
}
