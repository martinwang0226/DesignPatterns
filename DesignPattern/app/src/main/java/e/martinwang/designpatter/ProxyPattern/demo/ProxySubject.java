package e.martinwang.designpatter.ProxyPattern.demo;

/**
 * Created by martinwang on 2018/9/29.
 * 代理类
 */

public class ProxySubject extends Subject {
    private RealSubject mSubject;

    public ProxySubject(RealSubject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void visit() {
        mSubject.visit();
    }

}
