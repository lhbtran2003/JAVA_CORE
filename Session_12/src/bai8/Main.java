package bai8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> allProducts = new ArrayList<Product>();
        allProducts.add(new Product("product", 300));
        allProducts.add(new Clothing("áo", 50));
        allProducts.add(new Electronics("máy xay", 400));
        allProducts.add(new Food("thịt bòa", 150));

        for (Product product : allProducts) {
            System.out.println("Gía mặc định: "+product.getFinalPrice());
            System.out.println("Gía theo so lượng (dưới 100 cái): "+product.getFinalPrice(50));
            System.out.println("Gía theo so lượng (trên 100 cái): "+product.getFinalPrice(101));
            System.out.println();
        }
    }
}
