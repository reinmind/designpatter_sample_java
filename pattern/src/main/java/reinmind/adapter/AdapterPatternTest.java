package reinmind.adapter;

/**
 * @author xiang.zhang
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        SocketAdapterImpl socketAdapter = new SocketAdapterImpl();
        Volt v120 = socketAdapter.get120Volt();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        System.out.println(v120.getVolts());
        System.out.println(v3.getVolts());
        System.out.println(v12.getVolts());
    }
}
