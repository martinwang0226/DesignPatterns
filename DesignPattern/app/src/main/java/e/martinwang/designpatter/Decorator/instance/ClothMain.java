package e.martinwang.designpatter.Decorator.instance;

/**
 * Created by martinwang on 2018/9/29.
 */

public class ClothMain {
    public static void main(String[] args){
        Person person = new Boy();
        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();
        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
