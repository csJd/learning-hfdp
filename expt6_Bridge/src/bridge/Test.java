package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class Test {
    public static void main(String[] args){
        Sauce milk = new Milk();
        Sauce lemon = new Lemon();
        Sauce sugar = new Sugar();

        Coffee coffee = new JorumCoffee(milk);
        coffee.show();

        coffee = new SmallCoffee(lemon);
        coffee.show();

        coffee = new MediumCoffee(sugar);
        coffee.show();
    }
}
