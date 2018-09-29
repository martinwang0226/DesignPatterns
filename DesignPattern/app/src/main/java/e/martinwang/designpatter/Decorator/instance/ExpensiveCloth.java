package e.martinwang.designpatter.Decorator.instance;

import android.util.Log;

/**
 * Created by martinwang on 2018/9/29.
 */

public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    private void dressShirt() {
        Log.i("装饰模式", "穿件短袖");
    }

    private void dressLeather() {
        Log.i("装饰模式", "穿件皮衣");
    }

    private void dressJean() {
        Log.i("装饰模式", "穿件牛仔");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }


}
