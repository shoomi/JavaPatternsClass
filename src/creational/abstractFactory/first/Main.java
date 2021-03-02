package creational.abstractFactory.first;

// Дає змогу створювати сімейства пов’язаних об’єктів, не прив’язуючись до конкретних класів створюваних об’єктів.
// абстрактна фабрина знає лише абстрактний тип обєкта, який вона вертає
// метод, який вертає різні обєкти має одну і ту ж назву
// тип фабрики, яка інжектиться в абстрактну фабрику вибирається на осонові оточення чи конфігурації
public class Main {

    public static void main(String[] args) {
        NotebokFactory notebokFactory = new NotebokFactory();
        ClientAbstractFactory clf = new ClientAbstractFactory(notebokFactory);
        PC notebook = clf.getPCInstance();
        notebook.calculate();
    }
}
