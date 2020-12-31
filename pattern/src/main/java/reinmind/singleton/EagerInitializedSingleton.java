package reinmind.singleton;

/**
 * 饿加载，类在被加载的时候就被实例化了
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }
}
