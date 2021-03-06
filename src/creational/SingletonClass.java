package creational;

public class SingletonClass {
    private static volatile SingletonClass singletonClassp;

    private SingletonClass() {
    }

    {
        System.out.println("instance of the singleton has benn created");
    }


    public static SingletonClass getInstance() {
        if (singletonClassp == null) {
            synchronized (SingletonClass.class) {
                if (singletonClassp == null) {
                    singletonClassp = new SingletonClass();
                }
            }
        }
        return singletonClassp;
    }

    public static void main(String[] args) {
        SingletonClass.getInstance();
        SingletonClass.getInstance();
        SingletonClass.getInstance();
    }
}
