package e.martinwang.designpatter.Decorator.instance;

import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Created by martinwang on 2018/9/29.
 */

public class Boy extends Person {
    @Override
    public void dressed(){
        Log.i("装饰模式","穿了内衣内裤");
    }
}
