package structural.decorator;

public class EmailDecorator implements EmailSender {

    EmailSender emailSender;

    public EmailDecorator(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void send(String text) {
        emailSender.send(text);
    }

    @Override
    public String receive() {
        return emailSender.receive();
    }


}
