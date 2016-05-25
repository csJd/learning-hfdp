/**
 * Created by dd on 2016/5/25.
 */
public class Test {
    public static void main(String args[]){
        Goat xyy = new PleasantGoat();
        xyy = new GreenApple(xyy);
        xyy = new RedApple(xyy);
        xyy = new YellowApple(xyy);
        xyy.run();
    }
}
