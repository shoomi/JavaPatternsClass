package structural.decorator;

public class SimpleEmailSender implements EmailSender {

    public String message;

    @Override
    public void send(String text) {
        this.message = text;
    }

    @Override
    public String receive() {
        return message;
    }
}
