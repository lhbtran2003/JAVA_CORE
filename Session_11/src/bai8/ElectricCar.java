package bai8;

public class ElectricCar extends Car implements Refuelable{
    String name;
    int publishYear;
    double price;

    public ElectricCar(String name, int publishYear, double price) {
        this.name = name;
        this.publishYear = publishYear;
        this.price = price;
    }

    @Override
    void start () {
       System.out.printf("Xe điện %s (Năm SX: %d, Gía $%.2f) đã khởi động không tiếng ồn\n", name, publishYear, price);
    }
    @Override
    void stop () {
       System.out.printf("Xe điện %s (Năm SX: %d, Gía $%.2f) đã dừng và ngắt kết nối động cơ.\n", name, publishYear, price);
    }
    @Override
    public void refuel () {
       System.out.printf("Xe điện %s (Năm SX: %d, Gía $%.2f) đang sạc điện…\n", name, publishYear, price);
    }

}
