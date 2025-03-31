package presentation;

import entity.Category;

import java.util.Scanner;
import static bussiness.CategoryBussiness.*;

public class ShopManagement {
    public static void showMainMenu() {
        System.out.println("************SHOP MENU************");
        System.out.println("1. Quản lí danh muc");
        System.out.println("2. Quản lí sản phẩm");
        System.out.println("3. Thoát");
    }

    public static void showCategoryMenu() {
        System.out.println("************CATEGORY MENU************");
        System.out.println("1. Danh sách danh mục");
        System.out.println("2. Thêm mới danh mục");
        System.out.println("3. Cập nhật danh mục");
        System.out.println("4. Xóa danh mục");
        System.out.println("5. Tìm kiếm danh mục theo tên");
        System.out.println("6. Thoát");
    }

    public static void showProductMenu() {
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
                    showCategoryMenu();
                    System.out.println("Your choice: ");
                    byte choiceInCategory = Byte.parseByte(sc.nextLine());
                    switch (choiceInCategory) {
                        case 1:
                            displayCategory();
                            break;
                        case 2:
                            Category category = new Category();
                            inputDataCategory(category, sc);
                            addCategory(category);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            return;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 2:
                    showProductMenu();
                    break;
            }
        }
    }


}
