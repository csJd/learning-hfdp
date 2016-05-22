/**
 * Created by dd on 2016/5/22.
 */
public class KFCFastfoodFactory implements FastfoodFactory {
    @Override
    public Hamburg makeHamburg() {
        return new KFCHamburg();
    }

    @Override
    public Cola makeCola() {
        return new KFCCola();
    }
}
