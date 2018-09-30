package e.martinwang.designpatter.ProxyPattern.demo;

import android.util.Log;

/**
 * Created by martinwang on 2018/9/29.
 * 真实主题类
 */

public class RealSubject extends Subject {
    @Override
    public void visit(){
        Log.i("代理模式","Real Subject!");
    }


}
