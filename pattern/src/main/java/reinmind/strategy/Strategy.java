package reinmind.strategy;

/**
 * @author zx
 */
public interface Strategy {
    /**
     * 下次所采用的策略
     * @return Hand
     */
    Hand nextHand();

    /**
     * win的值改变策略
     * @param win
     */
    void study(boolean win);
}
