package builder;

/**
 * Created by dd on 2016/5/24.
 */
public class Test {
    public static void main(String[] args) {
        CarDirector director = new CarDirector("BenZ");
        director.constractCar().show();

        director = new CarDirector("BMW");
        director.constractCar().show();
    }
}
