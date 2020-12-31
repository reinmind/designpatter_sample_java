package reinmind.singleton;

/**
 * 枚举的特性：
 * 1.只会被实例化一次
 * 2.全局使用
 * 3.不能自己实例化，只能懒加载
 */
public enum EnumSingleton {
    /**
     * 一个单例
     */
    INSTANCE0("hello","1"),INSTANCE1("world","2");
    private final String name;
    private final String value;
    /**
     * 枚举类的构造方法是私有的，不允许外界修改的
     * 语言特性保持了类的单例
     * **/
    EnumSingleton(String name, String value){
        this.name = name;
        this.value = value;
        System.out.println(hashCode());
    }
    public String getName(){
        return this.name;
    }
    public String getValue(){
        return this.value;
    }
}
