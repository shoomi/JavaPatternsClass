package creational.abstractFactory.first;

public class Notebook implements PC {

    public String name;

    public Notebook(String name) {
        this.name = name;
    }

    @Override
    public void calculate() {
        System.out.println("dfsfdsfdsfdsfdsfsdfdsfdsfdsfdsf " + this.name);
    }
}
