package structural.decorator;

public class CryptoEmailSender extends EmailDecorator {

    public CryptoEmailSender(EmailSender emailSender) {
        super(emailSender);
    }

    @Override
    public void send(String text) {
        super.send(encript(text));
    }

    @Override
    public String receive() {
        return decode(super.receive());
    }

    private String encript(String text) {
        return text + " ENCRIPTED";
    }

    private String decode(String text) {
        return text + " decriped";
    }
}
