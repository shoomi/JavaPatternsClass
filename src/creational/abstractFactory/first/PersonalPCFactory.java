package creational.abstractFactory.first;

public class PersonalPCFactory implements Factory  {

    @Override
    public PC getPC(){
        return new PersonalPC("dfsfdsf");
    }
}
