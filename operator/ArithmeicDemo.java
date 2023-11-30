package operator;

import java.io.FilterOutputStream;

public class ArithmeicDemo {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 2;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result + 8;
        result = result % 7;
        System.out.println(result);
    }
}
