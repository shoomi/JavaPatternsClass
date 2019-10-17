package creational.abstractFactory;

import creational.factoryMethod.PC;

// Дає змогу створювати сімейства пов’язаних об’єктів, не прив’язуючись до конкретних класів створюваних об’єктів.
public class Main {

    public static void main(String[] args) {
        NotebokFactory notebokFactory = new NotebokFactory();
        ClientAbstractFactory clf = new ClientAbstractFactory(notebokFactory);
        PC notebook = clf.getPCInstance();
        notebook.calculate();


    }
}
