package ra.validate;

import ra.businessImp.Product;
import ra.run.ProductManager;

import java.util.Scanner;

public class ProductValidator {
    public static final String ERROR_EXPORT_PRICE = "Gía bán phải cao hơn giá nhập vào";
    public static String inputProductName (Scanner sc, int size) {
        while (true) {
            String productName = InputMethod.inputString(sc, "Enter Product Name");
            if(!exitByName(productName, size)) {
                return productName;
            }
            System.err.println("Tên sản phẩm đã tồn tại vui lòng nhập tên khác");
        }
    }

    public static float inputImportPrice(Scanner sc) {
        while (true) {
            float importPrice = InputMethod.inputFloat(sc, "Enter Import Price");
            if (importPrice > 0) {
                return importPrice;
            }
            System.out.println(InputMethod.ERROR_FLOAT);
        }
    }

    public static float inputExportPrice(Scanner sc, float importPrice) {
        while (true) {
            float exportPrice = InputMethod.inputFloat(sc, "Enter Export Price");
            if (exportPrice > importPrice) {
                return exportPrice;
            }
            System.out.println(ERROR_EXPORT_PRICE);
        }
    }
    private static boolean exitByName (String name, int size) {
        for ( int i = 0; i < size; i++) {
            if (ProductManager.products[i].getProductName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }


}
