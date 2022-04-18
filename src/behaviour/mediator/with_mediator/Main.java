package behaviour.mediator.with_mediator;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.press();
        System.out.println(button.getFan().isOn());

        button.press();
        System.out.println(button.getFan().isOn());
    }
}
