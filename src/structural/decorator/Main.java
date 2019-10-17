package structural.decorator;

// Дає змогу динамічно додавати об'єктам нову функціональність, загортаючи їх у своєрідні класи «обгортки»
public class Main {

    public static void main(String[] args) {

        SimpleEmailSender apl = new SimpleEmailSender();
        apl.send("message");
        System.out.println(apl.receive());

        CryptoEmailSender sender = new CryptoEmailSender(apl);
        sender.send("message");
        System.out.println(sender.receive());
    }
}
