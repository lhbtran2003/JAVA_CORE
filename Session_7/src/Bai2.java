public class Bai2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello, Java World!");
        System.out.printf("%s\n", str.delete(5,9));
        System.out.printf("%s", str.replace(12,18,"Universe"));


    }
}
