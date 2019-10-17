package others;

class Bard {
    public Bard() {
        System.out.println("Constructor ready");
    }
}

public class SubClass<T> {

    private Class<T> clazz;

    private SubClass(Class<T> clazz) {
        this.clazz = clazz;
    }

    private T getInstance() throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SubClass<Bard> s = new SubClass<>(Bard.class);
        s.getInstance();

    }
}
