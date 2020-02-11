package structural.proxy;


// Підставляє замість реальних об'єктів спеціальні об'єкти-замінники.
// Ці об'єкти перехоплюють виклики до оригінального об'єкта, дозволяючи зробити щось до чи після передачі виклику оригіналові.
// контролюючи поведінку
public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
