package behaviour.memento.memento2;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private String state;
    public static List<Memento> mementoList = new ArrayList<>();

    public Memento(String state) {
        this.state = state;
    }

    public static void save(String state) {
        mementoList.add(new Memento(state));
    }

    public static String getItem(int backUpItem) {
        return mementoList.get(mementoList.size() - backUpItem).getState();
    }

    public String getState() {
        return state;
    }
}
