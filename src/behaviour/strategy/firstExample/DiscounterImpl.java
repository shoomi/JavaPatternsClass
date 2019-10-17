package behaviour.strategy.firstExample;


import java.math.BigDecimal;

public class DiscounterImpl {
    public static class EasterDiscounter implements Discounter {
        @Override
        public BigDecimal applyDiscount(final BigDecimal amount) {
            return amount.multiply(BigDecimal.valueOf(0.5));
        }
    }

    public static class ChristmasDiscounter implements Discounter {
        @Override
        public BigDecimal applyDiscount(final BigDecimal amount) {
            return amount.multiply(BigDecimal.valueOf(0.9));
        }
    }

}
