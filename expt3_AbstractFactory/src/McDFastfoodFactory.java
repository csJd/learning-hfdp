/**
 * Created by dd on 2016/5/22.
 */
public class McDFastfoodFactory implements FastfoodFactory {
    @Override
    public Hamburg makeHamburg() {
        return new McDHamburg();
    }

    @Override
    public Cola makeCola() {
        return new McDCola();
    }
}
