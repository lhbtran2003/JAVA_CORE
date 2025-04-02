import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        int [] originalArray = {23,44,55,66,23,32,54,55,66};
        int [] markingArray  = new int[originalArray.length];
        Integer[] passArray = new Integer[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            boolean isExist = false;
            // xử lí mảng passArray
            for(Integer value : passArray){
                if (value!=null && value == originalArray[i]){
                    isExist = true;
                }
            }
            if(isExist){
                continue;
            }

            // xử lí đến mảng markingArray
            int count = 0;
            for (int value: originalArray) {
                if (originalArray[i] == value ) {
                    count++;
                }
            }

            passArray[i] = originalArray[i];
            markingArray[i] = count;
        }

        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(passArray));
        System.out.println(Arrays.toString(markingArray));


        int max = markingArray[0];
        for (int i = 1; i < markingArray.length; i++) {
            if (markingArray[i] > max) {
                max = markingArray[i];
            }
        }


        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == max) {
                System.out.printf("Phần tử %d xuất hiện %d lần\n ", originalArray[i], max);
            }
        }

    }
}
