import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureModel model = new TemperatureModel();
            TemperatureController controller = new TemperatureController(model);

            JFrame frame = new JFrame("MVC Température");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

            frame.add(new CelsiusView(model, controller));
            frame.add(new FahrenheitView(model, controller));                      //on ajoute les vues
            frame.add(new ThermometerView(model, controller));

            frame.pack();
            frame.setVisible(true);
        });
    }
}