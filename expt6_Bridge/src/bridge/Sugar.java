package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public class Sugar implements Sauce{
    @Override
    public void show(String name) {
        System.out.println(name + " with sugar");
    }
}
