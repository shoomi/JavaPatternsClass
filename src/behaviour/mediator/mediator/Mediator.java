package behaviour.mediator.mediator;

public interface Mediator {
    void send(String message, Colleague colleague);
}
