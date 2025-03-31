package ra.businessImp;

import ra.business.IProduct;
import ra.run.ProductManager;
import ra.validate.IdValidator;
import ra.validate.InputMethod;
import ra.validate.ProductValidator;
import static ra.run.ProductManager.*;

import java.util.Scanner;

public class Product implements IProduct {
    private int productId;
    private String productName;
    private String title;
    private String description;
    private float importPrice; // giá nhập
    private float exportPrice; // giá xuất
    private float interest; // lợi nhuận
    private Boolean productStatus; // trạng thái của sản phẩm

    public Product() {}

    public Product(int productId, String productName, String title, String description, float importPrice, float exportPrice, float interest, Boolean productSatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public Boolean getProductSatus() {
        return productStatus;
    }

    public void setProductSatus(Boolean productSatus) {
        this.productStatus = productSatus;
    }

    public float calculateInterest() {
        return exportPrice - importPrice;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        productId = IdValidator.getNextId(products, size);
        productName = ProductValidator.inputProductName(sc, size);
        title = InputMethod.inputString(sc, "Enter Product Title");
        description = InputMethod.inputString(sc, "Enter Product Description");
        importPrice = ProductValidator.inputImportPrice(sc);
        exportPrice = ProductValidator.inputExportPrice(sc, importPrice);
        productStatus = InputMethod.inputBoolean(sc, "Enter Product Status");
        interest = exportPrice - importPrice;
    }

    @Override
    public void displayData() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Description: " + description);
        System.out.println("Product Import Price: " + importPrice);
        System.out.println("Product Export Price: " + exportPrice);
        System.out.printf("Product Interest: %.1f\n" , interest);
        System.out.println("Product Satus: " + productStatus);
    }
}
