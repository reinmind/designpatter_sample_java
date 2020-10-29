package reinmind.adapter;

/**
 * 打印横幅实体类
 * PrintBanner类是Print以及Banner的组装类，使用了Banner的方法，实现了Print的接口
 * @author zx
 * @date 2020/10/28
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }


    @Override
    public void printWeak() {
        //从Banner继承得到的用括号打印的方法
        showWithParen();
    }

    @Override
    public void printStrong() {
        //从Banner继承得到的用星号打印的方法
        showWithAster();
    }
}
