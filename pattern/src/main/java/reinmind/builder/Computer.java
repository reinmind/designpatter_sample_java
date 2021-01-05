package reinmind.builder;

/**
 * 1. 静态内部类Builder包含所有外部类的属性
 * 2. Builder类的构造器当中应当包含所有必填属性
 * 3. Builder当中的类应当包含可选属性的setter
 *
 * 当一个类当中包含参数过多，可以选择Builder来构造对象，
 * 构造器当中包含必填属性
 * 可选属性用setter设置
 * @author xiang.zhang
 */
public class Computer {
    // 必填属性
    private String HDD;
    private String RAM;

    // 可选属性
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsEnabled;
    }
    public static class ComputerBuilder{
        private String HDD;
        private String RAM;

        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;
        public ComputerBuilder(String ram,String hdd){
            this.HDD = hdd;
            this.RAM = ram;
        }
        public ComputerBuilder setGraphicsEnabled(boolean isGraphicsEnabled){
            this.isGraphicsEnabled = isGraphicsEnabled;
            return this;
        }
        public ComputerBuilder setBuletoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
