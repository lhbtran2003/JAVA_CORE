package bai4;

public class Book {
    private String title; // Tên sách.
    private String author; // Tác giả của sách.
    private int price; // Giá của sách.

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("Gía ko được là số âm");
            return;
        }
        this.price = price;
    }
}
