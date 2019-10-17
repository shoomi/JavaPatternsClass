package behaviour.strategy.thirdExample;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new Strategy1());
        context.executeTheStrategy();
        context = new Context(new Strategy2());
        context.executeTheStrategy();
    }
}
