package reinmind.factory;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("私わ" + getName() + "です");
    }
}
