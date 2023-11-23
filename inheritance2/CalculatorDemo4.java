package inheritance2;

class Calculator {
    int left, right;

    public void setOrands(int left, int right) {
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

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
