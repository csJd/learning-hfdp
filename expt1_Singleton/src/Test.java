/**
 * Created by dd on 2016/5/13.
 */

public class Test {

    public static void main(String[] args) {
        AppConfig configA = AppConfig.getConfig();
        AppConfig configB = AppConfig.getConfig();
        if(configA==configB){
            System.out.println("A和B是一个实例");
        }
    }
}
