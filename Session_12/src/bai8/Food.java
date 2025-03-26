package bai8;

public class Food extends Product{

    public Food(String name, int price ) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 0.05; // 0% => 20/100 => 0.2
    }
}
