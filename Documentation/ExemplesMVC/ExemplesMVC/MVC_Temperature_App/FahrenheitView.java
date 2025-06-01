import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class FahrenheitView extends JPanel implements PropertyChangeListener {
    private JTextField textField;

    public FahrenheitView(TemperatureModel model, TemperatureController controller) {
        setLayout(new FlowLayout());
        add(new JLabel("Fahrenheit:"));
        textField = new JTextField(5);
        add(textField);

        JButton setButton = new JButton("Set");
        add(setButton);

        setButton.addActionListener(e -> {
            try {
                double value = Double.parseDouble(textField.getText());
                controller.setFahrenheit(value);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid number");
            }
        });

        model.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        double tempC = (double) evt.getNewValue();
        double tempF = tempC * 9 / 5 + 32;
        textField.setText(String.format("%.2f", tempF));
    }
}