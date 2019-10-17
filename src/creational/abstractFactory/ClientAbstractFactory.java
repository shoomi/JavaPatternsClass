package creational.abstractFactory;

import creational.factoryMethod.PC;

public class ClientAbstractFactory {

    Factory factory;

    public ClientAbstractFactory(Factory factory) {
        this.factory = factory;
    }

    public PC getPCInstance() {
        return factory.getPC();
    }
}
