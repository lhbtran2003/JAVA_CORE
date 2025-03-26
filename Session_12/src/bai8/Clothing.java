package bai8;

public class Clothing extends Product{

    public Clothing(String name, int price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 0.2; // 0% => 20/100 => 0.2
    }

}
