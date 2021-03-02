package behaviour.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {

    public Map<String, String> computerParts = new HashMap();
    public List<String> motherboardSetupStatus = new ArrayList<>();

    public final Computer buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return new Computer(computerParts);
    }

    public abstract void addMotherboard();
    public abstract void setupMotherboard();
    public abstract void addProcessor();

}