package behaviour.chain;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public DispenseChain setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
        return chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
