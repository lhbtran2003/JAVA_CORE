public class Bai5 {
    public static void main(String[] args) {
        System.out.printf("+%s+\n", "-".repeat(26)); //28 ô

        System.out.printf("|%15s%s|\n","MENU", " ".repeat(11)); // 18 ô

        System.out.printf("+%s+\n", "-".repeat(26));

        System.out.printf("|%2s.%sĐăng nhập%s|\n","1", " ".repeat(1)," ".repeat(13));

        System.out.printf("|%2s.%sĐăng ký%s|\n","2", " ".repeat(1)," ".repeat(15));
        System.out.printf("|%2s.%sXem danh sách sản phẩm%s|\n","3", " ".repeat(1)," ".repeat(0));


    }
}
