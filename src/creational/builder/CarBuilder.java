package creational.builder;

public abstract class CarBuilder<T> {

    public T t;

    public void createInstance(Class clazz) {
        try {
            t = (T) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public T getCar() {
        return t;
    }

    abstract void setColor();
    abstract void setEngine();
    abstract void setSpeed();

}
