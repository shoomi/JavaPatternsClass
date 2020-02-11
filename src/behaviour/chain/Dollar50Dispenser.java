package behaviour.chain;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public DispenseChain setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
        return chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50){
            int num = cur.getAmount()/50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
