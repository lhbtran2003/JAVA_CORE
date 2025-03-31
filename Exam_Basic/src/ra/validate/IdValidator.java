package ra.validate;

import ra.businessImp.Product;

import java.util.ArrayList;
import java.util.List;

public class IdValidator {

    // tách các id thành 1 mảng riêng
    public static int[] extractIdsFromObjs(Product[] arr, int size) {
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = arr[i].getProductId();
        }
        return list;
    }

    // trả về id lớn nhất trong mảng vừa tách
    public static int getMaxId(Product[] arr, int size) {
        int[] allIds = extractIdsFromObjs(arr, size);
        int maxId = allIds[0];

        for (int i = 1; i < allIds.length; i++) {
            if (allIds[i] > maxId) {
                maxId = allIds[i];
            }
        }
        return maxId;
    }

    public static int getNextId(Product[] arr, int size) {
        int maxId = getMaxId(arr, size);
        return maxId + 1;
    }
}
