package behaviour.mediator.without_mediator;

public class Main {

    public static void main(String[] args) {
        Button button = new Button(new ButtonMediator());
        button.press();
        System.out.println(button.getMediator().getFan().isOn());

        button.press();
        System.out.println(button.getMediator().getFan().isOn());
    }
}
