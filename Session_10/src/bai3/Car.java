package bai3;

import java.time.LocalDate;

public class Car {
    private String make; // Thương hiệu của xe (Ví dụ: "Toyota", "Honda").
    private String model; // Mẫu xe (Ví dụ: "Corolla", "Civic").
    private String year; // Năm sản xuất của xe.

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        LocalDate ld = LocalDate.now();
        int yearNow = ld.getYear();
        if (Integer.parseInt(year) > yearNow) {
            System.out.println("Năm nhập vào ko được lớn hơn năm hiện tại");
            return;
        }
        this.year = year;
    }
}
