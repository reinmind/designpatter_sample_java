package reinmind.adapter;

/**
 * 横幅类
 *
 * @author zx
 * @date 2020/10/28
 */
public class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }
    protected void showWithParen(){
        System.out.println("(" + string + ")");
    }
    protected void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
