package reinmind.factory;

/**
 * 工厂模式根据输入来生产组件
 */
public abstract class Animal {
    private String name;
    public abstract void say();
    Animal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
