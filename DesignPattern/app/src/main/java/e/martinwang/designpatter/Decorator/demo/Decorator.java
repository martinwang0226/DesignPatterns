package e.martinwang.designpatter.Decorator.demo;

import e.martinwang.designpatter.Decorator.demo.Component;

/**
 * Created by martinwang on 2018/9/29.
 */

public abstract class Decorator extends Component {
    private Component component;


    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate(){
        component.operate();
    }
}
