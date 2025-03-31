package bussiness;

import entity.Product;

import java.util.Random;
import java.util.Scanner;

import static validate.ProductValidate.*;

public class ProductBussiness {
    public static final Product[] products = new Product[100];
    public static int productsSize = 0;

    static {
        Product product = new Product("C0001", "Chocopie", 2.2f, 3f, "a", "b", 10, 0, 0);
        products[productsSize++] = product;
    }

    // tạo 1 chuỗi id mới với điều kiện : bắt đầu bằng 1 trong 3 kí tự C, E, T
    private static String createRandomId() {
        // mảng chứa kí tự theo yêu cau
        char[] chars = {'C', 'E', 'T'};

        // dùng class Random để tạo ngẫu nhiên
        Random random = new Random();
        int randomInt = random.nextInt(10000); // tạo ngẫu nhiên từ 1 đến 9999
        int indexRandom = random.nextInt(3);
        String format = String.format("%04d", randomInt); // nếu ko đủ 4 số thì thêm số 0 phía đầu
        return chars[indexRandom] + format;
    }

    // hiển thị danh sách sản phẩm
    public static void showProducts() {
        if (productsSize == 0) {
            System.out.println("Danh sách sản phẩm trống");
            return;
        }
        for (int i = 0; i < productsSize; i++) {
            products[i].displayData();
        }
    }

    // thêm mới sản phẩm
    public static boolean addProduct(Product product) {
        if (productsSize == products.length) {
            return false;
        }

        String newId;
        do {
            newId = createRandomId();
        } while (isProductExist(newId)); // Kiểm tra xem ID đã tồn tại chưa

        product.setProductId(newId);
        products[productsSize] = product; // Thêm vào danh sách
        productsSize++;
        return true;
    }


    // cập nhật thông tin sản phẩm theo từng trường
    public static boolean updateProduct(Scanner sc, String id, int attribute) {
        if (!isProductExist(id)) {
            System.out.println("Danh mục ko tồn tại");
            return false;
        }

        for (int i = 0; i < productsSize; i++) {
            if (products[i].getProductId().equalsIgnoreCase(id)) {

                switch (attribute) {
                    case 1:
                        products[i].setProductName(inputProductName(sc));
                        break;

                    case 2:
                        products[i].setImportPrice(inputImportPrice(sc));
                        break;

                    case 3:
                        products[i].setExportPrice(inputExportPrice(sc));
                        break;

                    case 4:
                        products[i].setProductTitle(inputTitle(sc));
                        break;

                    case 5:
                        products[i].setProductDescription(inputProductDescription(sc));
                        break;

                    case 6:
                        products[i].setQuantity(inputQuantity(sc));
                        break;

                    case 7:
                        products[i].setCategoryId(inputCategoryId(sc));
                        break;

                    case 8:
                        products[i].setStatus(inputStatus(sc));
                        if (products[i].getStatus() == 1) {
                            products[i].setQuantity(0);
                        }
                        break;

                    case 0:
                        break;

                }

            }

        }
        return true;
    }

    // xóa sản phẩm
    public static boolean deleteProduct(String id) {
        if (productsSize == 0) {
            return false;
        }
        if (!isProductExist(id)) {
            return false;
        }
        for (int i = 0; i < productsSize; i++) {
            if (products[i].getProductId().equalsIgnoreCase(id)) {
                products[i] = products[i + 1];
            }
        }
        products[productsSize] = null;
        productsSize--;
        return true;
    }

    // tìm kiếm sản phẩm theo tên hoặc tiêu đề
    public static Product searchProductByNameOrTitle(String name) {
        for (int i = 0; i < productsSize; i++) {
            if (products[i].getProductName().equalsIgnoreCase(name)) {
                return products[i];
            } else if (products[i].getProductTitle().equalsIgnoreCase(name)) {
                return products[i];
            }
        }
        return null;
    }

    // tìm kiếm sản phẩm theo khoảng giá
    public static int searchProductByPrice(Product[] validProduct, float minPrice, float maxPrice) {

        validProduct = new Product[productsSize];
        int index = 0;
        for (int i = 0; i < productsSize; i++) {
            Product temp = products[i];
            if (temp.getExportPrice() >= minPrice && temp.getExportPrice() <= maxPrice) {
                validProduct[index++] = temp;
            }
        }
        return index;
    }

    // sắp xếp sản phẩm theo giá bán tăng dần
    public static void sortByExportPrice() {
        boolean swapped;
        for (int i = 0; i < productsSize - 1; i++) { // lặp tới phần tử kế cuối
            swapped = false;
            for (int j = 0; j < productsSize - i - 1; j++) {

                if (products[j].getExportPrice() > products[j + 1].getExportPrice()) {
                    // Đổi chỗ 2 phần tử
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                    swapped = true;
                }
            }
            // Nếu không có sự hoán đổi nào trong một vòng lặp, tức là mảng đã được sắp xếp
            if (!swapped) {
                break;
            }
        }
    }

    // bán sản phẩm
    public static int sellProduct(String name, int quantity) {
        if (isProductsEmpty()) return 1; // 1: danh sách rỗng

        for (int i = 0; i < productsSize; i++) {
            if (products[i].getProductName().equalsIgnoreCase(name)) {
                if (products[i].getQuantity() == 0) {
                    return 2; // không còn sản phẩm
                }
                if (products[i].getQuantity() >= quantity) {
                    products[i].setQuantity(products[i].getQuantity() - quantity);
                    return 0; // đã bán thành công
                }
            }
        }
        return 3;// bán thật bại
    }

    private static boolean isProductsEmpty() {
        if (productsSize == 0) {
            return true;
        }
        return false;
    }

    // kiểm tra sản phẩm có tồn tại ko
    public static boolean isProductExist(String id) {
        for (int i = 0; i < productsSize; i++) {
            if (products[i].getProductId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }


}
