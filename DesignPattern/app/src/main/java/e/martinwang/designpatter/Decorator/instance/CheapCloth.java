package e.martinwang.designpatter.Decorator.instance;

import android.util.Log;

/**
 * Created by martinwang on 2018/9/29.
 */

public class CheapCloth extends PersonCloth {
    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    public void dressShorts() {
        Log.i("装饰模式", "穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
