import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ThermometerView extends JPanel implements PropertyChangeListener {
    private JSlider slider;

    public ThermometerView(TemperatureModel model, TemperatureController controller) {
        setLayout(new BorderLayout());
        slider = new JSlider(JSlider.VERTICAL, -20, 120, 0);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(slider, BorderLayout.CENTER);

        slider.addChangeListener(e -> {                                  //e c'est notation lambda, c'est une abbréviation 
            if (!slider.getValueIsAdjusting()) {                         //! c'est la négation de ça
                controller.setCelsius(slider.getValue());
            }
        });

        model.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        double tempC = (double) evt.getNewValue();
        slider.setValue((int) tempC);
    }
}