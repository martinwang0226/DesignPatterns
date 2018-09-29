package e.martinwang.designpatter.Decorator.instance;

/**
 * Created by martinwang on 2018/9/29.
 */

public abstract class PersonCloth extends Person{
    protected Person mPerson;
    public PersonCloth(Person mPerson){
        this.mPerson = mPerson;
    }

    @Override
    public void dressed(){
        mPerson.dressed();
    }
}
