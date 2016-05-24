package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class Test {
    public static void main(String[] args){
        Coffee coffee = new JorumCoffee();
        coffee.setSauce(new Milk());
        coffee.show();

        coffee = new SmallCoffee();
        coffee.setSauce(new Lemon());
        coffee.show();

        coffee = new MediumCoffee();
        coffee.setSauce(new Sugar());
        coffee.show();
    }
}
