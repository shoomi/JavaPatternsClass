package others.threds;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter, "waiter").start();

        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();

        List <String> list = Arrays.asList("others.B", "G", "K", "L", "S", "Y");

        String min = list.stream().min(Comparator.comparing(String::valueOf)).get();
        System.out.println("Stream.min():- " + min);

        String max = list.stream().max(Comparator.comparing(x-> String.valueOf(x))).get();
        System.out.println("Stream.max():- " + max);

        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }

}
