package e.martinwang.designpatter.Decorator.demo;

import e.martinwang.designpatter.Decorator.demo.Component;
import e.martinwang.designpatter.Decorator.demo.ConcreteComponent;
import e.martinwang.designpatter.Decorator.demo.ConcreteDecoratorA;
import e.martinwang.designpatter.Decorator.demo.Decorator;

/**
 * Created by martinwang on 2018/9/29.
 */

public class DecoratorMain {
    public static void main(String[] args){
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecoratorA(component);
        decorator.operate();
    }
}
