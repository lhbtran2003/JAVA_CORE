package entity;

import validate.ProductValidate;

import java.util.Scanner;

public class Product implements IApp {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private String productTitle;
    private String productDescription;
    private int quantity;
    private int categoryId;
    private int status;

    public Product() {}

    public Product(String productId, String productName, float importPrice, float exportPrice, String productTitle, String productDescription, int quantity, int categoryId, int status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    @Override
    public void inputData(Scanner sc) {
       productName = ProductValidate.inputProductName(sc);
       importPrice = ProductValidate.inputImportPrice(sc);
       exportPrice = ProductValidate.inputExportPrice(sc);
       productTitle = ProductValidate.inputTitle(sc);
       productDescription = ProductValidate.inputProductDescription(sc);
       categoryId = ProductValidate.inputCategoryId(sc);
       quantity = ProductValidate.inputQuantity(sc);
       status = ProductValidate.inputStatus(sc);
    }

    @Override
    public void displayData() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Export Price: " + exportPrice);
        System.out.println("Title: " + productTitle);
        System.out.println("Description: " + productDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category ID: " + categoryId);
        if (status == 0) {
            System.out.println("Status: " + "đang hoạt động.");
        } else if (status == 1) {
            System.out.println("Status: " + "hết hàng");
        } else {
            System.out.println("Status: " + "không hoạt đông");
        }
    }
}
