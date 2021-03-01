package behaviour.memento.memento2;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("first");
        originator.setState("second");
        originator.save();
        originator.setState("third");
        originator.save();
        originator.setState("tyyytergfdg");
        originator.backUp(2);
        System.out.println(originator.getState());
    }
}
