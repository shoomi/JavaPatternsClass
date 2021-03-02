package creational.abstractFactory.first;

public class PersonalPC implements PC {

    public String name;

    public PersonalPC(String name) {
        this.name = name;
    }

    @Override
    public void calculate() {
        System.out.println("Personal pc calculate");
    }


}
