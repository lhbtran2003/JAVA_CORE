package bussiness;

import entity.Category;

import java.util.Scanner;

public class CategoryBussiness {
    public static final Category[] categories = new Category[100];
    public static int categoriesSize = 0;

    static {
        Category category = new Category(0, "Trái cây", 1, "Thơm ngon mọng nước", true);
        categories[categoriesSize++] = category;
    }


    private static int getMaxId() {
        int maxId = categories[0].getId();
        for (int i = 1; i < categoriesSize; i++) {
            if (categories[i].getId() > maxId) {
                maxId = categories[i].getId();
            }
        }
        return maxId;
    }

    public static int getNextIdOfCategory() {
        return getMaxId() + 1;
    }

    public static boolean addCategory(Category category) {
        if (categoriesSize == categories.length) {
            return false;
        }
        categories[categoriesSize] = category;
        categories[categoriesSize].setId(getNextIdOfCategory());
        categoriesSize++;
        return true;
    }

    public static void showCategories() {
        for (int i = 0; i < categoriesSize; i++) {
            categories[i].displayData();
        }
    }

    public static void updateCategory(Scanner sc, int id) {
        if (!isCategoryExist(id)) {
            System.out.println("Danh mục ko tồn tại");
            return;
        }
        for (int i = 0; i < categoriesSize; i++) {
            if (categories[i].getId() == id) {

                System.out.print("Nhập mục muốn chỉnh sửa (name, priority, description, status): ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "name":
                        System.out.print("Nhập tên mới cho danh mục: ");
                        categories[i].setCategoryName(sc.nextLine());
                        System.out.println("Đã thay đổi tên danh mục.");
                        break;

                    case "priority":
                        System.out.println("Nhập độ ưu tiên mới: ");
                        categories[i].setPriority(Integer.parseInt(sc.nextLine()));
                        System.out.println("Đã thay đổi độ ưu tiên danh mục.");
                        break;

                    case "description":
                        System.out.print("Nhập mô tả mới cho danh mục: ");
                        categories[i].setDescription(sc.nextLine());
                        System.out.println("Đã thay đổi mô tả danh mục.");
                        break;

                    case "status":
                        categories[i].setStatus(!categories[i].getStatus());
                        System.out.println("Đã thay đổi trạng thái danh mục.");
                        break;
                }
            }
        }

    }

    public static boolean deleteCategory(int id) {
        if (!isCategoryExist(id)) {
            System.out.println("Danh mục ko tồn tại");
            return false;
        }
        for (int i = 0; i < categoriesSize - 1; i++) {
            if (categories[i].getId() == id) {
                categories[i] = categories[i+1];
            }
        }
        categories[categoriesSize] = null;
        categoriesSize--;
        return true;
    }

    public static Category searchCategoryByName(String name) {
        for (int i = 0; i < categoriesSize; i++) {
            if (categories[i].getCategoryName().contains(name)) {
                return categories[i];
            }
        }
        return null;
    }
    public static boolean isCategoryExist(int id) {
        for (int i = 0; i < categoriesSize; i++) {
            if (categories[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

}
