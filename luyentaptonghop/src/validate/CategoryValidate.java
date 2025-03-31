package validate;

import bussiness.CategoryBussiness;
import entity.Category;

import java.util.Scanner;

public class CategoryValidate {
    public static String inputCategoryName(Scanner sc) {
        while (true) {
            String catName = InputMethod.inputString(sc, "Enter category name: ");
            StringValidate validator = new StringValidate(50, 6);
            if (validator.isValid(catName)) {
                if (!isNameExited(catName)) {
                    return catName;
                }
                System.out.println("Category name is already in use");
            }
            System.out.println(validator.getErrorMessage());
        }
    }

    public static int inputPriority(Scanner sc) {
        while (true) {
            int priority = InputMethod.inputInt(sc, "Enter priority: ");
            if (priority > 0) {
                return priority;
            }
            System.out.println("Invalid priority");

        }
    }

    public static String inputCategoryDescription(Scanner sc) {
        while (true) {
            String desc = InputMethod.inputString(sc, "Enter category description: ");
            StringValidate validator = new StringValidate(255, 0);
            if (validator.isValid(desc)) {
                return desc;
            }
            System.out.println(validator.getErrorMessage());
        }
    }

    public static boolean inputStatus(Scanner sc) {
       return InputMethod.inputBoolean(sc, "Enter status");
    }

    private static boolean isNameExited(String catName) {
        for (Category category : CategoryBussiness.categories) {
            if (category != null && category.getCategoryName().equalsIgnoreCase(catName)) {
                return true;
            }
        }
        return false;
    }
}
