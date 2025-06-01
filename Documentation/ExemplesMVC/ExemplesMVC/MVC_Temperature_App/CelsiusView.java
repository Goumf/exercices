import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CelsiusView extends JPanel implements PropertyChangeListener {
    private JTextField textField;

    public CelsiusView(TemperatureModel model, TemperatureController controller) {
        setLayout(new FlowLayout());
        add(new JLabel("Celsius:"));
        textField = new JTextField(5);
        add(textField);

        JButton setButton = new JButton("Set");
        add(setButton);

        setButton.addActionListener(e -> {
            try {
                double value = Double.parseDouble(textField.getText());
                controller.setCelsius(value);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid number");
            }
        });

        model.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        double tempC = (double) evt.getNewValue();
        textField.setText(String.format("%.2f", tempC));
    }
}