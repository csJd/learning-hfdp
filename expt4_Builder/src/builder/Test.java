package builder;

/**
 * Created by dd on 2016/5/24.
 */
public class Test {
    public static void main(String[] args) {
        CarDirecter directer = new CarDirecter("BenZ");
        directer.constractCar().show();

        directer = new CarDirecter("BMW");
        directer.constractCar().show();
    }
}
