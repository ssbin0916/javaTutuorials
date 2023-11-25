package abstractclass2;

abstract class A {
    public abstract int b();

    public void d() {
        System.out.println("world");
    }
}

class B extends A {
    public int b() {
        return 1;
    }
}

public class AbstractDemo1 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
    }
}
