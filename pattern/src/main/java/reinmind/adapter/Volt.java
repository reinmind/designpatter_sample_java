package reinmind.adapter;

/**
 * 计量电压的单位
 * @author xiang.zhang
 */
public class Volt {
    private int volts;
    public Volt(int v){
        this.volts = v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
