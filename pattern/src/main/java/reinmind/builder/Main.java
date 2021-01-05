package reinmind.builder;

/**
 * @author xiang.zhang
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("2GB","500GB")
                .setBuletoothEnabled(true)
                .setGraphicsEnabled(true)
                .build();
    }
}
