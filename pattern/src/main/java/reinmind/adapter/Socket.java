package reinmind.adapter;

/**
 * 产生120v电压
 * @author xiang.zhang
 */
public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
