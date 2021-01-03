package reinmind.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;
    public ShoppingCart(){
        itemList = new ArrayList<>();
    }
    public void addItem(Item item){
        this.itemList.add(item);
    }
    public void removeItem(Item item){
        this.itemList.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for(Item item:itemList){
            sum += item.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new CreditStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
    }
}
