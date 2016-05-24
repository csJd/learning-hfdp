package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class JorumCoffee extends Coffee {
    public JorumCoffee(Sauce sauce){
        super(sauce);
    }
    @Override
    public void show() {
        sauce.show("JorumCoffee");
    }
}
