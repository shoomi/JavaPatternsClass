package behaviour.chain;

public interface DispenseChain {

    DispenseChain setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
