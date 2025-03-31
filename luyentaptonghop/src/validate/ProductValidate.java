package validate;

import bussiness.CategoryBussiness;

import java.util.Scanner;

import static bussiness.ProductBussiness.*;
import static entity.Product.*;

public class ProductValidate {
    public static String inputProductName(Scanner sc) {
        while (true) {
            String productName = InputMethod.inputString(sc, "Enter product name: ");
            StringValidate validator = new StringValidate(100, 10);
            if (validator.isValid(productName)) {
                if (!isExitName(productName)) {
                    return productName;
                }
                System.out.println("Product name already in use");
            }
            System.out.println(validator.getErrorMessage());
        }
    }

    public static float inputImportPrice(Scanner sc) {
        while (true) {
            float importPrice = InputMethod.inputFloat(sc, "Enter product import price: ");
            if (importPrice > 0) {
                return importPrice;
            }
            System.out.println("Invalid import price (have to bigger than 0)!");
        }
    }

    public static float inputExportPrice(Scanner sc) {
        while (true) {
            float exportPrice = InputMethod.inputFloat(sc, "Enter product export price: ");
            if (exportPrice > INTEREST) {
                return exportPrice;
            }
            System.out.println("Export price have to bigger than INTEREST(1.1)");
        }
    }

    public static String inputProductDescription(Scanner sc) {
        return InputMethod.inputString(sc, "Enter product description: ");
    }

    public static String inputTitle(Scanner sc) {
        while (true) {
            String title = InputMethod.inputString(sc, "Enter product title: ");
            StringValidate validator = new StringValidate(200, 0);
            if (validator.isValid(title)) {
                return title;
            }
            System.out.println(validator.getErrorMessage());
        }
    }

    public static int inputQuantity(Scanner sc) {
        while (true) {
            int quantity = InputMethod.inputInt(sc, "Enter product quantity: ");
            if (quantity >= 0) {
                return quantity;
            }
            System.out.println("Invalid product quantity (can't be smaller than 0)");
        }
    }

    public static int inputCategoryId(Scanner sc) {
        while (true) {
            int categoryId = InputMethod.inputInt(sc, "Enter category id: ");

            if (CategoryBussiness.isCategoryExist(categoryId)) {
                return categoryId;
            }
            System.out.println("Category does not exist");
        }
    }

    public static int inputStatus (Scanner sc) {
        while (true) {
            int status = InputMethod.inputInt(sc, "Enter product status (0: Đang hoạt động - 1: Hết hàng - 2:Không hoạt động): ");
            if (status == 0 || status == 1 || status == 2) {
                return status;
            }
            System.out.println("Invalid product status (0, 1, 2)!");
        }
    }

    private static boolean isExitName(String name) {
        for (int i = 0; i < productsSize; i++) {
            if (products[i].getProductName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
