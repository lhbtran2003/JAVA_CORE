package bai8;

public class Product {
    String name;
    int price;
    double discount;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public double getDiscount() {
        return 0; // 0% => 20/100 => 0.2
    }

    public double getFinalPrice() {
        return price - price * getDiscount();
    }

    public double getDiscount(int quantity) {
        if (quantity > 100) {
            discount = 0.05;
        }
        return discount;
    }

    public double getFinalPrice(int quantity) {
        return price - price * getDiscount(quantity);
    }

}
