package reinmind.factory;

public class Cat extends Animal{
    Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("I am " + getName());
    }
}
