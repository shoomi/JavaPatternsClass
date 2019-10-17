package creational.abstractFactory;

import creational.factoryMethod.PC;

public class NotebokFactory implements Factory{

    @Override
    public PC getPC() {
        return new Notebook("dfsf");
    }
}
