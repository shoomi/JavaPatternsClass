package others;

import java.util.Objects;

class A {
    A(int g) {
        System.out.println("констр. А з " + g);
    }

    {
        System.out.println("ААА");
    }
}

public class B {

    public int age = 10;

    {
        System.out.println("ВВВ");
    }

    B() {
        System.out.println("констр. others.B");
    }


    A a = new A(2);

    public B(int age) {
        this.age = age;
    }

    static A s1 = new A(1);                          // спочатку обробляються static (і тільки раз), constans and blocks потім non-tatic, а потім constructor (всередині main у даному випадку)
    static A s2 = new A(4);                              /// не потрібно створювати екземпляр класу others.B аби ініціалізувалися s1 та s2

    public static void main(String[] args) {
        System.out.println("Виконання всередині main");
        B b = new B();                                    // new others.B(); в середині main можна ініціалізувати екземпляр класу без надання йому назви
        A a = new A(3);                             // new others.A(3);
    }

    @Override
    public String toString() {
        return "others.B{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return age == b.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, a);
    }
}
