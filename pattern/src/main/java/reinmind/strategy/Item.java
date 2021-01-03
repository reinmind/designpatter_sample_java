package reinmind.strategy;

public class Item {
    String upCode;
    int price;

    public Item(String upCode, int price) {
        this.upCode = upCode;
        this.price = price;
    }

    public String getUpCode() {
        return upCode;
    }

    public int getPrice() {
        return price;
    }

}
