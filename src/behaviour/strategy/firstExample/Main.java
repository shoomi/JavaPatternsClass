package behaviour.strategy.firstExample;

import java.math.BigDecimal;

// Визначає сімейство схожих алгоритмів і розміщує кожен з них у власному класі. Після цього алгоритми можна заміняти один на інший прямо під час виконання програми.
// Open-Closed SOLID principle
public class Main {
    public static void main(String[] args) {
        Discounter easterDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));
        System.out.println(Integer.valueOf(String.valueOf(easterDiscounter)));
    }
}
