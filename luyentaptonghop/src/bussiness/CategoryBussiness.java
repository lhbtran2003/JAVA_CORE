package bussiness;

import entity.Category;

public class CategoryBussiness {
    public static final Category [] categories = new Category[100];
    public static int size = 0;

    static {
       Category category = new Category(0, "Trái cây", 1, "Thơm ngon mọng nước", true);
       categories[size++] = category;
    }

    private static int[] extractIdsFromCategories () {
        int [] allIds = new int[size];
        for(int i = 0; i < size; i++) {
            allIds[i] = categories[i].getId();
        }
        return allIds;
    }

    private static int getMaxId() {
        int maxId = categories[0].getId();
        for(int i = 1; i < size; i++) {
            if(categories[i].getId() > maxId) {
                maxId = categories[i].getId();
            }
        }
        return maxId;
    }

    public static int getNextIdOfCategory() {
        return getMaxId() + 1;
    }

    public static boolean addCategory(Category category) {
        if (size == categories.length) {
            return false;
        }
        categories[size] = category;
        categories[size].setId(getMaxId());
        size++;
        return true;
    }
    public static void displayCategory() {
        for (int i = 0; i < size; i++) {
            categories[i].displayData();
        }
    }

    public static void main(String[] args) {

    }
}
