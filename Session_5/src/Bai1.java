public class Bai1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Gía trị lớn nhất trong mảng là: %d", max);
    }
}
