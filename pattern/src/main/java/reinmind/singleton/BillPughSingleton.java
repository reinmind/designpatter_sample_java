package reinmind.singleton;

/**
 * 当太多线程存在时，Java1.5之前也会有线程安全问题
 */
public class BillPughSingleton {
    private BillPughSingleton(){}
    /**
     * 直接在Helper类中创建一个不可修改的单例，类也是饿加载
     */
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
