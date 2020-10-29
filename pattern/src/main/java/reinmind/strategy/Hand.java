package reinmind.strategy;

/**
 * 决策工具
 *
 * @author zx
 * @date 2020/10/27
 */
public class Hand {
    //石头
    public static final int HANDVALUE_GUU = 0;
    //剪刀
    public static final int HANDVALUE_CHO = 1;
    //布
    public static final int HANDVALUE_PAA = 2;

    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };
    private static final String name[] = {
            "石头","剪刀","布",
    };
    private int handvalue;
    private Hand(int handvalue){
        this.handvalue = handvalue;
    }

    /**
     * 根据手势值获取对应的实例
     * @param handvalue
     * @return
     */
    public static Hand getHand(int handvalue){
        return hand[handvalue];
    }

    /**
     * 如果赢了h则返回true
     * @param h
     * @return
     */
    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }

    /**
     * tie 0,win 1,loss -1
     * @param h
     * @return
     */
    private int fight(Hand h){
        if(this == h){
            return 0;
        }else if((this.handvalue + 1)% 3 == h.handvalue){
            return 1;
        }else{
            return -1;
        }
    }

    /**
     * 返回当前手势的值
     * @return
     */
    @Override
    public String toString(){
        return name[handvalue];
    }
}
