package reinmind.strategy;

public class PaypalStrategy implements PaymentStrategy{
    /**
     * 此处省略策略细节
     */
    String email;
    String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Paypal.");
    }
}
