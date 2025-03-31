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
    public static void updateProduct(Scanner sc, String id) {
        if (!isProductExist(id)) {
            System.out.println("Danh mục ko tồn tại");
            return;
        }

        for (int i = 0; i < productsSize; i++) {
            if (products[i].getProductId().equalsIgnoreCase(id)) {

                while (true) {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Nếu muốn kết thúc quá trình cap nhat, vui lòng nhập số 0");
                    System.out.print("Nhập mục muốn chỉnh sửa (name, import price, export price, title, description, quantity, category id, status): ");
                    String choice = sc.nextLine();

                    switch (choice) {
                        case "name":
                            products[i].setProductName(inputProductName(sc));
                            System.out.println("Đã thay đổi tên sản phẩm.");
                            break;

                        case "import price":
                            products[i].setImportPrice(inputImportPrice(sc));
                            System.out.println("Đã thay đổi giá nhập sản phẩm.");
                            break;

                        case "export price":
                            products[i].setExportPrice(inputExportPrice(sc));
                            System.out.println("Đã thay giá bán sản phẩm.");
                            break;

                        case "title":
                            products[i].setProductTitle(inputTitle(sc));
                            System.out.println("Đã thay đổi tiêu đề spham.");
                            break;

                        case "description":
                            products[i].setProductDescription(inputProductDescription(sc));
                            System.out.println("Đã thay đổi mo tả sản phẩm");
                            break;

                        case "quantity":
                            products[i].setQuantity(inputQuantity(sc));
                            System.out.print("Done: ");
                            break;

                        case "category id":
                            products[i].setCategoryId(inputCategoryId(sc));
                            System.out.print("Done: ");
                            break;

                        case "status":
                            products[i].setStatus(inputStatus(sc));
                            if (products[i].getStatus() == 1) {
                                products[i].setQuantity(0);
                            }
                            System.out.print("Done.");
                            break;

                        case "0":
                            return;

                        default:
                            System.out.println("Không hợp lệ");
                            System.out.println("Nếu muốn kết thúc quá trình cap nhat, vui lòng nhập số 0");
                    }
                }
            }

        }
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
                products[i] = products[i+1];
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
    public static boolean sellProduct (String name, int quantity) {
        if (productsSize == 0) {
            System.out.println("Danh sách trống");
            return false;
        }
        for (int i = 0; i < productsSize; i++) {
            if (products[i].getProductName().equalsIgnoreCase(name)) {
                if (products[i].getQuantity() == 0) {
                    System.out.println("Không còn sản phẩm!");
                    return false;
                }
                if (products[i].getQuantity() >= quantity) {
                    products[i].setQuantity(products[i].getQuantity() - quantity);
                    return true;
                }
            }
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
