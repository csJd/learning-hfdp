/**
 * Created by dd on 2016/5/18.
 */
public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new AngleAdapter();
        s1.draw();
        s2.draw();
    }
}
