package inheritance1;

class DivisionableCalcuator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo3 {
    public static void main(String[] args) {

        DivisionableCalcuator c1 = new DivisionableCalcuator();
        c1.setOrands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
}
