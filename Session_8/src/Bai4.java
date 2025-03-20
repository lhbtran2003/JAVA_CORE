public class Bai4 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000); // Chuỗi 1 triệu ký tự

        StringBuilder sb = new StringBuilder(initialString);
        StringBuffer sf = new StringBuffer(initialString);

        long start, end;

        // Đảo ngược chuỗi
        start = System.nanoTime();
        sb.reverse();
        end = System.nanoTime();
        System.out.println("StringBuilder - Đảo ngược: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sf.reverse();
        end = System.nanoTime();
        System.out.println("StringBuffer - Đảo ngược: " + (end - start) / 1_000_000.0 + " ms");

        // Chèn chuỗi con
        start = System.nanoTime();
        sb.insert(500000, "INSERT");
        end = System.nanoTime();
        System.out.println("StringBuilder - Chèn: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sf.insert(500000, "INSERT");
        end = System.nanoTime();
        System.out.println("StringBuffer - Chèn: " + (end - start) / 1_000_000.0 + " ms");

        // Xóa một đoạn chuỗi
        start = System.nanoTime();
        sb.delete(400000, 400010);
        end = System.nanoTime();
        System.out.println("StringBuilder - Xóa: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sf.delete(400000, 400010);
        end = System.nanoTime();
        System.out.println("StringBuffer - Xóa: " + (end - start) / 1_000_000.0 + " ms");

        // Thay thế một đoạn chuỗi
        start = System.nanoTime();
        sb.replace(300000, 300010, "REPLACED");
        end = System.nanoTime();
        System.out.println("StringBuilder - Thay thế: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sf.replace(300000, 300010, "REPLACED");
        end = System.nanoTime();
        System.out.println("StringBuffer - Thay thế: " + (end - start) / 1_000_000.0 + " ms");
    }
}
