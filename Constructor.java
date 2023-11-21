package practice;

class T {
    int left, right;

    public T(int left, int right) {
        this.left = left;
        this.right = right;
    }

    void sum() {
        System.out.println(this.left + this.right);
    }

    void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class Constructor {

    public static void main(String[] args) {
        T t1 = new T(10, 20);
        t1.sum();
        t1.avg();

        T t2 = new T(20, 40);
        t2.sum();
        t2.avg();
    }
}