import java.util.Observer;
import java.util.Observable;

public class View implements Observer {
    private String name;

    public View(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " a reçu la nouvelle valeur : " + arg);
    }
}