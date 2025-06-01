import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TemperatureModel {
    private double temperatureCelsius;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public double getCelsius() {
        return temperatureCelsius;
    }

    public void setCelsius(double temp) {
        double old = this.temperatureCelsius;
        this.temperatureCelsius = temp;
        support.firePropertyChange("temperature", old, temp);
    }

    public double getFahrenheit() {
        return temperatureCelsius * 9 / 5 + 32;
    }

    public void setFahrenheit(double tempF) {
        setCelsius((tempF - 32) * 5 / 9);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}