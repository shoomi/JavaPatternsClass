package creational.abstractFactory.first;

public class NotebokFactory implements Factory{

    @Override
    public PC getPC() {
        return new Notebook("dfsf");
    }
}
