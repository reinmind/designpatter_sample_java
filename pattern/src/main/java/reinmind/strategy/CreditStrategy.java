package reinmind.strategy;

public class CreditStrategy implements PaymentStrategy{
    String name;
    String cardNumber;
    String cvv;
    String dateOfExpiry;

    public CreditStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}
