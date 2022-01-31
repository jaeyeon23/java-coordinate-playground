package caffeine;

public abstract class CoffeineBeverage {
    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("물을 끓인다");
    }

    public void pourInCup() {
        System.out.println("물을 붓는다");
    }
}
