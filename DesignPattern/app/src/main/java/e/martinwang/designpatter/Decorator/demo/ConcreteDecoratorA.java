package e.martinwang.designpatter.Decorator.demo;

/**
 * Created by martinwang on 2018/9/29.
 * 装饰者具体实现类
 */

public class ConcreteDecoratorA extends Decorator {
    protected ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    public void operateA() {

    }

    public void operateB() {

    }
}
