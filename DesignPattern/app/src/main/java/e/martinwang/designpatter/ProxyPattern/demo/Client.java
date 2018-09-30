package e.martinwang.designpatter.ProxyPattern.demo;

/**
 * Created by martinwang on 2018/9/30.
 */

public class Client {
    public static void main(String[] args){
        RealSubject real = new RealSubject();
        ProxySubject proxy=new ProxySubject(real);
        proxy.visit();
    }

}
