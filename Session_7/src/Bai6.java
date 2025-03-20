public class Bai6 {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder stringBuilder = new StringBuilder("Hello");
        StringBuffer stringBuffer = new StringBuffer("Hello");

        long start1 = System.currentTimeMillis();
        stringBuilder.append("World".repeat(1000000));
        long end1 = System.currentTimeMillis();
        System.out.printf("Thời gian thực thi của string builder là: %d\n", end1 - start1);

        long start2 = System.currentTimeMillis();
        stringBuffer.append("World".repeat(1000000));
        long end2 = System.currentTimeMillis();
        System.out.printf("Thời gian thực thi của string buffer là: %d\n", end2 - start2);

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str = str.concat("World");
        }
        long end3 = System.currentTimeMillis();
        System.out.printf("Thời gian thực thi của string là: %d", end3 - start3);

    }
}
