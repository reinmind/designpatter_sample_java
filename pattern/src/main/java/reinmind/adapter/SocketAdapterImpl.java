package reinmind.adapter;

/**
 * 插座提供120的电流，但是接口需要实现12的电流和3v的电流，需要电源适配器转换
 * @author xiang.zhang
 */
public class SocketAdapterImpl extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt(),40);
    }

    /**
     * 电流转化方法
     * @param input
     * @param div
     * @return 新电流
     */
    public Volt convertVolt(Volt input,int div){
        return new Volt(input.getVolts() / div);
    }
}
