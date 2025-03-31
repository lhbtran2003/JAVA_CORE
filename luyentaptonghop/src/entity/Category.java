package entity;

import validate.CategoryValidate;

import java.util.Scanner;

public class Category implements IApp{
    private int id;
    String categoryName;
    private int priority;
    private String description;
    private boolean status;

    public Category() {
    }

    public Category(int id, String categoryName, int priority, String description, boolean status) {
        this.id = id;
        this.categoryName = categoryName;
        this.priority = priority;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc) {
        categoryName = CategoryValidate.inputCategoryName(sc);
        priority = CategoryValidate.inputPriority(sc);
        description = CategoryValidate.inputCategoryDescription(sc);
        status = CategoryValidate.inputStatus(sc);
    }

    @Override
    public void displayData () {
        System.out.println("Category ID: " + id);
        System.out.println("Category Name: " + categoryName);
        System.out.println("Priority: " + priority);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
    }
}
