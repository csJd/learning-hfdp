package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class JorumCoffee extends Coffee {
    @Override
    public void show() {
        System.out.print("JorumCoffee");
        sauce.show();
    }
}
