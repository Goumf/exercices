public class TemperatureController {
    private TemperatureModel model;

    public TemperatureController(TemperatureModel model) {
        this.model = model;
    }

    public void setCelsius(double value) {                    //le controlleur, il a du pouvoir sur les valeurs des températures
        model.setCelsius(value);
    }

    public void setFahrenheit(double value) {
        model.setFahrenheit(value);
    }
}