package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class SmallCoffee extends Coffee{
    @Override
    public void show() {
        System.out.print("SmallCoffee");
        sauce.show();
    }
}
