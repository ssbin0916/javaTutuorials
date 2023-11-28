package constant2;

enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;

    Fruit(String color) {
        System.out.println("call constant " + this);
        this.color = color;
    }

    String getColor() {
        return this.color;
    }
}

enum Company {
    GOOGLE, APPLE, ORACLE
}

public class ConstantDemo {
    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
        switch (type) {
            case APPLE:
                System.out.println(57 + " Kcal, " + Fruit.APPLE.color);
                break;
            case PEACH:
                System.out.println(34 + " Kcal, " + Fruit.PEACH.color);
                break;
            case BANANA:
                System.out.println(93 + " Kcal, " + Fruit.BANANA.color);
                break;
        }
    }
}
