package behaviour.command;

// Перетворює запити на об'єкти, дозволяючи передавати їх як аргументи під час виклику методів, ставити запити в чергу, логувати їх, а також підтримувати скасування операцій.
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
