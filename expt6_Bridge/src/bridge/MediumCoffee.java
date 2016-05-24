package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class MediumCoffee extends Coffee{
    @Override
    public void show() {
        System.out.print("MediumCoffee");
        sauce.show();
    }
}
