package reinmind.strategy.impl;

import reinmind.strategy.Hand;
import reinmind.strategy.Strategy;

import java.util.Random;

/**
 * 取胜策略1:WinningStrategy
 *
 * @author zx
 * @date 2020/10/27
 */
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;
    public WinningStrategy(int seed){
        random = new Random(seed);
    }
    @Override
    public Hand nextHand(){
        if(!won){
            //如果没赢，就从1,2,3三个整数中随机选取一个数
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }
    @Override
    public void study(boolean win){
        won = win;
    }
}
