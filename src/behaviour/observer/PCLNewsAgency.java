package behaviour.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// observer is deprecated from java 9, instead it use PropertyChangeListener
public class PCLNewsAgency {
    private String someValue;

    private PropertyChangeSupport support;

    public String getSomeValue() {
        return someValue;
    }

    public PCLNewsAgency() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setSomeValue(String value) {
        support.firePropertyChange("", this.someValue, value);
        this.someValue = value;
    }
}
