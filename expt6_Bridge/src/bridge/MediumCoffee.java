package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class MediumCoffee extends Coffee{
    public MediumCoffee(Sauce sauce){
        super(sauce);
    }
    @Override
    public void show() {
        sauce.show("MediumCoffee");
    }
}
