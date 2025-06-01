
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Model {
    private int valeur;
    private PropertyChangeSupport support;

    public Model(int v) {
        this.valeur = v;
        this.support = new PropertyChangeSupport(this);
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int v) {
        int old = this.valeur;
        this.valeur = v;
        support.firePropertyChange("valeur", old, v);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}
