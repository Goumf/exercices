import java.util.Observable;

public class Model extends Observable {
    private int value = 0;

    public void increment() {
        value++;
        setChanged();
        notifyObservers(value);
    }
}