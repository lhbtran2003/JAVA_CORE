package bai4;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Hai đứa trẻ", "Hong biết", 150000);
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        book.setPrice(180000);
    }
}
