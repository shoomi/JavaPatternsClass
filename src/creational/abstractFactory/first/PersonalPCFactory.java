package creational.abstractFactory.first;

import creational.factoryMethod.PC;

public class PersonalPCFactory implements Factory  {

    @Override
    public PC getPC(){
        return new PersonalPC("dfsfdsf");
    }
}
