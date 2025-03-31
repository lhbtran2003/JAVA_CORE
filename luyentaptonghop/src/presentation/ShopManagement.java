package presentation;

import entity.Category;
import entity.Product;

import java.util.Scanner;

import static bussiness.CategoryBussiness.*;
import static bussiness.ProductBussiness.*;

public class ShopManagement {
    public static void showMainMenu() {
        System.out.println("************SHOP MENU************");
        System.out.println("1. Quản lí danh muc");
        System.out.println("2. Quản lí sản phẩm");
        System.out.println("3. Thoát");
    }

    public static void showCategoryMenu(Scanner sc) {
        while (true) {
            System.out.println("************CATEGORY MENU************");
            System.out.println("1. Danh sách danh mục");
            System.out.println("2. Thêm mới danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục theo tên");
            System.out.println("6. Thoát");

            System.out.print("Your choice: ");
            byte choiceInCategory = Byte.parseByte(sc.nextLine());
            switch (choiceInCategory) {
                case 1:
                    showCategories();
                    break;
                case 2:
                    Category category = new Category();
                    inputDataCategory(category, sc);
                    addCategory(category);
                    break;
                case 3:
                    showCategories();
                    int categoryId1 = getIdCategoryChoosed(sc, "Nhập id của danh mục bạn muốn cập nhật");
                    updateCategory(sc, categoryId1);
                    break;
                case 4:
                    showCategories();
                    int categoryId2 = getIdCategoryChoosed(sc, "Nhập id của danh mục bạn muốn xóa");
                    boolean isDeleted = deleteCategory(categoryId2);
                    if (isDeleted) {
                        System.out.println("Xóa danh mục có id = " + categoryId2 + " thành công");
                    } else {
                        System.out.println("Danh mục có id = " + categoryId2 + " không tồn tại");
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên danh mục muốn tìm");
                    String nameSearched = sc.nextLine();
                    Category cat = searchCategoryByName(nameSearched);
                    if (cat == null) {
                        System.out.println("Không tìm thấy danh mục có tên " + nameSearched);
                    } else {
                        cat.displayData();
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static int chooseAttributeToUpdate(Scanner sc) {
        while (true) {
            System.out.println("|-------ATTRIBUTE---------|");
            System.out.println("|1. Name                  |");
            System.out.println("|2. Import Price          |");
            System.out.println("|3. Export Price          |");
            System.out.println("|4. Title                 |");
            System.out.println("|5. Description           |");
            System.out.println("|6. Quantity              |");
            System.out.println("|7. Category Id           |");
            System.out.println("|8. Status                |");
            System.out.println("|0. Exit                  |");
            System.out.println("|-------------------------|");
            System.out.print("Enter your choice: ");
            int attributeName = Integer.parseInt(sc.nextLine());

            if (attributeName >= 0 && attributeName <= 7) {
                return attributeName;
            }
            System.out.println("Invalid choice");
        }
    }

    public static void showProductMenu(Scanner sc) {
        while (true) {
            System.out.println("************CATEGORY MENU************");
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên hoăc tiêu đề");
            System.out.println("6. Tìm kiếm sản phẩm theo khoảng giá bán");
            System.out.println("7. Sắp xếp sản phẩm theo giá bán tăng dần");
            System.out.println("8. Bán sán phẩm");
            System.out.println("9. Thống kê sản phẩm theo danh mục");
            System.out.println("10. Thoát");

            System.out.print("Your choice: ");
            byte choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    addProductInPresentation(sc);
                    break;
                case 3:
                    updateProductByIdInPresentation(sc);
                    break;
                case 4:
                    deleteProductByIdInPresentation(sc);
                    break;
                case 5:
                    searchProductByNameInPresentation(sc);
                    break;

                case 6:
                    searchProductByPriceInPresentation(sc);
                    break;

                case 7:
                    sortByExportPriceInPresentation();
                    break;
                case 8:
                    soldProduct(sc);
                    break;
                case 9:
                    break;
                case 10:
                    return;

            }
        }
    }

    private static void sortByExportPriceInPresentation() {
        sortByExportPrice();
        System.out.println("Danh sách sản phẩm sau khi sắp xếp:");
        showProducts();
    }

    private static void searchProductByNameInPresentation(Scanner sc) {
        System.out.print("Nhập tên hoặc tiêu đề sản phẩm: ");
        String name = sc.nextLine();
        searchCategoryByName(name);
    }

    private static void deleteProductByIdInPresentation(Scanner sc) {
        System.out.print("Nhập id của sản phẩm muốn xóa: ");
        String idSearched2 = sc.nextLine();
        boolean isDeleted = deleteProduct(idSearched2);
        if (isDeleted) {
            System.out.println("Đã xóa sản phẩm có id = " + idSearched2);
        } else {
            System.out.println("xóa ko thành công");
        }
    }

    private static void updateProductByIdInPresentation(Scanner sc) {
        System.out.print("Nhập id của sản phẩm muốn cập nhật: ");
        String idSearched1 = sc.nextLine();
        int attribute = chooseAttributeToUpdate(sc);
        boolean isUpdated = updateProduct(sc, idSearched1, attribute);
        if (isUpdated) {
            System.out.println("Đã cập nhật thành công");
        } else {
            System.out.println("cập nhật thất bại");
        }
    }

    private static void addProductInPresentation(Scanner sc) {
        Product product = new Product();
        product.inputData(sc);
        boolean isAdded = addProduct(product);

        if (isAdded) {
            System.out.println("Thêm spham thành công");
        } else {
            System.out.println("Thêm sản phẩm thất bại");
        }
        return;
    }

    private static void searchProductByPriceInPresentation(Scanner sc) {
        System.out.print("Nhập giá thấp nhất: ");
        float minExportPrice = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập giá cao nhất: ");
        float maxExportPrice = Float.parseFloat(sc.nextLine());

        Product[] validProduct = new Product[productsSize];
        int sizeOfValidProduct = searchProductByPrice(validProduct, minExportPrice, maxExportPrice);
        System.out.println("Các sản phẩm có giá bán từ " + minExportPrice + " đến " + maxExportPrice + " là:");
        for (int i = 0; i < sizeOfValidProduct; i++) {
            validProduct[i].displayData();
        }
    }

    private static void soldProduct(Scanner sc) {
        listProductNameAndQuantity();
        System.out.print("Nhập tên sản phẩm cần bán: ");
        String productName = sc.nextLine();
        System.out.println("Nhập so lượng muốn bán: ");
        int quantity = Integer.parseInt(sc.nextLine());
        int isSold = sellProduct(productName, quantity);
        if (isSold == 0) {
            System.out.println("Đã bán "+quantity+" sản phẩm: "+productName);
        } else if (isSold == 1) {
            System.out.println("Danh sách rỗng!");
        } else if (isSold == 2) {
            System.out.println("Không còn đủ số lượng sản phẩm");
        } else if (isSold == 3) {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }

    private static void listProductNameAndQuantity( ) {
        for (int i = 0; i < productsSize; i++) {
            System.out.println("- "+products[i].getProductName()+": "+products[i].getQuantity()+" sản phẩm");
        }
    }

    private static int getIdCategoryChoosed(Scanner sc, String title) {
        System.out.print(title + ": ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void inputDataCategory(Category category, Scanner sc) {
        category.inputData(sc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMainMenu();
            System.out.print("Your choice: ");
            byte choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    showCategoryMenu(sc);
                    break;
                case 2:
                    showProductMenu(sc);
                    break;
            }
        }
    }


}
