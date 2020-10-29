package reinmind.adapter;

/**
 * 主类
 *
 * @author zx
 * @date 2020/10/28
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("HelloWorld");
        new Main().print(printBanner);
    }

    private void print(Print print){
        print.printStrong();
        print.printWeak();
    }
}
