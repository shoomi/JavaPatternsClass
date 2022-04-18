package behaviour.mediator.with_mediator;

public class Button {
    private Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }

    public Mediator getMediator() {
        return mediator;
    }
}
