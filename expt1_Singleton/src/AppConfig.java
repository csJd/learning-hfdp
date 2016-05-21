/**
 * Created by dd on 2016/5/13.
 */

public class AppConfig {
    private String paramterA;
    private static AppConfig config = null;

    public String getParamterA() {
        return paramterA;
    }

    public void setParamterA(String paramterA) {
        this.paramterA = paramterA;
    }

    private AppConfig(){}

    public static AppConfig getConfig(){
        if(config == null) config = new AppConfig();
        return config;
    }
}
