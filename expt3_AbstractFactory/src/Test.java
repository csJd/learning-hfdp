/**
 * Created by dd on 2016/5/22.
 */
public class Test {
    public static void main(String[] args) {
        Cola cola;
        Hamburg hamburg;
        FastfoodFactory factory = new KFCFastfoodFactory();
        cola = factory.makeCola();
        hamburg = factory.makeHamburg();
        cola.show();
        hamburg.show();

        factory = new McDFastfoodFactory();
        cola = factory.makeCola();
        hamburg = factory.makeHamburg();
        cola.show();
        hamburg.show();
    }
}
