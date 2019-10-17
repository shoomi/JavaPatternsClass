package creational.factoryMethod;

public class FactoryMethod {
    public PC getNotebook() {
        return new Notebook();
    }
    public PC getPersonalPC() {
        return new PersonalPC();
    }
}
