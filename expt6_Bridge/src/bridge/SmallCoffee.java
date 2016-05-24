package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class SmallCoffee extends Coffee{
    public SmallCoffee(Sauce sauce){
        super(sauce);
    }

    @Override
    public void show() {
        sauce.show("SmallCoffee");
    }
}
