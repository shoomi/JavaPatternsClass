package behaviour.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

    private String news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    private void setNews(String newValue) {
        this.news = newValue;
    }

    public String getNews() {
        return this.news;
    }
}
