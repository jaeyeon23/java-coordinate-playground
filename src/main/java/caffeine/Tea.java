package caffeine;

public class Tea extends CoffeineBeverage {
    void start() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    @Override
    void brew() {
        System.out.println("티백을 담군다");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가한다");
    }
}
