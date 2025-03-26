package bai8;

public class Electronics extends Product{
    public Electronics(String name, int price ) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 0.1; // 0% => 20/100 => 0.2
    }
}
