package creational.abstractFactory.first;

public class ClientAbstractFactory {

    Factory factory;

    public ClientAbstractFactory(Factory factory) {
        this.factory = factory;
    }

    public PC getPCInstance() {
        return factory.getPC();
    }
}
