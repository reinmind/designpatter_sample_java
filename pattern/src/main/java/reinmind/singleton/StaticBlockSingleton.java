package reinmind.singleton;

/**
 * 静态代码块实例化单例
 */
public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;
    private StaticBlockSingleton(){
    }
    static{
        try{
            INSTANCE  = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("创建单例的时候发生错误");
        }
    }

    /**
     * 获取实例的方法是动态的
     * @return INSTANCE
     */
    public StaticBlockSingleton getInstance(){
        return INSTANCE;
    }


}
