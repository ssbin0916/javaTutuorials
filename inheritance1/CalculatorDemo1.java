package inheritance1;

class Calculator {
    int left, right;

    public void setOrands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public void Substract() {
        System.out.println(this.left - this.right);
    }
}
public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOrands(10, 20);
        c1.sum();
        c1.avg();
        c1.Substract();
    }
}